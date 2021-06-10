import React from "react";
import { Button, Menu } from "semantic-ui-react";

export const SignOut = () => {
  return (
    <div>
      <Menu.Item>
        <Button color="green">Sign in</Button>
        <Button color="green" style={{ marginLeft: "0.5em" }}>
          Log in
        </Button>
      </Menu.Item>
    </div>
  );
};
