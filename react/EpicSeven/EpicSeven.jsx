import { useEffect, useState } from "react"
import { useLocation } from "react-router-dom"
import axios from "axios"

export default function BlogDetail() {
  const location = useLocation()
  // console.log(location)
  const postNumber = location.pathname.split('/')[2]
  const [post, setPost] = useState(undefined)

  useEffect(()=>{
        axios 
        .get('http://localhost:3000/posts')
        .then(games => {setPost(games.data)})
        .catch(()=>{setPost(null)})
  }, [postNumber])

  // console.log(post)
  
  return (
    <div>
      {post === undefined ? <div>로딩중..</div> : 
      post === null ? <div>404</div> :
        <div>
            {games.map((item)=> {
                <div key={item.id}> 
                    <img src = {item.img} alt={item.title} />
                    <p>{item.title}</p>
                </div>})}
        </div>}
    </div>
  )
}