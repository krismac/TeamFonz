import React from "react";
import { Navbar, NavItem, Container, NavbarNav, NavLink, NavbarBrand} from "mdbreact";


class SubNav extends React.Component {
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
        <NavbarBrand href="#">
                <img src="https://res.cloudinary.com/fonz/image/upload/v1545264231/favicon.png" height="30" alt="" />
        </NavbarBrand>
            <NavbarNav left>
                  <NavItem active>
                    <NavLink to="/api/modules">Home</NavLink>
                  </NavItem>
                  <NavItem>
                    <NavLink to="/api/modules/detailed">Detailed</NavLink>
                  </NavItem>
                  <NavItem>
                    <NavLink to="/api/modules">Help</NavLink>
                  </NavItem>
                  <NavItem>
                    <NavLink to="/api/modules">Contact</NavLink>
                  </NavItem>
                </NavbarNav>
        </Navbar>
      </Container>
    );
  }
}

export default SubNav;
