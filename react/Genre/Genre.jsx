// ./src/pages/HomePage/HomePage.jsx

import './genre.css'
import { BookGenre } from '../../database/BookGenre';
import {
    Routes,
    Route,
    Link 
} from "react-router-dom"
import Art from './Art';
import Fehak from './Fehak';
import Money from './Money';
import Novel from './Novel';
import Science from './Science';


function Genre() {
    return (
            <div>
                <h1 className='title'>장르를 선택하세요!</h1>
                <br />
                    <ul className='product-list'>
                        {BookGenre.map(item=><div key={item.id}>
                            <div>
                                <p className='p-font'><Link to={item.Link}>{item.genre}</Link></p>
                                <Link to={item.Link}><img src={item.bookImg} alt="img1" /></Link>   
                            </div>
                        </div>
                        )}
                    </ul>
                    <Routes>
                        <Route path='/Art' element={<Art />} />
                        <Route path='/Art' element={<Fehak />} />
                        <Route path='/Art' element={<History />} />
                        <Route path='/Art' element={<Money />} />
                        <Route path='/Art' element={<Novel />} />
                        <Route path='/Art' element={<Science />} />
                    </Routes>
            </div>
    );
}            
export default Genre;
