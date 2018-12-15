//  more question detail plus student Answer

import React from 'react';

const ModuleDetailed = (props) => {

  console.log("Module props:", props);

  return (
    <div className="module-div">
      <p>I'm a detailed view of module number {props.index + 1}!</p>
      <p>{props.question}</p>
      <p>{props.answer}</p>
    </div>
  );

}

export default ModuleDetailed;
