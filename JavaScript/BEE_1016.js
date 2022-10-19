var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var X = parseInt(lines.shift())
console.log(`${X * 2} minutos`)