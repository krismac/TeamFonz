// use react router to switch between containers, like in full stack pirates example

import React, { Component } from 'react';
import ModuleListContainer from './containers/ModuleListContainer.js';
import './App.css';

class App extends Component {
  render() {
    return (
      <ModuleListContainer />
    );
  }
}

export default App;
