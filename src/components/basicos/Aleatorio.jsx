import React from "react";

export default (props) => {
  const { min, max } = props;
  const aleatorio = parseInt(Math.random() * (max - min)) + min;
  return (
    <div>
      <h2>Valor aleatorio</h2>
      <p>
        <strong>Valor minimo: </strong> {min}
      </p>
      <p>
        <strong>Valor Maximo: </strong> {max}
      </p>
      <p>
        <strong> Valor escolhido: </strong> {aleatorio}
      </p>
    </div>
  );
};
