// renders all modules from list inherited from container's state.
// under each module there'll be an edit button/link

import React, {Fragment} from 'react';
import ModuleSimple from './ModuleSimple.js';

const ModuleList = (props) => {
  const modules = props.data.map((module, index) => {
    return (
      <div>

        <ModuleSimple
          index={index}
          unit={module.unit}
          reference={module.reference}
          evidenceRequired={module.evidenceRequired}
          weekNumber={module.weekNumber}
          imageEvidence={module.imageEvidence}
          textEvidence={module.textEvidence}
          kanbanStatus={module.kanbanStatus}
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
