import React from 'react';
import './mainpage.css'
import { BrowserRouter as Router,
    Routes,
    Route,
    Link 
} from "react-router-dom"


import Index from '../Index/Index';
import Genre from '../Genre/Genre';
import NewBook from '../NewBook/NewBook';
import BestSeller from '../BestSeller/BestSeller';
import About from '../About/About';
import EpicSeven from '../EpicSeven/EpicSeven';

export default function MainPage(){
    return(
        <Router>
            <header className ="navbar">
                <div><Link to = "/" className='logo'>영중 책방</Link></div>
                    <ul className='menu'>
                        <li><Link to="/Genre">장르</Link></li>
                        <li><Link to="/NewBook">신간도서</Link></li>
                        <li><Link to="/BestSeller">인기도서</Link></li>
                        <li><Link to="/About">About</Link></li>
                        <li><Link to="/EpicSeven">Epic Seven</Link></li>
                    </ul>
            </header>

                <main>
                    <Routes>
                        <Route path='/' element={<Index />} />
                        <Route path='/Genre' element={<Genre />} />
                        <Route path='/NewBook' element={<NewBook />} />
                        <Route path='/BestSeller' element={<BestSeller />} />
                        <Route path='/About' element={<About />} />
                        <Route path='/Epicseven' element={<EpicSeven />} />
                    </Routes>
                </main>
            <footer className="footer">
                <div className="footer-info">
                    <p>동양미래대학교 컴퓨터소프트웨어학과</p>
                    <p>20221053 김영중</p>
                </div>
                <div className='footer-sub'>
                    <p>웹프런트앤드 프로젝트</p>
                </div>
                <button className="scroll-top-btn" onClick={() => window.scrollTo({ top: 0, behavior: 'smooth' })}>↑</button>
            </footer>
        </Router>  
            )   
}