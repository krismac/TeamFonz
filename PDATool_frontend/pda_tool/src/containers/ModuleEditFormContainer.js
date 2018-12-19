// container for adding or editing evidence for a particular module

import React, {Component} from 'react';
import ModuleDetailed from '../components/ModuleDetailed.js';
import ModuleEditForm from '../components/ModuleEditForm.js';
import Request from '../helpers/request.js';

class ModuleEditFormContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      module: {}
    };
    // Text and image removed - manage through the componentDidMount
    console.log("Props in constructor of ModuleEditFormContainer", props);
  };

  componentDidMount() {
  // get request will retrieve module data to populate state
    const request = new Request();
    request.get("api/modules/{id}").then((module) => {
      console.log(module);
      this.setState({
      text: module.text,
      image: module.image});
  });
}

handleModuleEdit(module){
    const request = new Request();
    request.patch('/api/answers/'+ this.props.questionId, module).then(() => {
    })

}
    // get request will retrieve module data to populate state
    let request = new Request();
    request.get('/api/modules/student/4/question/' + this.props.id).then((data) => {
      this.setState({module: data});
    });
  };

  render() {

    const {module} = this.state

    return (
      <div className="module-edit-form-container">

        <h3>Edit Form Container is RED box:</h3>
        <h3>Detailed Module Component is ORANGE box:</h3>
        <h3>Edit Form is PURPLE box:</h3>

        <div>
          <ModuleDetailed
          unit={module.unit}
          reference={module.reference}
          evidenceRequired={module.evidenceRequired}
          weekNumber={module.weekNumber}
          answerId={module.answerId}
          imageEvidence={module.imageEvidence}
          textEvidence={module.textEvidence}
          kanbanStatus={module.kanbanStatus}
          id={this.props.id}
          />
          <ModuleEditForm
          unit={module.unit}
          reference={module.reference}
          evidenceRequired={module.evidenceRequired}
          weekNumber={module.weekNumber}
          answerId={module.answerId}
          imageEvidence={module.imageEvidence}
          textEvidence={module.textEvidence}
          kanbanStatus={module.kanbanStatus}
          id={this.props.id}
          />
        </div>

      </div>
    )
  };

};

export default ModuleEditFormContainer;
