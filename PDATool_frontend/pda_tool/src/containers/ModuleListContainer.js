// Landing page which will display the list of modules

import React, {Component} from 'react';
import ModuleList from '../components/ModuleList.js';
import {Progress} from "mdbreact";


class ModuleListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      modules: [
        {
          question: "I'm a question from module 1",
          answer: "I'm an answer from module 1"
        },
        {
          question: "I'm a question from module 2",
          answer: "I'm an answer from module 2"
        }
      ]
    };
  };

  componentDidMount() {
    // get request will retrieve list of modules to populate state
  };

  render() {
    return (



      <div className="module-list-container">

      <Progress material value={25} height="20px">
        25%
      </Progress>
        <h3>Module List Container is RED box:</h3>
        <h3>Module List Component is BLUE box below:</h3>
        <h3>Simple Module component is GREEN box:</h3>

        <div className="module-list-component">
          <ModuleList
            data={this.state.modules}
          />
        </div>

      </div>
    );
  };

};

export default ModuleListContainer;
