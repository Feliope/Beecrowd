var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');
const cod = [1, 2, 3, 4, 5]
const preço = [4.00, 4.50, 5.00, 2.00, 1.50]
let incod = parseInt(lines.shift())
let qtd = parseInt(lines.shift())

for(let i in cod){
    if(cod[i] == incod){
        console.log(`Total: R$ ${(preço[i] * qtd).toFixed(2)}`)
    }
}