let number1 = prompt("Ingrese número 1");
    let number2 = prompt("Ingrese número 2");
    if (number2 >= 0) {
        alert(number2 + " es positivo");
    }
    if (number1 < 0 || number1 != 0) {
        alert(number1 + " es negativo o distinto de cero");
    }
    if (++number1 < number2) {
        alert(number1+ " y " +number2 + " Incrementar en 1 unidad el valor de numero1 no lo hace mayor o igual que numero2");
    };