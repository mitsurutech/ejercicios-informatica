<?php
// Precio con IVA. Si no se dice el porcentaje, se usa el 10.
// Con 10 euros y el 10 % devuelve 11 euros.
function withVat(float $price, int $percent): float {
    return 0.0;
}

// Un saludo. Si no se dice cuál, se usa "Hola".
// Con "Marta" devuelve: Hola, Marta!
function greet(string $name, string $greeting): string {
    return "";
}

// Dice si un número es par: el resto de dividir entre 2 es 0.
function isEven(int $n): bool {
    return false;
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    echo withVat(10) . "\n";
    echo greet("Marta") . "\n";
    echo greet("Iker", "Buenas") . "\n";
    var_dump(isEven(4));
}
