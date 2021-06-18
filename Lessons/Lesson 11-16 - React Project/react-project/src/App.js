import { BrowserRouter } from "react-router-dom";
import { Provider } from "react-redux";
import { Container } from "semantic-ui-react";
import "semantic-ui-css/semantic.min.css";
import "react-toastify/dist/ReactToastify.css";

import "./App.css";
import { Dashboard } from "./layouts/Dashboard";
import { Nav } from "./layouts/Nav";
import { configureStore } from "./store/configureStore";

function App() {
  const store = configureStore();

  return (
    <div className="App">
      <Provider store={store}>
        <BrowserRouter>
          <Nav />
          <Container className="main">
            <Dashboard />
          </Container>
        </BrowserRouter>
      </Provider>
    </div>
  );
}

export default App;
