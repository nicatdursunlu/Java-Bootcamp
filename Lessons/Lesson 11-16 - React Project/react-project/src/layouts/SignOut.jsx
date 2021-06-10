import React from "react";
import { Button, Menu } from "semantic-ui-react";

export const SignOut = (props) => {
  const { signIn } = props;
  return (
    <div>
      <Menu.Item>
        <Button onClick={signIn} color="green">
          Sign in
        </Button>
        <Button color="green" style={{ marginLeft: "0.5em" }}>
          Log in
        </Button>
      </Menu.Item>
    </div>
  );
};
