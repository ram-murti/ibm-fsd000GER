const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const userRoutes = require('./apis/users').userRoutes;
const projectRoutes = require('./apis/projects').projectRoutes;
const project1Routes = require('./apis/projectsusers').project1Routes;
const setContentHeader = require('./services/utils').setContentHeader;

server.use(parser.json());

server.use(cors());
server.get('/status', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        message: "Server is RUNNING"
    }));
});
server.get('/message', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        name: req.query.name,
        email: req.query.email
    }));
});
server.use('/users', userRoutes);
server.use('/prouse', project1Routes);
server.use('/projects', projectRoutes);


server.listen(1269, () => {

    console.log('Server started at 1269');

});