var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var [A, B, C] = input.split(" ").map(nums => parseInt(nums))
console.log(`${(((A + B + Math.abs(A - B)) / 2) + C + Math.abs(((A + B + Math.abs(A - B)) / 2) - C)) / 2} eh o maior`)