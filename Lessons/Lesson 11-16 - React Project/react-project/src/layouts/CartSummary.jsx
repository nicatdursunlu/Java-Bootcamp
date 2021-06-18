import React from "react";
import { useSelector } from "react-redux";
import { NavLink } from "react-router-dom";
import { Dropdown, Label } from "semantic-ui-react";

export const CartSummary = () => {
  const { cartItems } = useSelector((state) => state.cart);

  return (
    <div>
      <Dropdown item text="Basket">
        <Dropdown.Menu>
          {cartItems.map((item) => (
            <Dropdown.Item key={item.product.id}>
              {item.product.productName} <Label>{item.quantity}</Label>
            </Dropdown.Item>
          ))}
          <Dropdown.Divider />
          <Dropdown.Item as={NavLink} to="/cart">
            Go to basket
          </Dropdown.Item>
        </Dropdown.Menu>
      </Dropdown>
    </div>
  );
};
