import React, {Component} from 'react';
import ImageDrop from './ImageDrop.js';

class ModuleEditForm extends Component {

  constructor(props) {
    super(props);
    this.state = {
      imageEvidence: '',
      textEvidence: ''
    }
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleTextChange(event) {
    const textEvidence = event.target.value;
    this.setState({textEvidence: textEvidence})
  }

  handleSubmit(event) {
    event.preventDefault();

    const newEvidence = {}
    if (this.state.imageEvidence) {
      newEvidence["evidenceImageProvided"] = this.state.imageEvidence;
    }
    if (this.state.textEvidence) {
      newEvidence["evidenceTextProvided"] = this.state.textEvidence;
    }
    this.props.handleModuleEdit(newEvidence);
  }

  render() {
    return (
        <div className="module-edit-form-component">
          <form onSubmit={this.handleSubmit}>

            <label for="description">Add a description that shows evidence of how you met learning objective</label>
            <input type="text" value={this.state.textEvidence} placeholder="input text here"
            onChange={this.handleTextChange}/>

            <label for="images">Add image</label>

              <ImageDrop handleUploadSuccess={(url) => {
                this.setState({imageEvidence: url})
              }}/>

            <input type="submit" value="Submit" />

          </form>
        </div>
    )
  }

}
export default ModuleEditForm;
