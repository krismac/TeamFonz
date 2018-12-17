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
                                          <DropdownItem href="#backlog">Backlog</DropdownItem>
                                          <DropdownItem href="#inprogress">In Progress</DropdownItem>
                                          <DropdownItem href="#done">Done</DropdownItem>
                                          <DropdownItem href="#blocked">Blocked</DropdownItem>
                                          <DropdownItem href="#all">All items</DropdownItem>
                                        </DropdownMenu>
                                      </Dropdown>
          </Navbar>
      </Container>
    );
  }
}

export default NavbarPage;
