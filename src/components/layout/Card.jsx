import "./Card.css";
import React from "react";

export default (props) => {
  return (
    <div className="Card">
      <div className="Title">{props.titulo}</div>
      <div className="Content">Conteúdo
      {props.children}
      </div>
    </div>
  );
};
