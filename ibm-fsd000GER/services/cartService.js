const cart = require('../db/cart').cart;
const Email = require('./email.service').Email;

const emailService = new Email();
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
    index(company) {
        let index;
        this.cart.find((e, j) => {
            index = j;
            return e.company == company.company;


        })
        this.cart.splice(index, 1);
        return this.cart


    }
    email(user) {

        let userObj = {

            subject: "User Registration",

            body: user.invoice,

            from: null,

            to: user.email

        }

        emailService.emailWithAttachment(userObj);

    }

}


module.exports.cartService = cartService;