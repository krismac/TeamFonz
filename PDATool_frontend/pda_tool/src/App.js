import React, { Component, Fragment } from 'react';
import ModuleListContainer from './containers/ModuleListContainer.js';
import SingleModuleContainer from './containers/SingleModuleContainer.js';
import NavbarPage from './components/NavBarPage.js';
import ModuleEditFormContainer from './containers/ModuleEditFormContainer.js';
import './App.css';

class App extends Component {
  render() {
    return (
      <Fragment>
      <NavbarPage>
      </NavbarPage>
        <h1>container for main page showing list of modules:</h1>
        <ModuleListContainer />
        <h1>container for page after clicking on one module:</h1>
        <SingleModuleContainer />
        <h1>container for page after clicking to add/edit evidence for that module:</h1>
        <ModuleEditFormContainer />
      </Fragment>


    );
  }
}

export default App;
