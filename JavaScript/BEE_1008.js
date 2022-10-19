var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var func = parseInt(lines.shift())
var hours = parseInt(lines.shift())
var salary = parseFloat(lines.shift())
console.log(`NUMBER = ${func}`)
console.log(`SALARY = U$ ${(hours * salary).toFixed(2)}`)