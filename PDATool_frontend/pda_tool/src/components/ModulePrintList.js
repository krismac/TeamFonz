

import React, {Fragment} from 'react';
import ModuleDetailed from './ModuleDetailed.js';
// renders all modules from list inherited from container's state.
// under each module there'll be an edit button/link
const ModuleList = (props) => {
  const modules = props.data.map((module, index) => {
    return (
      <div>

        <ModuleDetailed
          key={index}
          unit={module.unit}
          reference={module.reference}
          evidenceRequired={module.evidenceRequired}
          weekNumber={module.weekNumber}
          answerId={module.answerId}
          imageEvidence={module.imageEvidence}
          textEvidence={module.textEvidence}
          kanbanStatus={module.kanbanStatus}
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
