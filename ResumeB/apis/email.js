const server = require('express').Router();
const UserService = require('../services/user.service').UserService;
const userService = new UserService();
const Email = require('../services/email.service').Email;
const setContentHeader = require('../services/utils').setContentHeader;
server.post('/', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        emailservice: userService.email(req.body)
    }));
});
module.exports = {
    server
}