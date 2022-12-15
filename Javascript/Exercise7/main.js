let number = prompt("Ingrese número");
    let result = numParImpar(number);

    let frase = prompt("Ingrese una cadena de texto");

    function numParImpar(number) {
        if (number % 2 == 0)
            return "par";
        else return "impar";

    }
    alert(number + " es " + result);

    alert(cadenaTexto(frase));

    function cadenaTexto(cadena) {
        let cadenas = "La cadena "  + cadena + " tiene ";
        if (cadena == cadena.toUpperCase()) {
            alert(cadenas += "solo mayúsculas")
        }
        else if (cadena == cadena.toLowerCase()) {
            alert(cadenas += "solo minúsculas")
        }
        else {
            alert(cadenas += " mayúsculas y minúsculas")
        }
        return cadenas;
    }
