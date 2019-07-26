const pen = require('../db/pen').pen;

class penService {

    constructor() {

        this.pen = pen;
    }
    all() {
        return this.pen = pen;
    }
    add(pen) {
        this.pen.push(pen);
        return this.pen = pen;
    }


}
module.exports.penService = penService;