const client = require('mongodb').MongoClient;
const UserConstants = require('./util.service').UserConstants;
const bcrypt = require('bcrypt');
const Email = require('./email.service').Email;
const emailService = new Email();
class Service {

    email(user) {
        let userObj = {
            subject: "RESUME",
            body: "File",
            from: null,
            to: user.email
        }
        emailService.email(userObj);

    }
}
module.exports = {
    UserService: Service
}