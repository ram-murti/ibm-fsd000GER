const server = require('express').Router();
const PService = require('../services/cartService').cartService;
const cartService = new PService();
const setContentHeader = require('../services/utils').setContentHeader;
const Email = require('../services/email.service').Email;

const emailService = new Email();


server.get('/', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        cart: cartService.all()

    }));

});
server.post('/add', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        cart: cartService.add(req.body)

    }));
});
server.post('/removeIndex', (req, res) => {

    setContentHeader(res);
    console.log(req.body);

    res.end(JSON.stringify({

        cart: cartService.index(req.body)

    }));
});
server.post('/Email', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        Email: cartService.email(req.body)
    }));
});
module.exports.cartRoutes = server;