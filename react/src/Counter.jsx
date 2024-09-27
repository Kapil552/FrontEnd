import { useState } from "react";
function Counter(){
var[val, setValue]=useState(0);

      const increCounter=()=>{
        if(val>=0){
            val++;
            setValue(val);
        }
      }

      const decreCounter=()=>{
        if(val>0){
            val--;
            setValue(val);
        }
      }

      const resetCounter=()=>{
            val=0;
            setValue(val);
      
      }

      return (
        <> 
            <h1>{val}</h1>
            <button id="btn1" type="submit" onClick={increCounter}>Counter++</button>
            <button id="btn2" type="submit" onClick={decreCounter}>Counter--</button>
            <button id="btn3" type="submit" onClick={resetCounter}>Reset-Counter</button>
        </>
      );
    }

    export default Counter;