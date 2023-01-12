import './App.css'
import React from "react";

import Card from "./components/layout/Card";
import Aleatorio from "./components/basicos/Aleatorio";
import Fragmento from "./components/basicos/Fragmento";
import ComParametro from "./components/basicos/ComParametro";
import Primeiro from "./components/basicos/Primeiro";

export default function App(props) {
  return (
    <div className="App">
      <h1> Fundamentos React </h1>

      <div className="Cards">
        <Card titulo="#04 - Desafio Aleatorio" color="#ffa852">
          <Aleatorio min={1} max={60} />
        </Card>
        <Card titulo="#03 - Fragmento" color= "#52ff52">
          <Fragmento />
        </Card>
        <Card titulo="#02 - ComParametro" color="#52a8ff">
          <ComParametro titulo="Situação do aluno" aluno="Anderson" nota={9.3} />
          <ComParametro titulo="Situação do aluno" aluno="Sergio" nota={9.9} />
        </Card>
        <Card titulo="#01 - Primeiro" color="#ff52ff">
          <Primeiro />
        </Card>
      </div>
    </div>
  );
}
/* modelo reduzido ao maximo 

export default _ =>
    <div id = "app">
    <h1> Fundamentos React (arrow _)</h1> pode ser assim ou assim:
    <h1> Fundamentos React</h1>
    <Fragmento />
    <ComParametro titulo= "Situação do aluno" 
                aluno= "Anderson" 
                nota= {9.3}/>
    <ComParametro titulo= "Situação do aluno" 
                aluno= "Sergio" 
                nota= {9.9}/>

    <Primeiro></Primeiro>

*/
