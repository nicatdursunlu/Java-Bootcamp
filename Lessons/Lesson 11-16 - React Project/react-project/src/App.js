import "./App.css";
import "semantic-ui-css/semantic.min.css";
import { BrowserRouter } from "react-router-dom";
import { Container } from "semantic-ui-react";

import { Dashboard } from "./layouts/Dashboard";
import { Nav } from "./layouts/Nav";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Nav />
        <Container className="main">
          <Dashboard />
        </Container>
      </BrowserRouter>
    </div>
  );
}

export default App;
