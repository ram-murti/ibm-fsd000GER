const server = require('express').Router();
const PService = require('../services/trimmerService').trimmerService;
const trimmerService = new PService();
const setContentHeader = require('../services/utils').setContentHeader;
server.get('/', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        trimmer: trimmerService.all()
    }));
});

server.post('/add', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        trimmer: trimmerService.add(req.body)

    }));

});



module.exports.trimmerRoutes = server;