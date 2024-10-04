import React from "react";
import ColorSchemesExample from "./ColorSchemesExample";

function Nav(){
return(

<nav style={styles.nav} bg="dark" data-bs-theme="dark">
    <ColorSchemesExample style={{ width: "100%" }} />
</nav>
)

}

  export default Nav;

  const styles = {
    nav: {
      backgroundColor: "#333",
      color: "#fff",
      display: "flex",
      justifyContent: "space-between",
      padding: "1rem 2rem",
      width: "100%"
    },
    logo: {
      fontSize: "1.5rem",
    },
    navLinks: {
      display: "flex",
      gap: "1.5rem",
    },
    navLink: {
      color: "#fff",
      textDecoration: "none",
    },
    hero: {
      backgroundColor: "#007bff",
      color: "#fff",
      padding: "3rem 2rem",
      textAlign: "center",
    },
    heroTitle: {
      fontSize: "2.5rem",
      margin: "0.5rem 0",
    },
    heroSubtitle: {
      fontSize: "1.25rem",
    },
    heroButton: {
      marginTop: "1rem",
      padding: "0.75rem 1.5rem",
      fontSize: "1rem",
      backgroundColor: "#fff",
      color: "#007bff",
      border: "none",
      borderRadius: "5px",
      cursor: "pointer",
    },
    features: {
      padding: "2rem",
      textAlign: "center",
    },
    sectionTitle: {
      fontSize: "2rem",
      marginBottom: "1.5rem",
    },
    featureCards: {
      display: "flex",
      justifyContent: "space-around",
      flexWrap: "wrap",
    },
    card: {
      backgroundColor: "#f9f9f9",
      border: "1px solid #ddd",
      borderRadius: "5px",
      padding: "1.5rem",
      width: "30%",
      margin: "1rem 0",
    },
    footer: {
      textAlign: "center",
      padding: "1rem",
      backgroundColor: "#333",
      color: "#fff",
    },
  };