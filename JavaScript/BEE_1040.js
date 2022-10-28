var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split("\n")
var line1 = lines.shift().split(" ")
var line2 = lines.shift().split(" ")

let A = parseFloat(line1.shift())
let B = parseFloat(line1.shift())
let C = parseFloat(line1.shift())
let D = parseFloat(line1.shift())
let MED = ((A*2) + (B*3) + (C*4) + D) / 10

if(MED >= 7.0){
    console.log(`Media: ${MED.toFixed(1)}`)
    console.log("Aluno aprovado.")
}
else if(MED < 5.0){
    console.log(`Media: ${MED.toFixed(1)}`)
    console.log("Aluno reprovado.")
}
else{
    console.log(`Media: ${MED.toFixed(1)}`)
    console.log("Aluno em exame.")
    let E = parseFloat(line2.shift())
    console.log(`Nota do exame: ${E.toFixed(1)}`)
    MED = (MED + E) / 2
    if(MED >= 5.0)
        console.log("Aluno aprovado.")
    else
        console.log("Aluno reprovado.")
    console.log(`Media final: ${MED.toFixed(1)}`)
}