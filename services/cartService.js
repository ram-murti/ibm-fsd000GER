const cart = require('../db/cart').cart;

class cartService {

    constructor() {

        this.cart = cart;
    }
    all() {
        return this.cart;
    }
    add(cart1) {
        this.cart.push(cart1);
        return this.cart;
    }

}
module.exports.cartService = cartService;