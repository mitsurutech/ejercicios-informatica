<?php
// La suma de todos los números de la lista. Con [4, 6, 10] devuelve 20.
function sumOf(array $numbers): int {
    return 0;
}

// Cuántas notas son un aprobado: 5 o más. Con [4, 5, 9, 2] devuelve 2.
function countPassed(array $grades): int {
    return 0;
}

// El precio de un plato en la carta, que es un array con nombre.
// Si el plato no está en la carta, devuelve -1.
function priceOf(array $menu, string $dish): int {
    return 0;
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    echo sumOf([4, 6, 10]) . "\n";
    echo countPassed([4, 5, 9, 2]) . "\n";
    echo priceOf(["bocadillo" => 3, "café" => 1], "zumo") . "\n";
}
