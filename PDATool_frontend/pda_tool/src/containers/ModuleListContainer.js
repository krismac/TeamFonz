// Landing page which will display the list of modules

import React, {Component} from 'react';

class ModuleListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      modules: []
    }
    // idea: componentDidMount method could populate modules array
  }

  render() {
    return (
      <ModuleList data={this.state.modules}/>
    )
  }

}

export default ModuleListContainer;
