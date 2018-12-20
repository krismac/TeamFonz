// shows overview of module for list view

import React from 'react';
import {Link} from 'react-router-dom';
import { Card, CardBody, CardTitle, CardText} from "mdbreact";

const ModuleSimple = (props) => {

  return (

    <Card>
          <CardBody>
            <CardTitle tag="h5">Learning Outcome</CardTitle>
            <CardText>
            <div className="module-simple-component">
                  <div class="d-flex w-100 justify-content-between" className="module-detail evidence-required">
                  <p>{props.evidenceRequired}</p>
                  </div>
                  <div className="module-detail kanban-status">
                  <h6>Status: {props.kanbanStatus}</h6>
                  </div>
                  <div className="module-detail week">
                  <small text-align="right">Relevant Week: {props.weekNumber}</small>
                  </div>
            </div>
            </CardText>
    <Link to={'/api/modules/' + props.answerId} color="primary" size="md" class="btn btn-default Ripple-parent">Module details</Link>
  </CardBody>
</Card>
  );

}

export default ModuleSimple;
