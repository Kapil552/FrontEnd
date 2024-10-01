import React from "react";
import { useState } from "react";
import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";

const Posts = ({ posts }) => {
  const [show, setShow] = useState(false);
  const [showData, setData] = useState({});

  const handleClose = () => setShow(false);

  const showDetails = (id) => {
    setShow(true);

    fetch(`https://fakestoreapi.com/products/${id}`)
      .then((result) => result.json())
      .then((resp) => {
        setData(resp);
        console.log(api_data);
        //alert(api_data.title)
      });
  };
  return (
    // <div id="test" className="row">
    //   {posts.map((values) =>(
    //     <div class="col-sm-4" style={{ height: "500px" }}>
    //       <div
    //         class="card"
    //         style={{ height: "400px", blockSize: "fit-content" }}
    //       >
    //         <div class="card-body" style={{ paddingLeft: "20px" }}>
    //           <img
    //             class="card-img-top "
    //             style={{ height: "150px", width: "100px" }}
    //             src={values.image}
    //             alt="Card image cap"
    //           />
    //           <div class="card-body">
    //             <h5 class="card-title">title : {values.title}</h5>
    //             <p class="card-text">
    //             </p>
    //             <p class="card-text">$ : {values.price}</p>

    //             <Button variant="primary" onClick={()=>showDetails(values.id)}>
    //              buy
    //             </Button>
    //           </div>
    //         </div>
    //       </div>
    //     </div>

    //   ))}
    //   <Modal show={show} onHide={handleClose}>
    //     <Modal.Header closeButton>
    //       <Modal.Title>{showData.title}</Modal.Title>
    //     </Modal.Header>
    //     <img src={showData.image} style={{height:"150px", width:"120px"}} alt="" />
    //     <Modal.Body>{showData.description}</Modal.Body>
    //     <Modal.Body>$ :{showData.price}</Modal.Body>

    //     <Modal.Footer>
    //       <Button variant="secondary" onClick={handleClose}>
    //         Close
    //       </Button>

    //     </Modal.Footer>
    //   </Modal>
    // </div>
    <div class="container noselect" style={{width:"40%",  height:"50vh"}}>
      {posts.map((values) =>(
      <div class="canvas">
        <div class="tracker tr-1"></div>
        <div class="tracker tr-2"></div>
        <div class="tracker tr-3"></div>
        <div class="tracker tr-4"></div>
        <div class="tracker tr-5"></div>
        <div class="tracker tr-6"></div>
        <div class="tracker tr-7"></div>
        <div class="tracker tr-8"></div>
        <div class="tracker tr-9"></div>
        <div class="tracker tr-10"></div>
        <div class="tracker tr-11"></div>
        <div class="tracker tr-12"></div>
        <div class="tracker tr-13"></div>
        <div class="tracker tr-14"></div>
        <div class="tracker tr-15"></div>
        <div class="tracker tr-16"></div>
        <div class="tracker tr-17"></div>
        <div class="tracker tr-18"></div>
        <div class="tracker tr-19"></div>
        <div class="tracker tr-20"></div>
        <div class="tracker tr-21"></div>
        <div class="tracker tr-22"></div>
        <div class="tracker tr-23"></div>
        <div class="tracker tr-24"></div>
        <div class="tracker tr-25"></div>
        <div id="card" >
          <img src={values.image} style={{width:"100%",  height:"100%"}}/>
          <div class="title">
            <h1 style={{fontSize:"25px"}}>{values.title}</h1>
            <p style={{fontSize:"15px"}}>{values.description}</p><br />
            <button class="btn btn-dark">Buy</button>
          </div>
        </div>
      </div>
      ))}
    </div>
  );
};

export default Posts;
