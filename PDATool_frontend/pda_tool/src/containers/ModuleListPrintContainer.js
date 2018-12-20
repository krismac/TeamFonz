// Landing page which will display the list of modules

import React, {Component} from 'react';
import ModulePrintList from '../components/ModulePrintList.js';
import Request from '../helpers/request.js';
import { PDFExport } from '@progress/kendo-react-pdf';
import {Link} from 'react-router-dom';
import SubNav from '../components/SubNav';
import FooterPage from '../components/Nav_Footer.js';
import {CardGroup, MDBListGroup} from "mdbreact";

class ModuleListPrintContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      modules: []
    };
  };

  componentDidMount() {
    // get request will retrieve list of modules to populate state
    let request = new Request();
      request.get('/api/modules/student/4').then((data) => {
      this.setState({modules: data});
    });
  };

  render() {
    return (
      <>
        <SubNav/>
          <div className="module-list-print">
            <button className="print-button" class="btn btn-primary Ripple-parent" onClick={this.exportPDFWithComponent}>Print this list to PDF</button>
          </div>

        <PDFExport ref={(component) => this.pdfExportComponent = component} paperSize="A4" >

            <h1>View the details of all modules and associated evidence</h1>
            <div className="module-list-container">

              <MDBListGroup className="my-4 mx-4" style={{ width: "80%" }}>
                  <CardGroup>
                      <div className="module-list-component">
                        <ModulePrintList
                          data={this.state.modules}
                        />
                      </div>
                  </CardGroup>
              </MDBListGroup>
            </div>

      </PDFExport>

      <div className="module-list-print">
          <Link to={'/api/modules'} role="Button" class="btn btn-primary Ripple-parent">Home</Link>
          <button className="print-button" class="btn btn-primary Ripple-parent" onClick={this.exportPDFWithComponent}>Print this list to PDF</button>
      </div>
      <FooterPage/>
      </>
    );
  };
  exportPDFWithComponent = () => {
          this.pdfExportComponent.save();
      }

};

export default ModuleListPrintContainer;
