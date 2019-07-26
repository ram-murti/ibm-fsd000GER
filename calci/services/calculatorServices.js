const result = require('../db/result').result;
class calculatorService {

    constructor() {

        this.result = result;
    }

    calc(a) {
        if (a.operator == '+') {
            this.result = parseInt(a.numb1) + parseInt(a.numb2);
            return this.result
        } else if (a.operator == '-') {
            this.result = parseInt(a.numb1) - parseInt(a.numb2);
            return this.result
        } else if (a.operator == '*') {
            this.result = parseInt(a.numb1) * parseInt(a.numb2);
            return this.result
        } else if (a.operator == '/') {
            this.result = parseInt(a.numb1) / parseInt(a.numb2);
            return this.result
        } else if (a.operator == '^') {
            this.result = Math.pow(parseInt(a.numb1), parseInt(a.numb2));
            return this.result
        } else if (a.operator == 'sqrt') {

            this.result = Math.sqrt(parseInt(a.numb1));
            return this.result
        }





    }
}
module.exports.calculatorService = calculatorService;