import React from "react";
import "./Todo.css";
import Nav from "../Nav"


import { useState, useEffect } from "react";

export default function Todolist() {
  const [todoList, setToDoList] = useState([]);

  let addToDoList = (event) => {
    let toname = event.target.toname.value.toUpperCase();

    if (!todoList.includes(toname)) {
      let finalToDolist = [...todoList, toname];
      setToDoList(finalToDolist);
    } else {
      alert("ToDo name already exist");
    }

    event.preventDefault();
  };

  let list = todoList.map((value, index) => {
    return (
      <TodoListItems
        value={value}
        key={index}
        indexNumber={index}
        todoList={todoList}
        setToDoList={setToDoList}
      />
    );
  });
  return (
    <div className="test">
     
      <br />
      <h1 style={{ color: "brown", textAlign: "left", paddingLeft: "20%" }}>
        <u>ToDo List</u>
      </h1>
      <form onSubmit={addToDoList} style={{marginLeft:"3.4%"}}>
        <input type="text" name="toname" />&nbsp;&nbsp;&nbsp;&nbsp;<button>Save</button>
      </form>
      <div className="outerdiv">
        <ul>{list}</ul>
      </div>
    </div>
  );
}


function TodoListItems({value, indexNumber, todoList, setToDoList}){
    let [status, setStatus]=useState(false);
    
    let handleDelete=(indexNumber)=>{
        if(window.confirm("Are you sure upo want to delete this")){
            let  finalList=todoList.filter((v,i)=>i!=indexNumber)
            setToDoList(finalList);
        }
    }
    
    let checkStatus=()=>{
        setStatus(!status);
    }
    
    return(
        <>
        <li  className={(status)?'complete':''}  onClick={checkStatus}>{indexNumber+1} . {value}<span id="popup" onClick={()=> handleDelete(indexNumber)}>&times;</span>
        </li>
      </>


)
}

