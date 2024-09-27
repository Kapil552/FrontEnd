import { useState } from "react";

var i=0;
function Color(){
        var[color, setColor]=useState("red");
        const colorarr=["violet", "indigo", "blue", "green", "yellow", "orange", "red"];

    const color1=()=>{
        if(i<colorarr.length){
        color = colorarr[i] ;
        setColor(color);
        i++;
        }
    }
    return (
    <>
        <h1>{color}</h1>
        <button onClick={color1}>Change</button>
    </>
    );
    }

export default Color;