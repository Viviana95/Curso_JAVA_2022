let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
  
  let numero = prompt("Introduce tu número de DNI sin letra");
  var letra = prompt("Introduce la letra de tu DNI ");
  letra = letra.toUpperCase();
  
  if(numero < 0 || numero > 99999999) {
    alert("El número no es correcto");
  }
  else  {
    var letraCorrecta = letras[numero % 23];
    if(letraCorrecta != letra) {
      alert("La letra no es correcta");
    }
    else {
      alert("El número de DNI y su letra son correctos");
    }
  }