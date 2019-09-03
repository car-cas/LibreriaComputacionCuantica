Realizado por Carlos Andrés Castañeda Lozano

# Librería computación Cuántica: Números complejos

Esta librería de computacion Cuántica podemos encontrar operaciones entre numeros complejos, los cuales tambien
se pueden extender en operaciones entre vectores y matrices.

# Operaciones 

## 1. Suma 

La operación "**suma**" recibe dos tuplas de numeros complejos y calcula su suma.

## 2. Producto

La operación "**producto**" recibe dos tuplas de numeros complejos y calcula su producto.

## 3. Resta

La operación "**resta**" recibe dos tuplas de numeros complejos y calcula su resta.

## 4. División

La operación "**division**" recibe dos tuplas de numeros complejos y calcula su división.

## 5. Módulo

La operación "**modulo**" recibe una tuplas de numeros complejos y calcula su modulo.

## 6. Conjugado

La operación "**conjugado**" recibe una tuplas de numeros complejos y calcula su conjugado.

## 7. Conversión entre representaciones polar y cartesiano

La operación "**polarACartesiano**" recibe una tuplas, un modulo y una fase o angulo y retorna un numero complejo.

## 8. Retornar la fase de un número complejo

La operación "**fase**" recibe una tuplas de numeros complejos y calcula su fase o angulo.

# Pruebas unitarias 

* Se crearon 8 pruebas las cuales corresponden a cada uno de las operaciones de numeros complejos, estas pruebas se encuentras en la clase **OperacionesTest**.

* Ejemplo:
```
    @Test
    public void sumaTest(){
        
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        Complejo c  = new Complejo(9,-4);
        Complejo respuesta = operacion.suma(a,b); 
        boolean x = operacion.equals(respuesta, c);
        assertEquals(x,flag);
                
    }
```

* Para cada una de las pruebas se implementó JUnit y Maven.
* Se creó un metodo "**equals**" la cual verifica si los resultados de las pruebas corresponden al resultado esperado
```
    @Override
    public boolean equals(Object obj) {
    
    	if (this == obj) return true;
    	if (this.getClass() != obj.getClass()) return false;
    	Complejo number = (Complejo) obj;
    	return this.numeroA == number.getNumeroA() && this.numeroB == number.getNumeroB();
        
    }
```
## Ejecución de las pruebas 

**Compiling**
```
$ mvn clean compile
```
**Packing**
```
$ mvn package
```
**Running the tests**
```
$ mvn test
```
![](src/site/resources/Cmd.png)

# Operaciones con vectores y matrices 

## 1. Adición de vectores complejos

La operación "**adicion**" calcula la suma de dos vectores complejos.

## 2. Inversa de vectores complejos

La operación "**inversa**" calcula la inversa de un vector de numeros complejos.

## 3. Multiplicación escalar de vectores complejos

La operación "**multiplicacionEscalar**" calcula la multipliacion escalar por un vector de numeros complejos y numero complejo.

## 4. Adición de matrices complejos

La operación "**adicionDeMatrices**" calcula la suma de dos matrices de numeros complejos.

## 5. Inversa de matrices complejos

La operación "**inversaDeMatriz**" calcula la inversa de una matriz de numeros complejos.

## 6. Multiplicación escalar de matrices complejas

La operación "**multiplicacionEscalarPorMatriz**" calcula la multipliacion escalar por una matriz de numeros complejos y numero complejo.

## 7. Matriz transpuesta

La operación "**matrizTranspuesta**" calcula la transpuesta de una matriz de numeros complejos.

## 8. Matriz conjugada

La operación "**matrizConjugada**" calcula la conjugacion de una matriz.

## 9. Matriz adjunta

La operación "**matrizAdjunta**" calcula la matriz adjunta de una matriz de numeros complejos.

## 10. Función para calcular la "acción" de una matriz sobre un vector

La operación "**accionMatrizSobreVector**" calcula la acción de una matriz sobre un vector.

## 11. Norma de matrices

La operación "**normaMatrices**" calcula la nora de una matriz de numeros reales.

## 12. Distancia entrematrices

La operación "**distanciaEntreMatrices**" calcula la distancia de dos matrices de reales.

## 13. Revisar si es unitaria

La operación "**matrizUnitaria**" verifica que la matriz sea unitaria.

## 14. Revisar si es Hermitian

La operación "**matrizHermitiana**" verifica que la matriz sea hermitiana.

## 15. Producto tensor

La operación "**productoTensor**" calcula el producto tensor de dos matrices.

# Pruebas unitarias para vectores y matrices

* Se creo una prueba por cada metodo implementado en el laboratorio. Estas pruebas se encuentras en la clase **OperacionesConVectoresTest** y **OperacionesConMatricesTest**.

* Ejemplo:

```
     @Test
    public void adicionDeVectoresTest(){
        
            OperacionesConVectores vector = new OperacionesConVectores();
            Complejo[] lista = new Complejo[2];
            Complejo[] listaDos = new Complejo[2];
            Complejo[] respuesta = new Complejo[2];
            lista[0] = new Complejo(7,3);
            lista[1] = new Complejo(4,1);
            listaDos[0] = new Complejo(4,2);
            listaDos[1] = new Complejo(3,2);
            respuesta[0] = new Complejo(11,5);
            respuesta[1] = new Complejo(7,3);
            Complejo[] c = vector.adicion(lista, listaDos);
            assertEquals(c,respuesta);
            
    }
```


# License
This project is under the Apache license - see [LICENSE](LICENSE.txt) for more details.
