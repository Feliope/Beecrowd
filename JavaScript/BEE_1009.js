var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var seller = (lines.shift())
var salary = parseFloat(lines.shift())
var sales = parseFloat(lines.shift())
console.log(`TOTAL = R$ ${(salary + (sales *0.15)).toFixed(2)}`)