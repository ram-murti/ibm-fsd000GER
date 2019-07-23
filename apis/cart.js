const server = require('express').Router();
const PService = require('../services/cartService').cartService;
const cartService = new PService();
const setContentHeader = require('../services/utils').setContentHeader;

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
module.exports.cartRoutes = server;