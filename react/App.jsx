import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [number, setNumber] = useState(0);
  const [light, setLight] = useState(0);
  return (
    <>  
      <h1>[Quiz] State</h1>
      <h2 style = {light % 2 === 0 ?
        {backgroundColor : "#ffcc00"} : 
        {backgroundColor : "gray"}}>
          {light % 2 == 0 ? "ON" : "OFF"}</h2>
      <button onClick={() => 
        {setLight(light + 1)}}>
        {light % 2 == 0 ? "끄기" : "켜기" }
      </button>
      <h2>{number}</h2>
      <button onClick={()=>
        {setNumber(number+1)}}>+</button>
    </>
  )
}

export default App;
