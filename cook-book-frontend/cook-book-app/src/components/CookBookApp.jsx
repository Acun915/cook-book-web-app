import React, { Component } from "react";
import FooterComponent from "./footer/FooterComponent.jsx";
import HeaderComponent from "./header/HeaderComponent.jsx";
import HomeComponent from "./home/HomeComponent.jsx";
// import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

class CookBookApp extends Component {
  render() {
    return (
      <div className="cookBookApp">
        <HeaderComponent />
        <HomeComponent />
        <FooterComponent />
      </div>
    );
  }
}

export default CookBookApp;
