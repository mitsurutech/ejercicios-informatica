const tasks = [{ title: 'Hacer los deberes', done: false }];

const form = document.querySelector('#form');
const field = document.querySelector('#title');
const list = document.querySelector('#list');
const left = document.querySelector('#left');

// 1. Pinta cada tarea con un li. Si está hecha, ponle la clase done.
//    Al hacer clic en el li, da la vuelta a task.done y pinta otra vez.
function render() {
  list.textContent = '';
  // Tu código aquí.
}

// 2. Al enviar el formulario: para el envío, ignora el texto vacío,
//    añade { title: texto, done: false } a tasks, vacía el campo y pinta.

// 3. Cada li lleva un botón Borrar que quita esa tarea de tasks y pinta otra vez.

// 4. Escribe en #left cuántas tareas faltan por hacer.

// 5. Extra: guarda las tareas con localStorage para que no se pierdan al recargar.

render();
