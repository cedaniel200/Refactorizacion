# Extract Function

## Qué es

En ocasiones se tienen métodos que tienen muchas líneas, realizan más responsabilidades de las que
deberían o simplemente no queda claro para qué sirven. Para solucionarlo se crea un método, o varios,
donde se realice la operación que se quiere extraer del método principal, con el fin de separar las
responsabilidades o de entender mejor el método.

## Ejercicio

Toma la clase `Termometro` y crea los métodos necesarios para que sea más legible y mantenible, es
decir, para que sea un código más limpio.

## Pistas

- El método `convertirGradosSegunTipo` debe desaparecer y dar paso a dos métodos: uno para convertir
  Celsius a Fahrenheit y otro para convertir Fahrenheit a Celsius.
- Al hacerlo, cambia en el test la referencia a esos métodos nuevos.

## Siguiente paso

[Inline](../inline/README.md)
