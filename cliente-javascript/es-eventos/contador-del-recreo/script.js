// El número de bocadillos empieza en cero.
let count = 0;
const output = document.querySelector('#count');

function showCount() {
  output.textContent = 'Bocadillos: ' + count;
}

showCount();

// 1. Al pulsar #more, suma uno y enseña el número.
// 2. Al pulsar #less, resta uno. Nunca puede bajar de cero.
// 3. Al pulsar #reset, vuelve a cero.
// 4. Extra: si el número llega a 10, cambia el color del texto a rojo.
