var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var line1 = lines.shift().split(" ")
var line2 = lines.shift().split(" ")
var X1 = parseFloat(line1.shift())
var Y1 = parseFloat(line1.shift())
var X2 = parseFloat(line2.shift())
var Y2 = parseFloat(line2.shift())
console.log((Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2))).toFixed(4))
