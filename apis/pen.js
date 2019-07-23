const server = require('express').Router();
const PService = require('../services/penServices').penService;
const penService = new PService();
const setContentHeader = require('../services/utils').setContentHeader;

server.get('/', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        pen: penService.all()

    }));

});
server.post('/add', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        pen: penService.add(req.body)

    }));
});
module.exports.penRoutes = server;