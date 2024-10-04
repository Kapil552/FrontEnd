import React from 'react'
import { useEffect, useState } from "react";
import EmployeeData from "./EmployeeData";
import Nav from "../Nav";


function Crud() {

  const [data, setData] = useState([]);
  const [firstName, setfirstName] = useState("");
  const [lastName, setlastName] = useState("");
  const [age, setAge] = useState(0);
  const [id, setId] = useState(0);
  const [isUpdate, setUpdate] = useState(false);


  useEffect(() => {
    setData(EmployeeData);
  }, []);

  const handleEdit = (id) => {
    const dt = data.filter((item) => item.id === id);
    if (dt !== undefined) {
      setUpdate(true);
      setId(dt[0].id);
      setfirstName(dt[0].firstName);
      setlastName(dt[0].lastName);
      setAge(dt[0].age);
    }
  };

  const handleDelete = (id) => {
    if (id > 0) {
      if (window.confirm("Are you sure to delete this")) {
        const dt = data.filter((item) => item.id !== id);
        setData(dt);
      }
    }
  };

  const handleSave = (e) => {
  
    let error = "";

    if (firstName === "") error += "First name is required...,";

    if (lastName === "") error += "Last name is required...,";

    if (age <= 0) error += "Age is required...,";

    if (error === "") {
      e.preventDefault();
      const dt = [...data];
      const newObject = {
        id: EmployeeData.length + 1,
        firstName: firstName,
        lastName: lastName,
        age: age,
      };

      dt.push(newObject);
      setData(dt);
    } else {
      alert(error);
    }
  };

  const handleUpdate = () => {
    const index = data
      .map((item, index) => {
        return item.id;
      })
      .indexOf(id);

    const dt = [...data];
    dt[index].firstName = firstName;
    dt[index].lastName = lastName;
    dt[index].age = age;

    setData(dt);
    handleClear();
  };

  const handleClear = () => {
    setId(0);
    setfirstName("");
    setlastName("");
    setAge("");
    setUpdate(false);
  };

  return (
    <div className="App">
      <h1 style={{color:"brown"}}><u>CRUD</u></h1><br />
      <div
        style={{
          display: "flex",
          justifyContent: "center",
          marginBottom: "10px",
          marginTop: "10px",
        }}
      >
        <div>
          <label style={{marginRight:"20px"}}>
            First Name :
            <input style={{marginLeft:"10px"}}
              type="text"
              placeholder="Enter First Name"
              onChange={(e) => setfirstName(e.target.value)}
              value={firstName}
            />
          </label>
        </div>

        <div>
          <label style={{marginRight:"20px"}}>
            Last Name :
            <input style={{marginLeft:"10px"}}
              type="text"
              placeholder="Enter Last Name"
              onChange={(e) => setlastName(e.target.value)}
              value={lastName}
            />
          </label>
        </div>

        <div>
          <label style={{marginRight:"20px"}}>
            Age :
            <input style={{marginLeft:"10px"}}
              type="text"
              placeholder="Enter Age"
              onChange={(e) => setAge(e.target.value)}
              value={age}
            />
          </label>
          &nbsp;
        </div>

        <div>
          {!isUpdate ? (
            <button className="btn btn-primary" onClick={(e) => handleSave(e)}>
              Save
            </button>
          ) : (
            <button className="btn btn-primary" onClick={() => handleUpdate()}>
              Update
            </button>
          )}
          &nbsp;
          <button className="btn btn-danger" onClick={() => handleClear()}>
            Clear
          </button>
        </div>
      </div>

      <table className="table table-hover">
        <thead>
          <tr>
            <td>Id</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Age</td>
            <td>Actions</td>
          </tr>
        </thead>
        <tbody>
          {data.map((item, index) => (
            <tr key={index}>
              <td>{item.id}</td>
              <td>{item.firstName}</td>
              <td>{item.lastName}</td>
              <td>{item.age}</td>
              <td>
                <button
                  className="btn btn-primary"
                  onClick={() => handleEdit(item.id)}
                >
                  Edit
                </button>
                &nbsp;
                <button
                  className="btn btn-danger"
                  onClick={() => handleDelete(item.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
  
}

export default Crud
