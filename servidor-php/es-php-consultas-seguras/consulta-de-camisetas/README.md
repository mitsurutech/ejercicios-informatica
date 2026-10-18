# Consultas seguras: ejercicio `consulta-de-camisetas`

> **Lección:** Consultas seguras, en la [vista previa gratuita del curso](https://mitsurutech.co.uk/resources/course/es)

## Qué hay que hacer

La tienda del club tiene una tabla shirt con las columnas id, name, category y price. Completa dos funciones. orderClause devuelve "ORDER BY price" si recibe "price" y "ORDER BY name" con cualquier otro valor. buildShirtQuery construye la consulta y devuelve un array con "sql" y "params". El sql empieza con SELECT id, name, price FROM shirt WHERE 1 = 1. Si hay categoría, añade " AND category = ?". Si hay precio máximo, añade " AND price <= ?". Al final añade un espacio y la cláusula de orden. Los valores van a params, en el mismo orden que los marcadores, y nunca dentro del sql.

## Archivos de partida

- `main.php`

Escribe tu respuesta en `main.php`. Para probarla, ejecuta `php main.php`.

## ¿Te has atascado?

Mira la [vista previa gratuita del curso](https://mitsurutech.co.uk/resources/course/es): cada lección explica la idea antes de dejarte probar.

## Que corrijan tu trabajo

Aquí no hay solución ni prueba, a propósito. En la [plataforma de aprendizaje MitsuruTech](https://mitsurutech.co.uk/es/learning), un profesor puede poner este ejercicio a una clase y corregirlo. Una cuenta de centro es [gratis el primer año](https://mitsurutech.co.uk/es/pricing) para hasta 50 estudiantes.

[Todos los ejercicios](../../../README.md)

Bajo licencia [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.es), de Mitsuru Technologies Ltd.
