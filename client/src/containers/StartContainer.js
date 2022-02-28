import React, {useState} from 'react';



const StartContainer = ({playerOne, playerTwo, setPlayerOne, setPlayerTwo}) => {
    
    // const [playerOne, setPlayerOne] = useState("Player 1");
    // const [playerTwo, setPlayerTwo] = useState("Player 2");
    
    const handleChangePlayerOne = (event) => {

        setPlayerOne(event.target.value);

        console.log(playerOne);
    }
    const handleChangePlayerTwo = (event) => {

        setPlayerTwo(event.target.value);

        console.log(playerTwo);
    }

    return (
        <>
        <h1>Educational Goals</h1>
        <input type = "text" onChange={handleChangePlayerOne} id = "Player 1 input" />  
        <input type = "text" onChange={handleChangePlayerTwo} id = "Player 2 input"/> 
        <a href = "/quiz">Start</a> 
        </>
    
    )
    
}

export default StartContainer;