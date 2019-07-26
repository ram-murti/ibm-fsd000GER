const server = require('express').Router();
const PService = require('../services/calculatorServices').calculatorService;
const calculatorService = new PService();

const setContentHeader = require('../services/utils').setContentHeader;

server.post('/', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        result: calculatorService.calc(req.body)

    }))
});
module.exports.calcyRoutes = server;