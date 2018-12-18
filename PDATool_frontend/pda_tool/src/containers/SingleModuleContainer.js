// container for viewing a particular module

import React, {Component} from 'react';
import ModuleDetailed from '../components/ModuleDetailed.js';
import {Col, Card, CardImage, CardBody, CardText, CardTitle, Button} from "mdbreact";

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
      <Col>
        <Card style={{ width: "22rem" }}>
          <CardImage
            className="img-fluid"
            src="https://mdbootstrap.com/img/Photos/Others/images/43.jpg"
            waves
          />
          <CardBody>
            <CardTitle>Card title</CardTitle>
            <CardText>
                              <ModuleDetailed
                                data={this.state.moduleData}
                              />
                              Single Module Container is RED box:
                              Detailed Module Component is ORANGE box:

                              <div>

                              </div>
            </CardText>
            <Button href="#">Edit evidence for this Module</Button>
          </CardBody>
        </Card>
      </Col>




      </div>
    );
  };

};


export default SingleModuleContainer;
