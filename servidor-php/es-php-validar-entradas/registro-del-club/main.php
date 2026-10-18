<?php
// field lee un campo del array $data y lo deja limpio.
// - Si el campo no existe, devuelve "".
// - Si el campo no es un texto (por ejemplo, una lista), devuelve "".
// - Si es un texto, devuelve el texto sin espacios a los lados (trim).
function field(array $data, string $key): string {
    return "x";
}

// validateSignup comprueba el registro de un club y devuelve un array de errores.
// La clave es el nombre del campo y el valor es un mensaje en español.
// Reglas:
// - name: no puede estar vacío y tiene como máximo 30 letras (usa strlen).
// - email: tiene que ser un correo válido (filter_var con FILTER_VALIDATE_EMAIL).
// - age: un número entero entre 14 y 99 (filter_var con FILTER_VALIDATE_INT).
// Si todo está bien, devuelve un array vacío. Los errores van en este orden: name, email, age.
// Lee todos los campos con field.
function validateSignup(array $data): array {
    return ["name" => "x"];
}

// Esto ejecuta tus funciones al pulsar Ejecutar. No lo toques.
if (realpath($_SERVER['argv'][0] ?? '') === __FILE__) {
    $good = ["name" => "Ana", "email" => "ana@correo.es", "age" => "17"];
    $bad = ["name" => "  ", "email" => "ana@", "age" => "13"];
    echo count(validateSignup($good)) . " errores\n";
    echo implode(", ", array_keys(validateSignup($bad))) . "\n";
}
