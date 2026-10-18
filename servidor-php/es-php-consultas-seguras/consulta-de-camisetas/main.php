<?php
// orderClause decide cómo se ordena la lista.
// Un marcador ? no vale para el nombre de una columna, así que usamos una lista permitida.
// Si $wanted es "price", devuelve "ORDER BY price".
// Con cualquier otro valor, devuelve "ORDER BY name".
function orderClause(string $wanted): string {
    return "";
}

// buildShirtQuery construye la consulta de las camisetas. Devuelve un array con dos claves:
// "sql" es el texto de la consulta y "params" es la lista de datos, en orden.
// Empieza con: SELECT id, name, price FROM shirt WHERE 1 = 1
// - Si $category no está vacía, añade " AND category = ?" y su valor a params.
// - Si $maxPrice no es null, añade " AND price <= ?" y su valor a params.
// - Al final añade un espacio y orderClause($order).
// Ningún dato del visitante puede acabar dentro del texto sql.
function buildShirtQuery(string $category = "", ?int $maxPrice = null, string $order = "name"): array {
    return ["sql" => "", "params" => []];
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    $query = buildShirtQuery("adulto", 20, "price");
    echo $query["sql"] . "\n";
    echo implode(", ", $query["params"]) . "\n";
}
