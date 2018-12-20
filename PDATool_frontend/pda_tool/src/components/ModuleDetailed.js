//  more question detail plus student Answer

import React from 'react';
import {Card, CardBody, CardTitle, CardText, Table, TableBody, TableHead} from "mdbreact";
const ModuleDetailed = (props) => {

  //provides module ID to the ModuleEditFormContainer

  return (
<>
    <Card>
      <CardBody>
        <CardTitle tag="h3">Evidence</CardTitle>
        <CardText>
          <div className="module-detailed-component">
            <div className="module-detail evidence-required">
            <h5>Learning Outcome</h5><p>{props.evidenceRequired}</p>
            </div>
          </div>
          </CardText>
                <div className="module-detail-image-evidence">
                  <h6>Image Evidence:</h6>
                  <img src={props.imageEvidence} alt="" height="40%" width="40%"/>
                </div>

                <div className="module-detail-text-evidence">
                  <h6>Narrative Evidence:</h6><p>{props.textEvidence}</p>
                </div>

              </CardBody>
            </Card>

            <Table forcePageBreak="div">
            <TableHead>
              <tr>
                <th className="module-detail week">Relevant Week:</th>
                <th className="module-detail reference">Reference:</th>
                <th className="module-detail unit">Unit:</th>
                <th className="module-detail kanban-status">Status:</th>
              </tr>
            </TableHead>
            <TableBody>
              <tr>
                <td>{props.weekNumber}</td>
                <td>{props.reference}</td>
                <td>{props.unit}</td>
                <td>{props.kanbanStatus}</td>
              </tr>
               </TableBody>
             </Table>
            </>
  );

}

export default ModuleDetailed;
