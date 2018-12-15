// renders all modules from list inherited from container's state.

import React, {Fragment} from 'react';
import Module from './Module.js';

const ModuleList = (props) => {
  console.log("ModuleList props data:", props.data);

  const modules = props.data.map((module, index) => {
    return (
      <div className="module-component">
        <Module
          index={index}
          question={module.question}
          answer={module.answer}
        />
      </div>
    )
  });

  return (
    <Fragment>
      {modules}
    </Fragment>
  );

}

export default ModuleList;
