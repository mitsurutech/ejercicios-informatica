# Una API que responde JSON: ejercicio `api-de-autobuses`

> **Lección:** Una API que responde JSON, en la [vista previa gratuita del curso](https://mitsurutech.co.uk/resources/course/es)

## Qué hay que hacer

Vas a preparar la respuesta de una API de autobuses. Completa cinco funciones. okResponse recibe una lista y devuelve un array con status "ok", count (cuántos hay) e items (la lista), en ese orden. errorResponse devuelve un array con status "error" y message. toJson convierte un array en texto JSON con json_encode, con JSON_UNESCAPED_UNICODE y JSON_UNESCAPED_SLASHES. httpCode devuelve 200 si el status es "ok" y 404 en cualquier otro caso. lineAnswer recibe la lista de autobuses y una línea: si la línea está vacía, responde con todos; si no, solo con los de esa línea; y si no hay ninguno, con un error.

## Archivos de partida

- `main.php`

Escribe tu respuesta en `main.php`. Para probarla, ejecuta `php main.php`.

## ¿Te has atascado?

Mira la [vista previa gratuita del curso](https://mitsurutech.co.uk/resources/course/es): cada lección explica la idea antes de dejarte probar.

## Que corrijan tu trabajo

Aquí no hay solución ni prueba, a propósito. En la [plataforma de aprendizaje MitsuruTech](https://mitsurutech.co.uk/es/learning), un profesor puede poner este ejercicio a una clase y corregirlo. Una cuenta de centro es [gratis el primer año](https://mitsurutech.co.uk/es/pricing) para hasta 50 estudiantes.

[Todos los ejercicios](../../../README.md)

Bajo licencia [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.es), de Mitsuru Technologies Ltd.
