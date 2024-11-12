package com.user.security;

import java.io.IOException;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{

	private Logger logger = LoggerFactory.getLogger(OncePerRequestFilter.class);
	
    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserDetailsService userDetailsService;
	
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Extracting the Authorization header from the request
        String requestHeader = request.getHeader("Authorization");

        logger.info("Authorization Header: {}", requestHeader);

        String username = null;
        String token = null;

        // Check if the Authorization header is present and starts with "Bearer "
        if (requestHeader != null && requestHeader.startsWith("Bearer ")) {
            // Extract the token from the Authorization header
            token = requestHeader.substring(7);

            try {
                // Get the username from the token
                username = this.jwtHelper.getUsernameFromToken(token);

                // Validate the token
                if (username != null && !this.jwtHelper.isTokenExpired(token)) {
                    // If token is valid, authenticate the user
                    authenticateUser(username, token, request);
                } else {
                    logger.info("JWT Token is either expired or invalid.");
                }

            } catch (IllegalArgumentException e) {
                logger.error("Illegal Argument while fetching the username from token.", e);
            } catch (ExpiredJwtException e) {
                logger.warn("JWT Token is expired.", e);
            } catch (MalformedJwtException e) {
                logger.error("JWT Token is malformed.", e);
            } catch (JwtException e) {
                logger.error("JWT Token is invalid.", e);
            } catch (Exception e) {
                logger.error("An error occurred while processing the JWT token.", e);
            }
        } else {
            logger.info("Authorization header is missing or doesn't start with 'Bearer '");
        }


        //
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {


            //fetch user detail from username
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
            Boolean validateToken = this.jwtHelper.validateToken(token, userDetails);
            if (validateToken) {

                //set the authentication
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);


            } else {
                logger.info("Validation fails !!");
            }


        }

        filterChain.doFilter(request, response);

	}
    
    private void authenticateUser(String username, String token, HttpServletRequest request) {
        // You can create your authentication object here and set it in the SecurityContext
        // This could involve loading user details from a service and validating the JWT

        if (username != null) {
            // You can create a custom Authentication object and populate it with the username
            // and other JWT-related claims as authorities or details.

            // Example (if you're using Spring Security):
            // UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
            // UsernamePasswordAuthenticationToken authentication = 
            //     new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            // SecurityContextHolder.getContext().setAuthentication(authentication);

            logger.info("User {} is authenticated successfully", username);
        }
    }
}
