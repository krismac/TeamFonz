import React from "react";
import { Col, Container, Row, Footer } from "mdbreact";

class FooterPage extends React.Component {
  render() {
    return (
      <Container>
        <Footer color="blue" className="font-small pt-4 mt-4">
          <Container fluid className="text-center text-md-left">
            <Row>
              <Col md="6">
                <h5 className="title">CodeClan Group Project</h5>
                <p>
                  First created by 2018 Cohort e25
                </p>
              </Col>
              <Col md="6">
                <h5 className="title">Links</h5>
                <ul>
                  <li className="list-unstyled">
                    <a href="https://codeclan.com/">CodeClan</a>
                  </li>
                  <li className="list-unstyled">
                    <a href="https://www.sqa.org.uk/sqa/controller?p_service=Content.show&p_applic=CCC&pContentID=76243">SQA Professional Diploma</a>
                  </li>
                  <li className="list-unstyled">
                    <a href="https://www.bcs.org/">BCS</a>
                  </li>
                </ul>
              </Col>
            </Row>
          </Container>
          <div className="footer-copyright text-center py-3">
            <Container fluid>
              &copy; {new Date().getFullYear()} Copyright:{" "}
              <a href="https://www.codeclan.com"> CodeClan.com </a>
            </Container>
          </div>
        </Footer>
      </Container>
    );
  }
}

export default FooterPage;
