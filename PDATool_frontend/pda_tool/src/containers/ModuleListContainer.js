// Landing page which will display the list of modules

import React, {Component} from 'react';
import ModuleList from '../components/ModuleList.js';

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
    }
    // idea: componentDidMount method could populate modules array
  }

  render() {
    return (
      <div className="module-list-container">
        <h1>PDA Tool</h1>
        <h3>Module list starts below:</h3>
        <ModuleList data={this.state.modules}/>
      </div>
    )
  }

}

export default ModuleListContainer;
