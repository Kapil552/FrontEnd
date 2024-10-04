// src/HomePage.js
import React from "react";


const HomePage = () => {
  return (
    <div style={{ fontFamily: "Arial, sans-serif" }}>
      {/* Navigation Bar */}
        

      {/* Hero Section */}
      <header style={styles.hero}>
        <h2 style={styles.heroTitle}>Welcome to My Homepage</h2>
        <p style={styles.heroSubtitle}>
          Discover amazing features and content.
        </p>
        <button style={styles.heroButton}>Get Started</button>
      </header>

      {/* Features Section */}
      <section id="features" style={styles.features}>
        <h2 style={styles.sectionTitle}>Features</h2>
        <div style={styles.featureCards}>
          <div style={styles.card}>
            <h3>Todo_List</h3>
            <p>
              Welcome to our Todo List app—a simple yet powerful tool designed
              to help you manage your tasks efficiently.
            </p>
          </div>
          <div style={styles.card}>
            <h3>CRUD_Operations</h3>
            <p>Short description of feature 2.</p>
          </div>
          <div style={styles.card}>
            <h3>Feature 3</h3>
            <p>Short description of feature 3.</p>
          </div>
        </div>
      </section>

      {/* Footer */}
      <footer style={styles.footer}>
        <p>&copy; 2024 My Website. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default HomePage;
const styles = {
  nav: {
    backgroundColor: "#333",
    color: "#fff",
    display: "flex",
    justifyContent: "space-between",
    padding: "1rem 2rem",
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