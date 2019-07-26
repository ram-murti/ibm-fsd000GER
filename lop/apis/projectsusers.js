const server = require('express').Router();
const PS1ervice = require('../services/puservice').Puservice;

const Puservice = new PS1ervice();
const setContentHeader = require('../services/utils').setContentHeader;

server.get('/', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        prouse: Puservice._all()

    }));

});
server.post('/add', (req, res) => {

    setContentHeader(res);

    res.end(JSON.stringify({

        prouse: Puservice._add(req.body)

    }));

});
module.exports.project1Routes = server;