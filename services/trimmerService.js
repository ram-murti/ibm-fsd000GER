const trimmer = require('../db/trimmer').trimmer;

class trimmerService {

    constructor() {

        this.trimmer = trimmer;
    }
    all() {
        return this.trimmer;
    }
    add(trimmer) {
        this.trimmer.push(trimmer);
        return this.trimmer;
    }

}
module.exports.trimmerService = trimmerService;