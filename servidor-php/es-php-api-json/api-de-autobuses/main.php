<?php
// okResponse recibe una lista de cosas y devuelve este array con nombre, en este orden:
// "status" con el texto "ok", "count" con cuántas cosas hay y "items" con la lista.
function okResponse(array $items): array {
    return [];
}

// errorResponse devuelve un array con "status" con el texto "error" y "message" con el mensaje.
function errorResponse(string $message): array {
    return [];
}

// toJson convierte un array en texto JSON con json_encode.
// Usa JSON_UNESCAPED_UNICODE y JSON_UNESCAPED_SLASHES para que las tildes y las barras salgan tal cual.
function toJson(array $data): string {
    return "";
}

// httpCode devuelve 200 si "status" vale "ok" y 404 en cualquier otro caso.
function httpCode(array $data): int {
    return 0;
}

// lineAnswer responde a la pregunta "¿cuándo llega el autobús?".
// $buses es una lista de arrays con "line" y "minutes".
// - Si $line está vacía, devuelve okResponse con todos los autobuses.
// - Si no, devuelve okResponse solo con los de esa línea, en el mismo orden.
// - Si no hay ninguno de esa línea, devuelve errorResponse con un mensaje.
function lineAnswer(array $buses, string $line): array {
    return [];
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    $buses = [["line" => "L1", "minutes" => 4], ["line" => "L7", "minutes" => 12]];
    echo toJson(lineAnswer($buses, "L7")) . "\n";
    echo toJson(lineAnswer($buses, "L9")) . "\n";
}
