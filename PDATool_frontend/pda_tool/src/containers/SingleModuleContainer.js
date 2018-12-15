// outer container for when viewing individual module

import React, {Component} from 'react';
import ModuleDetailed from '../components/ModuleDetailed.js';

class SingleModuleContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      moduleData: null
    };
  };

  componentDidMount() {
    // get request will retrieve module data to populate state
  };

  render() {
    return (
      <div className="single-module-container">

        <h3>Single Module Container is RED box:</h3>
        <h3>Detailed Module Component is ORANGE box:</h3>

        <div className="module-detailed-component">
          <ModuleDetailed
            data={this.state.moduleData}
          />
          <a>Button to Add/Edit evidence for this Module</a>
        </div>

      </div>
    );
  };

};


export default SingleModuleContainer;
