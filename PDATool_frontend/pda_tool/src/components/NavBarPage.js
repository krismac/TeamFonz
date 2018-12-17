import React from "react";
import { Navbar, NavItem, Container, Dropdown, DropdownItem, DropdownToggle, DropdownMenu, NavLink, Fa} from "mdbreact";


class NavbarPage extends React.Component {
  state = {
    collapseID: ""
  };

  toggleCollapse = collapseID => () =>
    this.setState(prevState => ({
      collapseID: prevState.collapseID !== collapseID ? collapseID : ""
    }));

  render() {
    return (
      <Container>
        <Navbar color="default-color" dark expand="md" style={{marginTop: "20px"}}>

        <Dropdown>
                                        <DropdownToggle  nav caret>
                                          <div className="d-none d-md-inline">Kanban</div>
                                        </DropdownToggle>
                                        <DropdownMenu className="dropdown-default"right>
                                          <DropdownItem href="#!">Backlog</DropdownItem>
                                          <DropdownItem href="#!">In Progress</DropdownItem>
                                          <DropdownItem href="#!">Blocked</DropdownItem>
                                          <DropdownItem href="#!">All items</DropdownItem>
                                        </DropdownMenu>
                                      </Dropdown>
          </Navbar>
      </Container>
    );
  }
}

export default NavbarPage;
