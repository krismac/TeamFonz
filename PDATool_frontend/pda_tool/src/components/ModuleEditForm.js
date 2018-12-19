import React, {Component} from 'react';
import ImageDrop from './ImageDrop.js';

const ModuleEditForm = (props) => {

  return (

    <div className="module-edit-form-component">
      <form>

      <label for="images">Add images</label>

        <ImageDrop/>

      <label for="description">Add description</label>
      <input type="text" placeholder="input descriptive text here" />

      </form>
    </div>

  )

};

export default ModuleEditForm;
