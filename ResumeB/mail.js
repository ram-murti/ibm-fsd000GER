const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const emailRoutes = require('./apis/email').server;

server.use(parser.json());
server.use(cors());
server.use('/email', emailRoutes);
const PORT = 46768;
server.listen(PORT, () => {
    console.log(`Server is Started at ${PORT}`);
});