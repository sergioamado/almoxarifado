import React from "react"

export default function Fragmento(props) {
    return (
        <React.Fragment>

            <h2>Fragmento</h2>
            <p>Cuidado com esse tipo de erro</p>
        </React.Fragment>

        /*  do jeito de cima é possivel atibuir valores a atributos 
            exemplo React.Fragment key = "1"   
        
        tambem pode ser escrito sem palavras 
        <>
            <h2>Fragmento</h2>
            <p>Cuidado com esse tipo de erro</p>
        </>
        */
    )
}