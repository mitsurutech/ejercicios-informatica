// El parámetro fetcher es una función como fetch: recibe una dirección y devuelve
// una promesa. La respuesta tiene ok, status y json(). Usa siempre await.
// Cada producto del menú es un objeto como { name: 'Zumo', price: 2 }.

// Pide la dirección y devuelve la lista de productos.
// Si la respuesta no es ok, o si el fetcher falla, devuelve [].
async function loadMenu(fetcher, url) {
  return null;
}

// Devuelve la lista con solo los nombres de los productos.
async function menuNames(fetcher, url) {
  return null;
}

// Devuelve el nombre del producto más barato. Si hay empate, el primero.
// Si no hay productos, devuelve un texto vacío ''.
async function cheapest(fetcher, url) {
  return null;
}

// Suma el precio de los productos cuyo nombre está en la lista wanted.
// Los nombres que no están en el menú no suman nada.
async function totalPrice(fetcher, url, wanted) {
  return null;
}
