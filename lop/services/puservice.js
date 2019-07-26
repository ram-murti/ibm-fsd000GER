const prouse = require('../db/prouse').prouse;
class Puservice {

    constructor() {


        this.prouse = prouse;

    }

    _all() {

        return this.prouse;

    }

    _add(prouse) {

        this.prouse.push(prouse);

        return this.prouse;

    }
}
module.exports.Puservice = Puservice;