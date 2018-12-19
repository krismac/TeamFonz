// Landing page which will display the list of modules

import React, {Component} from 'react';
import ModulePrintList from '../components/ModulePrintList.js';
import Request from '../helpers/request.js';
import { PDFExport } from '@progress/kendo-react-pdf';
import {Link} from 'react-router-dom';

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
      <div className="module-list-print">
        <button className="print-button" onClick={this.exportPDFWithComponent}>Print this list to PDF</button>
        <Link to={'/api/modules'}>
          <a>Home</a>
        </Link>
      </div>

      <PDFExport ref={(component) => this.pdfExportComponent = component} paperSize="A4">

      <div className="module-list-container">

        <h3>Module List Container is RED box:</h3>
        <h3>Module List Component is BLUE box below:</h3>
        <h3>Simple Module component is GREEN box:</h3>

        <div className="module-list-component">
          <ModulePrintList
            data={this.state.modules}
          />
        </div>

      </div>
      </PDFExport>
      </>
    );
  };
  exportPDFWithComponent = () => {
          this.pdfExportComponent.save();
      }

};

export default ModuleListPrintContainer;
