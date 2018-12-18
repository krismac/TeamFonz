// renders all modules from list inherited from container's state.
// under each module there'll be an edit button/link

import React, {Fragment} from 'react';
import ModuleSimple from './ModuleSimple.js';

const ModuleList = (props) => {
console.log("Props data passed to ModuleList:", props.data);
  const modules = props.data.map((module, index) => {
    return (
      <div>

        <ModuleSimple
          index={index}
          requirement={module.evidenceRequired}
        />
        <a>Button to View this Module</a>

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
