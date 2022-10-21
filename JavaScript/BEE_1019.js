var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var tempo = parseInt(input)
var h = parseInt(tempo / 3600)
var m = parseInt((tempo - (h * 3600)) / 60)
var s = parseInt(tempo - (h * 3600) - (m * 60))
console.log(`${h}:${m}:${s}`)