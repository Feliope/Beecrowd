var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var A = parseFloat(lines.shift())
var B = parseFloat(lines.shift())
var MED = ((A * 3.5) + (B * 7.5)) / 11
console.log(`MEDIA = ${MED.toFixed(5)}`)