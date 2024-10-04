import Crud from "./Crud/Crud";
import "./App.css";
import "./TodoList/Todo.css";
import { Route, Routes } from "react-router-dom";
import Todolist from "./TodoList/Todolist";
import PostPage from "./Posts/PostPage";
import ColorSchemesExample from "./ColorSchemesExample";
import HomePage from "./HomePage";
import Nav from "./Nav";

function App() {
  return (
    <>
      <Nav/>
    <Routes>
      <Route caseSensitive path="/Todolist" element={<Todolist/>}/>
      <Route caseSensitive path="/Crud" element={<Crud />}/>
      <Route caseSensitive path="/Post" element={<PostPage />}/>
      <Route caseSensitive path="/NavBar" element={<ColorSchemesExample />}/>
      <Route caseSensitive path="/home" element={<HomePage />}/>
    </Routes>
    </>
  );
}

export default App;
