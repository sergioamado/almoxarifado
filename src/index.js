import './index.css'  
import ReactDOM from 'react-dom'
import React from 'react'

import Primeiro from './components/basicos/Primeiro.jsx'
import ComParametro from './components/basicos/ComParametro'


ReactDOM.render (
                <div>
                    <Primeiro></Primeiro>
                    <ComParametro titulo= "Situação do aluno" 
                                  aluno= "Anderson" 
                                  nota= {9.3}/>
                    <ComParametro titulo= "Situação do aluno" 
                                  aluno= "Sergio" 
                                  nota= {9.9}/>
                </div>, 
                document.getElementById('root')
                )