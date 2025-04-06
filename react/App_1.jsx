import React from 'react';
import Body from './components/Body';

export default function App() {
  const BodyProps ={
    name : "홍길동" ,
    location : "서울",
    favorList : ["파스타", "빵"] ,
  };
  

  return (
    <>
      <h1>[예제] 스프레드 연산자</h1>
      <Body {...BodyProps} />
    </>
  )
};
