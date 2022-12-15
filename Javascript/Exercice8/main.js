let infoEnl = document.getElementById("enlaces");
  let infoParr = document.getElementById("parrafo");

  let enlaces = document.getElementsByTagName("a");
  infoEnl.innerHTML = "Cantidad de enlaces  "+enlaces.length;

  let mensaje = "El último enlace apunta a: "+enlaces[enlaces.length-1].href;
  infoEnl.innerHTML = infoEnl.innerHTML + "<br/>" + mensaje;

 
  let parrafo = document.getElementsByTagName("p");
  infoParr.innerHTML = "Cantidad de parrafos  "+ parrafo.length;

 
 function crearParrafo() {
 
 let p = document.createElement("p");
 let pTexto = document.createTextNode("Ejemplo de crear un parrafo por Javascript.");
 p.appendChild(pTexto);

 document.body.appendChild(p);

}

window.onload = crearParrafo;