import React from "react";
import { Route } from "react-router";
import { ToastContainer } from "react-toastify";
import { Grid } from "semantic-ui-react";

import { ProductsList } from "../pages/ProductsList";
import { ProductDetail } from "../pages/ProductDetail";
import { CartDetail } from "../pages/CartDetail";
import { Categories } from "./Categories";

export const Dashboard = () => {
  return (
    <div>
      <ToastContainer position="top-left" />
      <Grid>
        <Grid.Row>
          <Grid.Column width={4}>
            <Categories />
          </Grid.Column>
          <Grid.Column width={12}>
            <Route exact path="/" component={ProductsList} />
            <Route exact path="/products" component={ProductsList} />
            <Route path="/products/:name" component={ProductDetail} />
            <Route path="/cart" component={CartDetail} />
          </Grid.Column>
        </Grid.Row>
      </Grid>
    </div>
  );
};
