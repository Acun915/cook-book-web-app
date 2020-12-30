import React, { Component } from "react";
import "./HeaderComponent.css";

class HeaderComponent extends Component {
  render() {
    return (
      <div className="nav-bar">
        <div className="nav-element">COOK-BOOK</div>

        <div className="nav-element">Login</div>
      </div>
    );
  }
}

export default HeaderComponent;
