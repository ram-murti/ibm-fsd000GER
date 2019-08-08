const server = require('express').Router();
const Email = require('../services/email.service').Email;
const emailService = new Email();
const UserService = require('../services/user.Service').UserService;
const setContentHeader = require('../services/utils').setContentHeader;
const userservice = new UserService();
server.post('/', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        emailService: userservice.email(req.body)
    }));
});
module.exports = {
    server
}