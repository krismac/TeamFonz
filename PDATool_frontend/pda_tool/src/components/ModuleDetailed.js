//  more question detail plus student Answer

import React from 'react';

const ModuleDetailed = (props) => {

  return (
    <div className="module-detailed-component">

    <div className="module-detail unit">
      <p>Unit: {props.unit}</p>
    </div>

    <div className="module-detail reference">
      <p>Reference: {props.reference}</p>
    </div>

    <div className="module-detail evidence-required">
      <h4>Evidence Required:</h4>
      <p>{props.evidenceRequired}</p>
    </div>

    <div className="module-detail kanban-status">
      <h4>Status: {props.kanbanStatus}</h4>
    </div>

    <div className="module-detail week">
      <h4>Relevant Week: {props.weekNumber}</h4>
    </div>

    <div className="module-detail image-evidence">
      <p>Image Evidence Here: {props.imageEvidence}</p>
    </div>

    <div className="module-detail text-evidence">
      <p>Text Evidence Here: {props.textEvidence}</p>
    </div>

    </div>
  );

}

export default ModuleDetailed;
