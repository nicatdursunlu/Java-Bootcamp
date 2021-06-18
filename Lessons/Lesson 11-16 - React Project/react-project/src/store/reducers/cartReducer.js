import { ADD_TO_CART, REMOVE_FROM_CART } from "../actions/cartActions";
import { cartItems } from "../initialValues/cartItems";

const initialState = {
  cartItems: cartItems,
};

export const cartReducer = (state = initialState, { type, payload }) => {
  switch (type) {
    case ADD_TO_CART:
      let product = state.cartItems.find(
        (cart) => cart.product.id === payload.id
      );
      return product;

    case REMOVE_FROM_CART:
      return state;

    default:
      state;
  }
};
