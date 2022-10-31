
let numero = 0;
alert("Hola somos Perricornios y te estamos protegiendo.")

function changeColor() {
    if (esPar(numero)) {
        document.getElementsByTagName("body")[0].style.backgroundColor = "red";
    } else {
        document.getElementsByTagName("body")[0].style.backgroundColor = "blue";

    }
    numero++;
}

function esPar(numero){
    return numero % 2 == 0;
}

setInterval(changeColor, 900);
