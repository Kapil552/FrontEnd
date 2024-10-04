import React from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import { NavLink } from 'react-router-dom';


function ColorSchemesExample() {
  return (
    <>
          {/* <Navbar bg="dark" data-bs-theme="dark"> */}
        <Container >
          {/* <Navbar.Brand href="/home" style={{alignItems:"flex-start" , fontSize:"40px"}}>Home</Navbar.Brand> */}
          <Nav className="me-auto" style={{justifyContent:"right",  fontSize:"20px" ,fontFamily:"sans-serif" }}>
            <NavLink to="/home" style={{color:"white", textDecoration:"none", margin:"15px"}}>Home</NavLink>
            <NavLink  to="/Todolist" style={{color:"white", textDecoration:"none", margin:"15px"}}>TodoList</NavLink>
            <NavLink  to="/Crud" style={{color:"white", textDecoration:"none", margin:"15px"}}>Crud</NavLink>
            <NavLink  to="/Post" style={{color:"white", textDecoration:"none", margin:"15px"}}>Posts</NavLink>
            

          </Nav>
        </Container>
      {/* </Navbar> */}
      <br />
 

      
    </>
  );
}

export default ColorSchemesExample;
