# Calculadora de Figuras Geométricas 📐

Hola, soy Unai. En este README voy a explicar cómo utilizar este programa que he creado en Java.

## Cómo ejecutarlo
En primer lugar, tendrás que ejecutar el programa. Si utilizas **IntelliJ IDEA**:
* Haz clic en la flecha verde (Run).
* O utiliza el atajo de teclado `CTRL + F5`.

##  Funcionamiento
Al iniciar, el programa te pedirá cuántas figuras quieres añadir. Este número determinará el tamaño máximo del array (la memoria reservada).

AVISO: Solo puedes añadir hasta el número de figuras que hayas decidido al principio. No podrás añadir más formas cuando hayas alcanzado el límite; saltará.

###  El Menú
Después de definir el tamaño, aparecerá un menú donde decidirás qué figura quieres crear:

1.  Círculo: Te pedirá el `radio`. Mostrará el área y perímetro calculados.
2.  Rectángulo: Te pedirá la `base` y la `altura`. Mostrará el área y perímetro calculados.
3.  Triángulo: Te pedirá la `base`, la `altura` y un `lado adicional` Este lado siendo necesario para calcular el perimetro
4.  Si quieres Salir y Mostrar Información.

###  Manejo de Errores
 ** AVISO 2: El programa dara un error si:
 * Si introduces un número negativo.
 * Si introduces una letra o otro carácter.

 El sistema dará un error y **no creará la figura** hasta que hayas introducido valores válidos.

##  Resumen Final
Cuando hayas terminado de añadir figuras, selecciona la opción 4.
El programa finalizará mostrándote una lista con estos datos:
* Tipo de figura.
* Dimensiones (Base/Altura o Radio).
* Área total.
* Perímetro total.
