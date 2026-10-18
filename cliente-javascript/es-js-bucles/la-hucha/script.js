// Quieres comprar unas zapatillas de 60 euros y ahorras 7 euros a la semana.
const goal = 60;
const weekly = 7;
let saved = 0;
let weeks = 0;

// 1. Con un while, suma weekly a saved y 1 a weeks hasta llegar a goal o pasarlo.

document.querySelector('#output').textContent =
  'Necesitas ' + weeks + ' semanas y tendrás ' + saved + ' euros.';

// 2. Con un for, construye en countdown la cuenta atrás del recreo: 5 4 3 2 1 y al final ¡Recreo!
let countdown = '';

document.querySelector('#countdown').textContent = countdown;
