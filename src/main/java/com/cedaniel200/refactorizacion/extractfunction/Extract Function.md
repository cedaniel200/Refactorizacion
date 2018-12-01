# Extract Function

En ocasiones se tienen métodos que tienen muchas líneas, realiza 
más responsabilidades de las que debería hacer o simplemente no 
queda claro para que se quiere ese método. Para solucionar lo anterior
se debe crear un método o métodos donde se realice la operación que 
se quiere extraer del método principal con el fin de separar las
responsabilidades o entender mejor el método.

## Ejercicio

Toma la clase Termometro y crea los métodos necesarios  
para que sea más legible y mantenible, es decir, sea 
un código más limpio.

### Notas: 
1)  El método convertirGradosSegunTipo debe desaparecer 
dando paso a dos métodos, uno para convertir celsius a 
fahrenheit y para convertir fahrenheit a celsius por lo que 
debes cambiar en el respectivo test la referencia a estos
nuevos métodos.
2)  Despues debes seguir con Inline