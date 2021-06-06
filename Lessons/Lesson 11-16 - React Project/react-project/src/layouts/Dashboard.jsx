import React from "react";

import { ProductsList } from "../pages/ProductsList";
import { Categories } from "./Categories";
import { Nav } from "./Nav";

export const Dashboard = () => {
  return (
    <div>
      <Nav />
      <Categories />
      <ProductsList />
    </div>
  );
};
