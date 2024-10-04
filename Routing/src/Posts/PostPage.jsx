import { useState, useEffect } from "react";
import Pagination from "./Pagination.jsx";
import Posts from "./Posts.jsx";
import axios from "axios";
import "../App.css";
// import Nav from "../Nav.jsx";

function PostPage() {
  const [records, setRecords] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const [postsPerPage] = useState(6);

  useEffect(() => {
    axios
      .get("https://fakestoreapi.com/products")
      .then((response) => setRecords(response.data))
      .catch((err) => console.log(err));
  }, [postsPerPage]);

  const indexOfLastPost = currentPage * postsPerPage;
  const indexOfFirstPost = indexOfLastPost - postsPerPage;
  const currentPosts = records.slice(indexOfFirstPost, indexOfLastPost);

  const paginate = (pageNumber) => setCurrentPage(pageNumber);
  return (
    <>
      {/* <div>
        <Nav />
      </div><br /> */}
      <Posts posts={currentPosts} />
      <div
        className="container mt-5 "
        style={{ width: "80%", height: "20vh", alignItems: "center" }}
      >
        <Pagination 
          postsPerPage={postsPerPage}
          totalPosts={records.length}
          paginate={paginate}
        />
      </div>
    </>
  );
}

export default PostPage;
