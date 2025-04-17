import React from "react";

function App() {
  const array = [
    {id : 1, value : true},
    {id : 2, value : true},
    {id : 3, value : false},
  ];
  let nextArray = array.concat({id : 4, value : true}, {id : 5, value : true});
  const next = nextArray.filter(item => item.id !== 2);
  const yell = next.map(item => (item.id === 1 ? {...item, value : false} : item));
  console.log("yell", yell);
  return (
    <>    
      <h1>[Quiz]</h1>
      {yell.map(ite =>(<p key={ite.id}>id = {ite.id},  value = {ite.value.toString()}</p>))}
    </>
  )
}

export default App;
