var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var line = input.split(' ')
let A = parseInt(line.shift())
let B = parseInt(line.shift())
let C = parseInt(line.shift())
let D = parseInt(line.shift())

if((B > C && D > A) && (C+D > A+B) && (Math.sign(C) == 1 && Math.sign(D) == 1) && (A % 2 == 0))
    console.log("Valores aceitos")
else
    console.log("Valores nao aceitos")