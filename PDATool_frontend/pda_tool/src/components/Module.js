// each Module is a combined Question and Answer bundled into one component.

import React from 'react';
const Module = (props) => {

  console.log("Module props:", props);

  return (
    <div className="module-div">
      <p>I'm module number {props.index + 1}!</p>
      <p>{props.question}</p>
      <p>{props.answer}</p>
    </div>
  );

}

export default Module;
