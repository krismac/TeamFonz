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
  };

  componentDidMount() {
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
          <ModuleDetailed data={module}/>
          <ModuleEditForm data={module}/>
        </div>

      </div>
    )
  };

};

export default ModuleEditFormContainer;
