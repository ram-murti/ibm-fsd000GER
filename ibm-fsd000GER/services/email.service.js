const nodemailer = require('nodemailer');

const utills = require('./utills').utills;

class Email {

    constructor() {

        this.smtpSetup = {

            service: utills.smtp.provider,

            auth: {

                user: utills.smtp.address,

                pass: utills.smtp.password

            }

        }


        this.mailer = nodemailer.createTransport(this.smtpSetup);

    }

    email(userObj) {



        if (userObj.from == null) {

            userObj.from = utils.smtp.address;

        }

        this.mailer.sendMail({

            from: userObj.from,

            to: userObj.to,

            subject: userObj.subject,



            html: userObj.body

        }, (err, response) => {

            if (err) {

                console.log(err);

                return "Unable to send email";

            } else {

                console.log('Email Sent');

                return "Email Sent Successfully";
            }
        })
    }
    emailWithAttachment(userObj) {
        if (userObj.from == null) {

            userObj.from = utills.smtp.address;

        }

        this.mailer.sendMail({

            from: userObj.from,

            to: userObj.to,

            subject: userObj.subject,



            html: userObj.body

        }, (err, response) => {

            if (err) {

                console.log(err);

                return "Unable to send email";

            } else {

                console.log('Email Sent');

                return "Email Sent Successfully";

            }

        })

    }

}

module.exports.Email = Email;