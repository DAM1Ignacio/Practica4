# Practica4
Practica 4 primer trimestre del primer año de DAM

# Ejercicios
### 3. ValorMasRepetido
  - Escribe un método que se llame frecuenciaNumero() que recibe un vector de enteros y un número. Devuelve la frecuencia entre los elementos del vector del número recibido.
  - Prueba el método pedido desde main().
  - Deben seguirse los principios y estilo del código limpio.
    
### 4. ComparacionVectoresInt
  - Escribe un método que se llame vectoresIntIguales() que recibe dos vectores de enteros. Devuelve true si son iguales.
  - Dos vectores son iguales si tienen la misma longitud y los valores, elemento a elemento, son iguales. La segunda condición se puede comprobar con un bucle.
  - Deben seguirse los principios y estilo del código limpio.
### 5. ComparacionVectoresChar
  - Escribe un método que se llame compararVectoresChar() que recibe dos vectores de caracteres. Devuelve 0 si son iguales, 1 si el primero es mayor y -1 si el primero es menos.
  - Prueba el método pedido desde main().
  - El orden alfabético de vectores de caracteres requiere la comparación uno a uno de sus caracteres, comenzando desde el extremo izquierdo. El orden alfabético corresponde al orden numérico creciente del código del carácter.
  - Deben seguirse los principios y estilo del código limpio.
### 6. NumerosConsecutivos
  - Escribe un método que se llame maximoIntConsecutivos() que recibe un vector de enteros. Devuelve cuantos valores son consecutivos entre sus elementos. Si devuelve 1 todos los elementos son diferentes.
  - Por ejemplo: {3, 5, 3, 4, 5, 5, 4} devolvería 2.
  - Prueba el método pedido desde main().
  - Recorriendo los datos de izquierda a derecha, empezando por el segundo elemento hay que comprobar si es secuencia del anterior. Se puede utilizar un contador iniciado en 1 que se incrementa al comprobarse que un elemento es consecutivo del anterior. Cada vez que se inicia nueva secuencia hay que guardar el valor del contador en una variable auxiliar con el máximo alcanzado.
  - Deben seguirse los principios y estilo del código limpio.
### 7. BusquedaEnVector
  - Escribe un método que se llame buscarInt() que recibe un vector de enteros y un valor a buscar dentro del vector. Devuelve el índice de la primera ocurrencia dentro del vector proporcionado.
  - Por ejemplo: {3, 2, 3, 4, 7, 2, 4} si se busca 4 devolvería 3.
  - Prueba el método pedido desde main().
  - Hay que recorrer el vector secuencialmente y si se encuentra hay que terminar sin llegar al final del recorrido.
  - Deben seguirse los principios y estilo del código limpio.
### 8. VectorOrdenado
  - Escribe un método que se llame yaOrdenadoInt() que recibe un vector de enteros. Devuelve true si está ordenado.
  - Por ejemplo: {3, 2, 3, 4, 7, 2, 4} devolvería false.
  - Prueba el método pedido desde main().
  - Hay que recorrer el vector secuencialmente comprobando por parejas y si se encuentra un par de elementos desordenados hay que terminar sin llegar al final del recorrido.
  - Deben seguirse los principios y estilo del código limpio.
### 9. ValorMasRepetido
  - Escribe un método que se llame masFrecuenteInt() que recibe un vector de enteros. Devuelve el valor del elemento más frecuente, si hay coincidencia devolvería el primero de ellos.
  - Por ejemplo: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} devolvería 4
  - Prueba el método pedido desde main().
  - Una forma sería recorrer el vector anidar un bucle que averigüe la frecuencia del valor de cada elemento, utilizando un par de variables auxiliares para retener la frecuencia máxima y el valor asociado.
  - Deben seguirse los principios y estilo del código limpio.
### 10. DibujaLetra
  - Escribe un método que se llame buscarSecuenciaInt() que recibe dos vectores de enteros, el segundo es una secuencia de valores a buscar en el primer vector. Devuelve el índice donde empieza la primera ocurrencia de la secuencia buscada.
  - Por ejemplo: {4, 3, 1, 4, 2, 5, 8} y {4, 2, 5} devolvería 3.
  - Prueba el método pedido desde main().
  - Hay que recorrer el vector secuencialmente comprobando coincidencia con el primer elemento de la secuencia buscada. Después hay que comprobarla completamente con otro bucle. Si hay coincidencia completa termina sin llegar al final del recorrido.
  - Deben seguirse los principios y estilo del código limpio.
### 11. SecuenciasNaturales
  - Escribe un método que se llame bannerLetra() que recibe un carácter como parámetro y devuelve una cadena de caracteres con el texto, formateado sobre una matriz de 7x7, de la letra correspondiente al carácter recibido.
  - Por ejemplo si se introduce la H, la cadena devuelta, al imprimirla, daría:
        H     H

        H     H

        H     H
 
        HHHHHHH
 
        H     H     
 
        H     H

        H     H

  - Sólo se admiten letras en mayúsculas.
  - Prueba exhaustivamente el métodos pedido desde main().
  - Deben seguirse los principios y estilo del código limpio.
### 12. SecuenciasNumerales
  - Escribe cuatro métodos que se llamen secuenciaNaturalIntA(), secuenciaNaturalIntB(), secuenciaNaturalIntC() y secuenciaNaturalIntD().
  - Cada método recibe respectivamente un valor que representa el lado de una matriz cuadrada de tamaño N; deben rellenar el corespondiente array según los patrones del gráfico adjunto. Devuelven respectivamente la matriz generada.
  - La secuencia natural es 1, 2, 3 ... N.
  - Para un tamaño de 4x4 serían:
  
  ![alt text](http://i.imgur.com/RYjfYT9.png)

  - Prueba los métodos pedido desde main().
  - Hay que utilizar dos bucles anidados y manipular los índices de manera que las secuencias de ejecución produzcan los patrones de distribución indicados.
  - Para el caso d) se puede aplicar la siguiente estrategia:
  - A partir de la posición [0][0] hay que bajar N veces.
  - A continuación, se pasa a la derecha N-1 veces, luego sube N-1 veces, luego a la izquierda N-2 veces, luego hacia abajo N-2 veces, etc. Cada vez que se mueve un paso se produce un número de la secuencia natural 1, 2, 3, ..., NxN.
  - Deben seguirse los principios y estilo del código limpio.

