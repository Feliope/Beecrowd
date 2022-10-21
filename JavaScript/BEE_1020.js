var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var N = parseInt(input)
var anos = parseInt(N / 365)
var meses = parseInt((N - (anos * 365)) / 30)
var dias = parseInt(N - (anos * 365) - (meses * 30))

console.log(`${anos} ano(s)`)
console.log(`${meses} mes(es)`)
console.log(`${dias} dia(s)`)