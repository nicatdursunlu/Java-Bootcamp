import React, { useState } from "react";
import { useHistory } from "react-router";
import { Menu, Container } from "semantic-ui-react";

import { CartSummary } from "./CartSummary";
import { SignIn } from "./SignIn";
import { SignOut } from "./SignOut";

export const Nav = () => {
  const [isAuthenticated, setIsAuthenticated] = useState(true);
  const history = useHistory();

  const handleSignOut = () => {
    setIsAuthenticated(false);
    history.push("/");
  };

  const handleSignIn = () => setIsAuthenticated(true);

  return (
    <div>
      <Menu inverted fixed="top" color="pink">
        <Container>
          <Menu.Item name="home" />
          <Menu.Item name="messages" />
          <Menu.Menu position="right">
            <CartSummary />
            {isAuthenticated ? (
              <SignIn signOut={handleSignOut} />
            ) : (
              <SignOut signIn={handleSignIn} />
            )}
          </Menu.Menu>
        </Container>
      </Menu>
    </div>
  );
};
