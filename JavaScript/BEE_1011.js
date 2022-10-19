var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var R = parseInt(lines.shift())
console.log(`VOLUME = ${((4/3) * 3.14159 * Math.pow(R,3)).toFixed(3)}`)