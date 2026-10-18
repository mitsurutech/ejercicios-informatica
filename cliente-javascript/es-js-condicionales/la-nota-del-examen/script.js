// La nota de un examen, de 0 a 10.
const grade = 7;
let message;

// Escribe un if con varias ramas.
//   Menos de 0 o más de 10: 'Nota no válida'
//   Menos de 5: 'Suspenso'
//   Menos de 7: 'Aprobado'
//   Menos de 9: 'Notable'
//   Lo demás: 'Sobresaliente'

document.querySelector('#output').textContent = 'Nota ' + grade + ': ' + message;
