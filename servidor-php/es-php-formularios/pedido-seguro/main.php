<?php
// Recibe lo que envía el formulario del bar y escribe una línea con el pedido.
// $data es un array con los campos "name" y "dish".
// Con ["name" => "Ana", "dish" => "tortilla"] devuelve: Pedido de Ana: tortilla
// Si falta el nombre, usa "visitante". Si falta el plato, usa "ninguno".
// Quita los espacios de los lados con trim y escapa los dos datos con htmlspecialchars.
function orderText(array $data): string {
    return "";
}

// Crea el enlace de una búsqueda. Con "tortilla" devuelve: buscar.php?q=tortilla
// Usa urlencode para que los espacios y las tildes viajen bien.
function searchLink(string $term): string {
    return "";
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    echo orderText(["name" => "Ana", "dish" => "tortilla"]) . "\n";
    echo orderText([]) . "\n";
    echo searchLink("café con leche") . "\n";
}
