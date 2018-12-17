// Landing page which will display the list of modules

import React, {Component} from 'react';
import ModuleList from '../components/ModuleList.js';
import Request from '../helpers/request.js';

class ModuleListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      modules: []
    };
  };

  componentDidMount() {
    // get request will retrieve list of modules to populate state
    let request = new Request();
    // request.get('/api/questions').then((data) => {
      // this.setState({modules: data});
    // });
  };

  render() {
    return (
      <div className="module-list-container">

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
