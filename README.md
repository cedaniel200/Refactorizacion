# Refactorización

Proceso de cambiar un sistema de software de tal manera que
no altera el comportamiento externo del código pero mejora
su estructura interna. Es una forma disciplinada de *limpiar el código* 
que minimiza las posibilidades de introducir errores.

El problema de la refactorización es que puede ser costoso y altamente peligroso, 
puesto que se debe cambiar código que funciona por código que no sabemos si puede 
funcionar por mejor escrito que este. Como solución a este inconveniente se 
recomienda que el código (se vaya a refactorizar o no) tenga pruebas unitarias 
automatizadas.

Algunos métodos para la refactorización son los siguientes:

1) Rename
2) Extract Function
3) Inline
4) Extract Class
5) Encapsulate Attribute

Si quieres un catalogo mas completo puedes entrar a 
https://www.refactoring.com/catalog/

Este repositorio busca ser un primer acercamiento a la 
refactorización, por lo cual propone una serie de ejercicios
simples, para desarrollarlos se debe seguir el mismo orden 
en que se presentaron los métodos de refactorización y dentro
de cada paquete encontraras las instrucciones, empieza con 
remane.

Los ejericios consisten en ir refactorizando la clase 
Temperatura que puedes encontrar en cada paquete.

Para poder hacer los cambios con seguridad de que todo marcha bien
en el módulo de test encontraras en cada paquete su respectiva clase de test
para que después de cada cambio se pueda verificar que el software sigue funcionando 
como debía.

## Nota:
En el paquete solución encontraras nuestra clase con 
todos los cambios realizados (Refactorización).