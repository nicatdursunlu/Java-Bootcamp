import React, { useState } from "react";
import { Menu, Container } from "semantic-ui-react";

import { CartSummary } from "./CartSummary";
import { SignIn } from "./SignIn";
import { SignOut } from "./SignOut";

export const Nav = () => {
  const [isAuthenticated, setIsAuthenticated] = useState(true);

  const handleSignOut = () => setIsAuthenticated(false);

  return (
    <div>
      <Menu inverted fixed="top" color="pink">
        <Container>
          <Menu.Item name="home" />
          <Menu.Item name="messages" />

          <Menu.Menu position="right">
            <CartSummary />
            {isAuthenticated ? <SignIn signOut={handleSignOut} /> : <SignOut />}
          </Menu.Menu>
        </Container>
      </Menu>
    </div>
  );
};
