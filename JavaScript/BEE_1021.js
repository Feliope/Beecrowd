var input = require('fs').readFileSync('/dev/stdin', 'utf8');
let valor = parseFloat(input)
const notas = [100, 50, 20, 10, 5, 2]
const moedas = [1, 0.5, 0.25, 0.10, 0.05, 0.01]

console.log("NOTAS:")

for(let i in notas){
    let tnotas = parseInt(valor / notas[i])
    console.log(`${tnotas} nota(s) de R$ ${notas[i].toFixed(2)}`)
    valor %= notas[i]
}
console.log("MOEDAS:")
for (let i in moedas){
    let tmoedas = parseInt(valor / moedas[i])
    console.log(`${tmoedas} moeda(s) de R$ ${moedas[i].toFixed(2)}`)
    valor = (valor % moedas[i]) + 0.000001
}