// for editing an individual module - not sure yet if we need a form to create a new module, since that may be set up in the beginning - always editing?

import React, {Component} from 'react';

class ModuleEditFormContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      moduleData: []
    }
    // again, componentDidMount method will populate the state
  }

  componentDidMount() {
    // plan: componentDidMount method could populate (intitially empty) individual modules data in state
    // with GET requests
  }

  render() {
    return (
      <div>
        <ModuleEditForm />
      </div>
    )
  }

}

export default ModuleEditFormContainer;
