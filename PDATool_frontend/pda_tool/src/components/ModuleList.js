// renders all modules from list inherited from container's state.
// under each module there'll be an edit button/link

import React, {Fragment} from 'react';
import ModuleSimple from './ModuleSimple.js';

const ModuleList = (props) => {

  const modules = props.data.map((module, index) => {
    return (
      <div className="module-component">
        <ModuleSimple
          index={index}
          question={module.question}
          answer={module.answer}
        />
        <a>Button to View This Module</a>
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
