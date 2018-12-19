// shows overview of module for list view

import React from 'react';

const ModuleSimple = (props) => {

  return (
    <div className="module-simple-component">

      <div className="evidence-required">
        <h4>Evidence Required:</h4>
        <p>{props.evidenceRequired}</p>
      </div>

      <div className="week">
        <h4>Relevant Week: {props.weekNumber}</h4>
      </div>

      <div className="kanban-status">
        <h4>Status: {props.kanbanStatus}</h4>
      </div>

    </div>
  );

}

export default ModuleSimple;
