var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

let X = parseFloat(lines.shift())
let Y = parseFloat(lines.shift())

if(Math.sign(X) == 1){
    if(Math.sign(Y) == 1)
        console.log("Q1")
    if(Math.sign(Y) == -1)
        console.log("Q4")
    if(Math.sign(Y) == 0)
        console.log("Eixo X")
}
else if(Math.sign(X) == -1){
    if(Math.sign(Y) == 1)
        console.log("Q2")
    if(Math.sign(Y) == -1)
        console.log("Q3")
    if(Math.sign(Y) == 0)
        console.log("Eixo X")
}

else if(Math.sign(X) == 0){
    if(Math.sign(Y) == 1)
        console.log("Eixo Y")
    if(Math.sign(Y) == -1)
        console.log("Eixo Y")
    if(Math.sign(Y) == 0)
        console.log("Origem")
}