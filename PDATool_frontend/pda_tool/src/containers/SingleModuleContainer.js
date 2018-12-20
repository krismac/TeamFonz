// container for viewing a particular module

import React, {Component} from 'react';
import ModuleDetailed from '../components/ModuleDetailed.js';
import Request from '../helpers/request.js';
import {Link} from 'react-router-dom';
import SubNav from '../components/SubNav';
import FooterPage from '../components/Nav_Footer.js';


class SingleModuleContainer extends Component {
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
<>
<SubNav
/>
      <div className="single-module-container">

        <h3>View a Single Module</h3>
        <h3>Detailed Module Description</h3>

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

<Link to={'/api/modules/edit/' + this.props.id} class="btn btn-default Ripple-parent">Edit this module</Link>



            <div className="edit-module">

            </div>

        </div>
<FooterPage/>
      </div>

    </>
    );
  };

};


export default SingleModuleContainer;
