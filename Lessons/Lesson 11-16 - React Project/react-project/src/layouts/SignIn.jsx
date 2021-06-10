import React from "react";
import { Dropdown, Image, Menu } from "semantic-ui-react";

export const SignIn = (props) => {
  const { signOut } = props;

  return (
    <div>
      <Menu.Item>
        <Image
          avatar
          spaced="right"
          src="https://avatars.githubusercontent.com/u/44035684?v=4"
        />
        <Dropdown pointing="top left" text="Nijat">
          <Dropdown.Menu>
            <Dropdown.Item text="Profile" icon="info" />
            <Dropdown.Item onClick={signOut} text="Log out" icon="sign-out" />
          </Dropdown.Menu>
        </Dropdown>
      </Menu.Item>
    </div>
  );
};
