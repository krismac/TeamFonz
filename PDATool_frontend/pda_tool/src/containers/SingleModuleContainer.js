// container for viewing a particular module

import React, {Component} from 'react';
import ModuleDetailed from '../components/ModuleDetailed.js';
import Request from '../helpers/request.js';

class SingleModuleContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      modules: []
    };
  };

  componentDidMount() {
    // get request will retrieve module data to populate state
    let request = new Request();
    request.get('/api/modules/student/4').then((data) => {
      this.setState({modules: data});
    });
  };

  render() {



    return (
      <div className="single-module-container">

        <h3>Single Module Container is RED box:</h3>
        <h3>Detailed Module Component is ORANGE box:</h3>

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
          />
          <a>Button to Add/Edit evidence for this Module</a>
        </div>

      </div>
    );
  };

};


export default SingleModuleContainer;
