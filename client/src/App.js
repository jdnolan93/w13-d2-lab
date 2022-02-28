import './App.css';
import React from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import StartContainer from './containers/StartContainer'


function App() {
  return (

    <Router>
        <Routes>
            <Route path = "/start" element={<StartContainer/>}/>
        </Routes>
    </Router>

  );
}

export default App;
