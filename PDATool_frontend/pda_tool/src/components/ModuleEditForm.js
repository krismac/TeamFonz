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

            <h3>Add Evidence</h3>
            <h6>Add supporting commentary</h6>

            <textarea
              value={this.state.textEvidence}
              placeholder="Add a text description that shows evidence of how you met learning objective"
              onChange={this.handleTextChange}
              className="form-control"
              id="exampleFormControlTextarea1"
              rows="8"
            />

            <h6>Add an image</h6>
              <ImageDrop for="images" handleUploadSuccess={(url) => {
                this.setState({imageEvidence: url})
              }}/>

            <input class="btn btn-default Ripple-parent" type="submit" value="Submit" />

          </form>
        </div>
    )
  }

}
export default ModuleEditForm;
