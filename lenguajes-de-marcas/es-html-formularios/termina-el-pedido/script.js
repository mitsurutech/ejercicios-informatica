// Evita que la página se recargue y enseña la respuesta.
document.querySelector('form').addEventListener('submit', function (event) {
  event.preventDefault();
  var name = document.querySelector('#name').value;
  document.querySelector('#answer').textContent = 'Gracias, ' + name + '. Tu pedido está en marcha.';
});
