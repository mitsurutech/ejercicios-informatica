<?php
// El precio de la entrada de un cine, según la edad:
// menos de 12 años: 4 euros. De 12 a 64 años: 8 euros. De 65 en adelante: 5 euros.
function ticketPrice(int $age): int {
    return 0;
}

// Una cuenta atrás como texto. Con 3 devuelve: 3, 2, 1, ¡ya!
// Con 0 devuelve solo: ¡ya!
function countdown(int $from): string {
    return "";
}

// La suma de los números desde 1 hasta n. Con 4 devuelve 10 (1 + 2 + 3 + 4).
function sumUpTo(int $n): int {
    return 0;
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    echo ticketPrice(30) . "\n";
    echo countdown(3) . "\n";
    echo sumUpTo(4) . "\n";
}
