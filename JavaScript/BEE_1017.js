var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var X = parseInt(lines.shift())
var Y = parseInt(lines.shift())
console.log(((X * Y) / 12).toFixed(3))