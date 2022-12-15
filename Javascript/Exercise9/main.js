nombreV = document.getElementById("name").value;
precioValor = document.getElementById("precio").value;
impuesto = document.getElementById("impuesto").value;

function validar() {



    if (nombreV == 0) {
        alert('[ERROR] El campo nombre debe tener un valor');
        return false;
    }

    if (isNaN(precioValor) || precioValor == null) {
        alert('[ERROR] El campo precio debe tener un valor');
        return false;
    }
    if (precioValor < 120) {
        alert('El precio debe ser superior');
        return false;
    }

    if (impuesto < 16) {
        alert('impuesto bajo');
        return false;
    }
    return true;
    alert('Datos almacenados');

}

function validarCV() {
    let provincia = document.getElementById("provincia").selectedIndex;
    if (provincia == null || provincia == 0) {
        alert('Seleccione provincia');
        
    }
    let dia =document.getElementById('day').value
    if (dia == ""  || isNaN(parseInt(dia)) || dia > 31) {
        alert('El día no es válido');
        return false;
    }
    let mes = document.getElementById("month").selectedIndex;
    if (mes == null || mes == 0) {
        alert('Seleccione mes');
        return false;
    }
    let año = document.getElementById('year').value
    if (año == ""  || isNaN(parseInt(año))|| año >2023) {
        alert('El año no es válido');
        return false;
      }  
    else
        alert('Datos guardados correctamente')
    return true;
}