const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const setContentHeader = require('./services/utils').setContentHeader;
const calcyRoutes = require('./api/calcy').calcyRoutes;
server.use(parser.json());

server.use(cors());
server.use('/calcy', calcyRoutes);
server.listen(1224, () => {

    console.log('Server started at 1224');

});