import React from 'react';
import { useState } from 'react';
import './App.css';
import Header from './W03/Header';
import Skill from './W03/Skill';
import Career from './W03/Career';
import Reward from './W03/Reward';



function App() {
  const obj_a = {
    color : "green",
  }
  const obj = {a : 1}
  return (
    <div>
      <h1>이력서</h1>
      <h2>개인정보</h2>
      <Header name = "김영중" phone ="010-2929-4432" email="Yura034030@gmail.com"/>
      <Skill contents = "어느정도의 react jsx의 문법을 다룰 수 있습니다."/>
      <Career content_1 = "학력사항" content_2 = "학력 내용"/>
      <Career content_1 = "학력사항" content_2 = "경력 내용"/>
      <Reward content = "none/null"/>
      <p style = {obj_a}>{obj.a}</p>
      <p className = "style_1">AA</p>
    </div>
  )
}

export default App

