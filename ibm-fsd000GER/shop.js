const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const penRoutes = require('./apis/pen').penRoutes;
const trimmerRoutes = require('./apis/trimmer').trimmerRoutes;
const cartRoutes = require('./apis/cart').cartRoutes;
const setContentHeader = require('./services/utils').setContentHeader;
const Email = require('./services/email.service').Email;

const emailService = new Email();
server.use(parser.json());

server.use(cors());
server.get('/status', (rq, rs) => {

    emailService.send();

    rs.status(200).json({

        message: 'Service is running'

    });

});
server.use('/pen', penRoutes);
server.use('/trimmer', trimmerRoutes);
server.use('/cart', cartRoutes);


server.listen(1222, () => {

    console.log('Server started at 1222');

});