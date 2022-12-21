import React from "react"

import Primeiro from './components/basicos/Primeiro.jsx'
import ComParametro from './components/basicos/ComParametro'
import Fragmento from './components/basicos/Fragmento'


export default function App (props){
    return(
        
 /* modelo encapsulado por div */
                <div id = "app">
                    <h1> Fundamentos React </h1>
                    <Fragmento />
                    <ComParametro titulo= "Situação do aluno" 
                                  aluno= "Anderson" 
                                  nota= {9.3}/>
                    <ComParametro titulo= "Situação do aluno" 
                                  aluno= "Sergio" 
                                  nota= {9.9}/>
                    
                    <Primeiro></Primeiro>
                </div>
               
                
    )
}
