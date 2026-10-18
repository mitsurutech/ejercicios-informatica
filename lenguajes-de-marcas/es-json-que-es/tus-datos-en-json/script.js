// Lee el texto de la etiqueta pre y comprueba si es JSON correcto.
var text = document.querySelector('#data').textContent;
var out = document.querySelector('#out');
try {
  var data = JSON.parse(text);
  out.textContent = 'JSON correcto. Jugador: ' + data.name + ', de ' + data.age + ' años.';
  out.style.color = 'green';
} catch (error) {
  out.textContent = 'El JSON tiene un error. Revisa las comas y las comillas.';
  out.style.color = 'crimson';
}
