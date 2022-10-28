var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var line = input.split(' ')
let A = parseFloat(line.shift())
let B = parseFloat(line.shift())
let C = parseFloat(line.shift())

let D = (B ** 2) - (4 * A * C)

if(A == 0 || Math.sign(D) == -1)
    console.log("Impossivel calcular")
else{
    console.log(`R1 = ${(((B * -1) + (Math.sqrt(D))) / (2 * A)).toFixed(5)}`)
    console.log(`R2 = ${(((B * -1) - (Math.sqrt(D))) / (2 * A)).toFixed(5)}`)
}