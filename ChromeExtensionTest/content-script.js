
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

document.addEventListener("DOMContentLoaded", function () {
    chrome.tabs.query({ active: true, currentWindow: true }, function (tabs) {
    var tab = tabs[0];
    var url = tab.url;
    var securityInfo = document.getElementById("security-info");

    var isSecure = isURLSecure(url);

    if (isSecure) {
        securityInfo.textContent = "El sitio web es seguro";
        securityInfo.classList.add("secure");
    } else {
        securityInfo.textContent = "El sitio web NO es seguro";
        securityInfo.classList.add("insecure");
    }
    });
});

function isURLSecure(url) {
    // Lógica de verificación de seguridad basada en la URL
    // Aquí puedes implementar tus propias reglas de seguridad basadas en la URL del sitio web

    if (url.startsWith("https://")) {
    return true;
    }

    return false;
}