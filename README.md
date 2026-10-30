# Refactorización

![Java](https://img.shields.io/badge/Java-21-blue?style=flat-square&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit-5.14.4-25A162?style=flat-square&logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-5.24.0-78C257?style=flat-square)
![Gradle](https://img.shields.io/badge/Gradle-9.6.1-02303A?style=flat-square&logo=gradle&logoColor=white)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache_2.0-blue?style=flat-square)](LICENSE)

Taller práctico de **refactorización**: cinco ejercicios cortos sobre la misma pieza de código, uno por
técnica, en el orden en que conviene aprenderlas.

Refactorizar es cambiar un sistema de software de tal manera que no altera su comportamiento externo
pero mejora su estructura interna. Es una forma disciplinada de *limpiar el código* que minimiza las
posibilidades de introducir errores.

El riesgo está en que se cambia código que funciona por código que no sabemos si funcionará, por muy
bien escrito que esté. La defensa es la misma en todos los ejercicios: **pruebas unitarias
automatizadas** que se ejecutan después de cada cambio.

## Cómo funciona el taller

Cada paquete es una foto del mismo `Termometro` en un estado distinto. Se empieza por `rename` y se
avanza en orden: el resultado de un ejercicio es el punto de partida del siguiente.

| Paso | Técnica | Paquete | Ejercicio |
|---|---|---|---|
| 1 | Rename | [`rename`](src/main/java/com/cedaniel200/refactorizacion/rename/README.md) | Cambiar nombres de clases, métodos y variables por otros que se entiendan |
| 2 | Extract Function | [`extractfunction`](src/main/java/com/cedaniel200/refactorizacion/extractfunction/README.md) | Dividir `convertirGradosSegunTipo` en dos métodos con una responsabilidad cada uno |
| 3 | Inline | [`inline`](src/main/java/com/cedaniel200/refactorizacion/inline/README.md) | Eliminar variables temporales que solo guardan un valor para retornarlo |
| 4 | Extract Class | [`extractclass`](src/main/java/com/cedaniel200/refactorizacion/extractclass/README.md) | Mover cada conversión a una clase `Celsius` y `Fahrenheit` |
| 5 | Encapsulate Fields | [`encapsulatedfields`](src/main/java/com/cedaniel200/refactorizacion/encapsulatedfields/README.md) | Ajustar los modificadores de acceso a lo que realmente necesita cada clase |

Cada paquete trae su propio `README.md` con el enunciado y una clase `TemperaturaTest` con las
pruebas que deben seguir en verde después de cada paso. El paquete `solucion` tiene la versión final
con los cinco cambios aplicados.

## Estructura

```text
src/main/java/com/cedaniel200/refactorizacion
├── rename/                 # paso 1: nombres que no dicen nada (st, converTemp, ti, te)
├── extractfunction/        # paso 2: un método que decide según un tipo de conversión
├── inline/                 # paso 3: variables temporales que se pueden eliminar
├── extractclass/           # paso 4: las dos fórmulas viven en Termometro
├── encapsulatedfields/     # paso 5: campos sin modificador de acceso
└── solucion/               # resultado de aplicar los cinco pasos

src/test/java/com/cedaniel200/refactorizacion
└── <paquete>/TemperaturaTest.java   # una prueba por paquete: 0 °C → 32 °F y 32 °F → 0 °C
```

En cada paquete:

| Archivo | Para qué sirve |
|---|---|
| `SensorTemperatura.java` | Interfaz del sensor; se simula con Mockito |
| `Termometro.java` | La clase que se refactoriza |
| `README.md` | El enunciado del paso |

## Cómo ejecutarlo

Requiere JDK 21; el wrapper descarga Gradle 9.6.1.

```bash
./gradlew test          # ejecuta las 12 pruebas
./gradlew test --tests '*rename*'   # solo las de un paquete
```

También puedes abrir el proyecto en IntelliJ IDEA o VS Code y ejecutar los tests desde el IDE.

## Qué aprenderás

- Por qué no se refactoriza sin pruebas que respalden el cambio.
- Cinco técnicas habituales y en qué se diferencian.
- Que el mismo comportamiento se puede expresar con código más legible.
- Cómo los nombres, la longitud de los métodos y los modificadores de acceso afectan al mantenimiento.

## Catálogo completo

Este taller cubre cinco técnicas; el catálogo completo, con más de cien, está en
[refactoring.com/catalog](https://refactoring.com/catalog/).
