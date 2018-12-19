import React, {Component} from 'react';
import ImageDrop from './ImageDrop.js';

class ModuleEditForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      // text: props.moduleData.text,
      // image: props.moduleData.image
    }
    console.log("ModuleEditForm State: ", this.state);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentWillReceiveProps(props){
    console.log("ModuleEditForm gets props:", props);
  }

  handleSubmit(event){
    event.preventDefault();
    console.log(this.state);
    const module = {
      "text": this.state.text,
      "image": this.state.image
    }
    this.props.handleModuleEdit(module);
  }

render(){
  return (
    <div className="module-edit-form-component">
      <form onSubmit={this.handleSubmit}>
      <label for="description">Add a description that shows evidence of how you met learning objective</label>
      <input type="text" value={this.state.text} placeholder="input text here"
      onChange={e => this.setState({text: e.target.value})}/>

      <label for="images">Add image</label>

        <ImageDrop handleUploadSuccess={(url) => {
          this.setState({image: url})
        }}/>

      </form>
      <a>Button to Save Progress</a>
      <a>Button to Save Completion</a>
      <a>Button to Delete/Reset evidence</a>
    </div>
    )
  }

};

export default ModuleEditForm;
