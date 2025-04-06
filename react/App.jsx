import React from 'react';
import Body from './components/Body';
import Counter from './components/Counter';



export default function App() {

    const animals = ["기린 ", "사자 "];
    const anotheranimals = [...animals, "고양이 "];
    const sin = {
      name : "YJ",
      location : "where",
      favorList : ["김치", "피자"]
    };
  return (
    <>
     <h1>카운터</h1>
     <p>{anotheranimals}</p>
     <Counter />
     <Body {...sin}/>
    </>
  )
};
