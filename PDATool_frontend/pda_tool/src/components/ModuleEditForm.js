import React from 'react';

const ModuleEditForm = (props) => {

  return (

    <div className="module-edit-form-component">
      <form>

      <label for="images">Add images</label>
      <input type="text" id="images" placeholder="input image link here" />
      <label for="description">Add description</label>
      <input type="text" placeholder="input descriptive text here" />

      </form>
      <a>Button to Save Progress</a>
      <a>Button to Save Completion</a>
      <a>Button to Delete/Reset evidence</a>
    </div>

  )

};

export default ModuleEditForm;
