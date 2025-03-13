import './App.css'

function Privacy(props){
  return (
    <section>
      <h2>개인정보</h2>
      <p>이름 : {props.name}</p>
      <p>전화번호 : {props.phone}</p>
      <p>이메일 : {props.email}</p>
    </section>
  );
}

function App() {
  return (
    <>
      <h1>이력서</h1>
      <Privacy 
      name = "김영중"
      phone = "010-2929-4432"
      email = "hong@gmail.com"
      />
    </>
  )
}

export default App
