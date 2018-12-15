// for editing an individual module -
  // will show the module info at top plus form for adding images and description underneath

import React, {Component} from 'react';
import Module from '../components/Module.js';
import ModuleEditForm from '../components/ModuleEditForm.js';

class ModuleEditFormContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      question: null,
      answer: null
    };
  };

  componentDidMount() {
    // plan: componentDidMount method could populate (intitially empty) individual modules data in state
    // with GET requests
  };

  render() {
    return (
      <div>
        <Module />
        <ModuleEditForm />
      </div>
    )
  };

};

export default ModuleEditFormContainer;
