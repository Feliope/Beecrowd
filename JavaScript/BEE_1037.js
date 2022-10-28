var input = require('fs').readFileSync('/dev/stdin', 'utf8');
let number = parseFloat(input)

if(number >= 0.0 && number <= 25.00)
    console.log("Intervalo [0,25]")
else if(number > 25.00 && number <= 50.00)
    console.log("Intervalo (25,50]")
else if(number > 50.00 && number <= 75.00)
    console.log("Intervalo (50,75]")
else if(number > 75.00 && number <= 100.00)
    console.log("Intervalo (75,100]")
else if(number < 0.0 || number > 100.00)
    console.log("Fora de intervalo")