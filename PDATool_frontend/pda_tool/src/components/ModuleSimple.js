// shows overview of module for list view

import React from 'react';

const ModuleSimple = (props) => {

  return (
    <div>

      <p>I'm an overview of module number {props.index + 1}!</p>
      
    </div>
  );

}

export default ModuleSimple;
