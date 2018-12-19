// use react router to switch between containers, like in full stack pirates example

import React, { Component, Fragment } from 'react';
import ModuleListContainer from './containers/ModuleListContainer.js';
import SingleModuleContainer from './containers/SingleModuleContainer.js';
import ModuleEditFormContainer from './containers/ModuleEditFormContainer.js';
import './App.css';
// import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';


class App extends Component {
  render() {
    return (

      <Fragment>
        <h1>container for main page showing list of modules:</h1>
        <ModuleListContainer />
      </Fragment>

    );
  }
}

export default App;



// <Router >
//   <React.Fragment>
//     <Switch>
//     <Route path = '/api/modules' component={ModuleListContainer}/>
//     <Route path="/api/modules/edit/:id" component={ModuleEditFormContainer}/>
//     <Route path="/api/modules/:id" component={SingleModuleContainer}/>
//     </Switch>
//   </React.Fragment>
// </Router>
