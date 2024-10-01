import { useState,useEffect } from "react";
import Pagination from "./Pagination.jsx";
import Posts from "./Posts.jsx";
import axios from "axios"
import "./App.css";

function App() {
  const [records, setRecords] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const [postsPerPage] = useState(6);
  useEffect(() => {
    axios
      .get("https://fakestoreapi.com/products")
      .then((response) => setRecords(response.data))
      .catch((err) => console.log(err));
    console.log("sjkfdhsdjkfhdfjkdsh");
  }, [postsPerPage]);


  const indexOfLastPost = currentPage * postsPerPage;
  const indexOfFirstPost = indexOfLastPost - postsPerPage;
  const currentPosts = records.slice(indexOfFirstPost, indexOfLastPost);

  const paginate = (pageNumber) => setCurrentPage(pageNumber);
  return (
    <>
      <div className="container mt-5" >
        <h1 className="text-primary mb-3" >My Blog</h1>
        <Pagination
          postsPerPage={postsPerPage}
          totalPosts={records.length}
          paginate={paginate}
        />
        <Posts posts={currentPosts} />
      </div>
    </>
  );
}

export default App;