/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import eci.escuelaing.librerianumeroscomplejos.Complejo;
import eci.escuelaing.librerianumeroscomplejos.OperacionesConMatrices;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 * 
 * Unit test
 * 
 */
public class OperacionesConMatricesTest {
    
  
    @Test
    public void adicionMatrizTest(){  
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][] listaDos = new Complejo[2][2];
        Complejo[][] esperado = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(0,1);
        lista[1][0] = new Complejo(1,0);
        lista[1][1] = new Complejo(0,1);
        listaDos[0][0] = new Complejo(0,1);
        listaDos[0][1] = new Complejo(1,0);
        listaDos[1][0]= new Complejo(0,1);
        listaDos[1][1]= new Complejo(1,0);
        esperado[0][0] = new Complejo(1,1);
        esperado[0][1] = new Complejo(1,1);
        esperado[1][0] = new Complejo(1,1);
        esperado[1][1] = new Complejo(1,1);
        Complejo[][] respuesta = operacion.adicionDeMatrices(lista, listaDos) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
    public void inversaMatrizTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  esperado = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        esperado[0][0] = new Complejo(-1,-1);
        esperado[0][1] = new Complejo(-1,-1);
        esperado[1][0] = new Complejo(-1,-1);
        esperado[1][1] = new Complejo(-1,-1);
        Complejo[][] respuesta = operacion.inversaDeMatriz(lista) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
    public void escalarMatrizTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  esperado = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        esperado[0][0] = new Complejo(0,4);
        esperado[0][1] = new Complejo(0,4);
        esperado[1][0] = new Complejo(0,4);
        esperado[1][1] = new Complejo(0,4);
        Complejo nc= new Complejo(2,2);
        Complejo[][] respuesta = operacion.multiplicacionEscalarPorMatriz(lista, nc) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
    public void matrizTranspuestaTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  esperado = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(1,0);
        lista[1][0] = new Complejo(0,1);
        lista[1][1] = new Complejo(1,0);
        esperado[0][0] = new Complejo(1,0);
        esperado[0][1] = new Complejo(0,1);
        esperado[1][0] = new Complejo(1,0);
        esperado[1][1] = new Complejo(1,0);
        Complejo[][] respuesta = operacion.matrizTranspuesta(lista) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
     public void matrizConjugadaTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  esperado = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        esperado[0][0] = new Complejo(1,-1);
        esperado[0][1] = new Complejo(1,-1);
        esperado[1][0] = new Complejo(1,-1);
        esperado[1][1] = new Complejo(1,-1);
        Complejo[][] respuesta = operacion.matrizConjugada(lista) ;
        assertEquals(respuesta,esperado);
    }
     
    @Test
    public void matrizAdjuntaTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  esperado = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(1,0);
        lista[1][0] = new Complejo(0,1);
        lista[1][1] = new Complejo(1,0);
        esperado[0][0] = new Complejo(1,0);
        esperado[0][1] = new Complejo(0,-1);
        esperado[1][0] = new Complejo(1,0);
        esperado[1][1] = new Complejo(1,0);
        Complejo[][] respuesta = operacion.matrizAdjunta(lista) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
    public void accionMatrizTest() throws Exception {
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[3][3];
        Complejo[] listaDos = new Complejo[3];
        Complejo[] esperado = new Complejo[3];
        lista[0][0] = new Complejo(3, 2);
        lista[0][1] = new Complejo(0, 0);
        lista[0][2] = new Complejo(5, -6);
        lista[1][0] = new Complejo(1, 0);
        lista[1][1] = new Complejo(4, 2);
        lista[1][2] = new Complejo(0, 1);
        lista[2][0] = new Complejo(4, -1);
        lista[2][1] = new Complejo(0, 0);
        lista[2][2] = new Complejo(4, 0);
        listaDos[0] = new Complejo(7, 8);
        listaDos[1] = new Complejo(9, 0);
        listaDos[2] = new Complejo(1, 2);
        esperado[0] = new Complejo(22, 42);
        esperado[1] = new Complejo(41, 27);
        esperado[2] = new Complejo(40, 33);
        Complejo[] respuesta = operacion.accionMatrizSobreVector(lista, listaDos);
        assertEquals(respuesta, esperado);
    }
    
    @Test
    public void matrizNormaTest() throws Exception {
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        double[][] m = new double[2][2];
	m[0][0] = 3;
	m[0][1] = 5;
	m[1][0] = 2;
	m[1][1] = 3;    
	double expected = Math.sqrt(47);
	double actual = operacion.normaMatrices(m);
	assertEquals(expected, actual, 0.7);
    }

    @Test
    public void matrizDistanciaTest() throws Exception {
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        double[][] m1 = new double[2][2];
        m1[0][0] = 3;
        m1[0][1] = 5;
        m1[1][0] = 2;
        m1[1][1] = 3;
        double[][] m2 = new double[2][2];
        m2[0][0] = 1;
        m2[0][1] = 6;
        m2[1][0] = 2;
        m2[1][1] = 4;
        double expected = 2.45;
        double actual = operacion.distanciaEntreMatrices(m1, m2);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void matrizUnitariaTest() throws Exception{
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        lista[0][0] =new Complejo(3,2);
        lista[0][1] =new Complejo(9,5);
        lista[1][0] = new Complejo(5,-6);
        lista[1][1] = new Complejo(1,4);
        boolean esperado= false;
        boolean respuesta = operacion.matrizUnitaria(lista) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
    public void matrizHermitianaTest() throws Exception{
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        lista[0][0] =new Complejo(1,8);
        lista[0][1] =new Complejo(8,1);
        lista[1][0] = new Complejo(6,-6);
        lista[1][1] = new Complejo(-6,6);
        boolean esperado= false;
        boolean respuesta = operacion.matrizHermitiana(lista) ;
        assertEquals(respuesta,esperado);
    }
    
    @Test
    public void tensorMatrizTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][] listaDos = new Complejo[2][2];
        Complejo[][] esperado = new Complejo[4][4];
        lista[0][0] = new Complejo(1, 0);
        lista[0][1] = new Complejo(0, 0);
        lista[1][0] = new Complejo(2, 0);
        lista[1][1] = new Complejo(3, 0);
        listaDos[0][0] = new Complejo(1, 0);
        listaDos[0][1] = new Complejo(1, 0);
        listaDos[1][0] = new Complejo(1, 0);
        listaDos[1][1] = new Complejo(1, 0);
        esperado[0][0] = new Complejo(1, 0);
        esperado[0][1] = new Complejo(1, 0);
        esperado[0][2] = new Complejo(0, 0);
        esperado[0][3] = new Complejo(0, 0);
        esperado[1][0] = new Complejo(1, 0);
        esperado[1][1] = new Complejo(1, 0);
        esperado[1][2] = new Complejo(0, 0);
        esperado[1][3] = new Complejo(0, 0);
        esperado[2][0] = new Complejo(2, 0);
        esperado[2][1] = new Complejo(2, 0);
        esperado[2][2] = new Complejo(3, 0);
        esperado[2][3] = new Complejo(3, 0);
        esperado[3][0] = new Complejo(2, 0);
        esperado[3][1] = new Complejo(2, 0);
        esperado[3][2] = new Complejo(3, 0);
        esperado[3][3] = new Complejo(3, 0);
        Complejo[][] respuesta = operacion.productoTensor(lista, listaDos);
        assertEquals(respuesta, esperado);
    }
    
}
