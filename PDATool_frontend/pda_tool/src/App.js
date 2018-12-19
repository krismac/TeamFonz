// use react router to switch between containers, like in full stack pirates example

import React, { Component, Fragment } from 'react';
import ModuleListContainer from './containers/ModuleListContainer.js';
// import SingleModuleContainer from './containers/SingleModuleContainer.js';
import ModuleEditFormContainer from './containers/ModuleEditFormContainer.js';
import './App.css';

class App extends Component {
  render() {
    return (
      <Fragment>
        <h1>container for main page showing list of modules:</h1>
        <ModuleListContainer />
        <h1>edit form:</h1>
        <ModuleEditFormContainer />
      </Fragment>
    );
  }
}

export default App;
