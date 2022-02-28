import React from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import StartContainer from './StartContainer';
import GameContainer from './GameContainer';
import QuizContainer from './QuizContainer';


const MainContainer = () => {

        
  return (

    <Router>
        <Routes>
            <Route path = "/start" element={<StartContainer/>}/>
            <Route path = "/quiz" element={<QuizContainer/>}/>
            <Route path = "/game" element={<GameContainer/>}/>
        </Routes>
    </Router>

  );
}

export default MainContainer;
