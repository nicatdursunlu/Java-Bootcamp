import React from "react";
import { NavLink } from "react-router-dom";
import { Dropdown } from "semantic-ui-react";

export const CartSummary = () => {
  return (
    <div>
      <Dropdown item text="Basket">
        <Dropdown.Menu>
          <Dropdown.Item>Aser Notebook</Dropdown.Item>
          <Dropdown.Item>Acer Notebook</Dropdown.Item>
          <Dropdown.Item>Dell Notebook</Dropdown.Item>
          <Dropdown.Divider />
          <Dropdown.Item as={NavLink} to="/cart">
            Go to basket
          </Dropdown.Item>
        </Dropdown.Menu>
      </Dropdown>
    </div>
  );
};
