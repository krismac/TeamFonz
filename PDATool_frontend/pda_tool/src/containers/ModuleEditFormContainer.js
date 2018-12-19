// container for adding or editing evidence for a particular module

import React, {Component} from 'react';
import ModuleDetailed from '../components/ModuleDetailed.js';
import ModuleEditForm from '../components/ModuleEditForm.js';

class ModuleEditFormContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      text: null,
      image: null
    };
  };

  componentDidMount() {
  // get request will retrieve module data to populate state
    const request = new Request();
    request.get("api/modules/{id}").then((module) => {
      this.setState({
      text: module.text,
      image: module.image});
  });
}

handleModuleEdit(module){
    const request = new Request();
    request.patch('/api/answer/' + this.props.id, module).then(() => {

    })

}

  render() {
    return (
      <div className="module-edit-form-container">

        <h3>Edit Form Container is RED box:</h3>
        <h3>Detailed Module Component is ORANGE box:</h3>
        <h3>Edit Form is PURPLE box:</h3>

        <div>
          <ModuleDetailed data={this.state.moduleData}/>
          <ModuleEditForm data={this.state.moduleData}/>
          <a>Button to Save Progress</a>
          <a>Button to Save Completion</a>
          <a>Button to Delete/Reset evidence</a>
        </div>

      </div>
    )
  };

};

export default ModuleEditFormContainer;
