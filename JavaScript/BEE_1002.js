var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var N = parseFloat(lines.shift())
console.log(`A=${(3.14159 * (N**2)).toFixed(4)}`)