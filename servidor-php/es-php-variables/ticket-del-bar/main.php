<?php
// Une el nombre y el apellido con un espacio. Ejemplo: Lucía Pérez
function fullName(string $first, string $last): string {
    return "";
}

// El precio de unos cafés: la cantidad por el precio de cada uno.
function totalPrice(int $coffees, float $price): float {
    return 0.0;
}

// Un ticket con este formato: Ana: 3 cafés, total 4,50 euros
// El total lleva dos decimales y coma decimal: usa number_format.
function receipt(string $name, int $coffees, float $price): string {
    return "";
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    echo fullName("Lucía", "Pérez") . "\n";
    echo totalPrice(3, 1.5) . "\n";
    echo receipt("Ana", 3, 1.5) . "\n";
}
