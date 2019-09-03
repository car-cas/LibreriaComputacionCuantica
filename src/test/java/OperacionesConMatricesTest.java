/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import eci.escuelaing.librerianumeroscomplejos.Complejo;
import eci.escuelaing.librerianumeroscomplejos.OperacionesConMatrices;
import org.junit.Assert;
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
        Complejo[][] res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        listaDos[0][0] = new Complejo(1,1);
        listaDos[0][1] = new Complejo(1,1);
        listaDos[1][0]= new Complejo(1,1);
        listaDos[1][1]= new Complejo(1,1);
        res[0][0] = new Complejo(2,2);
        res[0][1] = new Complejo(2,2);
        res[1][0] = new Complejo(2,2);
        res[1][1] = new Complejo(2,2);
        Complejo[][] respuesta = operacion.adicionDeMatrices(lista, listaDos) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    
    @Test
    public void inversaMatrizTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        res[0][0] = new Complejo(-1,-1);
        res[0][1] = new Complejo(-1,-1);
        res[1][0] = new Complejo(-1,-1);
        res[1][1] = new Complejo(-1,-1);
        Complejo[][] respuesta = operacion.inversaDeMatriz(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    
    @Test
    public void escalarMatrizTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        res[0][0] = new Complejo(0,4);
        res[0][1] = new Complejo(0,4);
        res[1][0] = new Complejo(0,4);
        res[1][1] = new Complejo(0,4);
        Complejo nc= new Complejo(2,2);
        Complejo[][] respuesta = operacion.multiplicacionEscalarPorMatriz(lista, nc) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    
    @Test
    public void matrizTranspuestaTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(1,0);
        lista[1][0] = new Complejo(0,1);
        lista[1][1] = new Complejo(1,0);
        res[0][0] = new Complejo(1,0);
        res[0][1] = new Complejo(0,1);
        res[1][0] = new Complejo(1,0);
        res[1][1] = new Complejo(1,0);
        Complejo[][] respuesta = operacion.matrizTranspuesta(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    
    @Test
     public void matrizConjugadaTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,1);
        lista[0][1] =new Complejo(1,1);
        lista[1][0] = new Complejo(1,1);
        lista[1][1] = new Complejo(1,1);
        res[0][0] = new Complejo(1,-1);
        res[0][1] = new Complejo(1,-1);
        res[1][0] = new Complejo(1,-1);
        res[1][1] = new Complejo(1,-1);
        Complejo[][] respuesta = operacion.matrizConjugada(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
     
    @Test
    public void matrizAdjuntaTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][]  res = new Complejo[2][2];
        lista[0][0] =new Complejo(1,0);
        lista[0][1] =new Complejo(1,0);
        lista[1][0] = new Complejo(0,1);
        lista[1][1] = new Complejo(1,0);
        res[0][0] = new Complejo(1,0);
        res[0][1] = new Complejo(0,-1);
        res[1][0] = new Complejo(1,0);
        res[1][1] = new Complejo(1,0);
        Complejo[][] respuesta = operacion.matrizAdjunta(lista) ;
        Assert.assertArrayEquals(respuesta,res);
    }
    
    @Test
    public void accionMatrizTest() throws Exception {
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[3][3];
        Complejo[] listaDos = new Complejo[3];
        Complejo[] res = new Complejo[3];
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
        res[0] = new Complejo(22, 42);
        res[1] = new Complejo(41, 27);
        res[2] = new Complejo(40, 33);
        Complejo[] respuesta = operacion.accionMatrizSobreVector(lista, listaDos);
        Assert.assertArrayEquals(respuesta, res);
    }
    
    @Test
    public void matrizNormaTest() throws Exception {
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        double[][] matriz = new double[2][2];
	matriz[0][0] = 3;
	matriz[0][1] = 5;
	matriz[1][0] = 2;
	matriz[1][1] = 3;    
	double expected = Math.sqrt(47);
	double actual = operacion.normaMatrices(matriz);
	assertEquals(expected, actual, 0.7);
    }

    @Test
    public void matrizDistanciaTest() throws Exception {
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        double[][] matriz1 = new double[2][2];
        matriz1[0][0] = 3;
        matriz1[0][1] = 5;
        matriz1[1][0] = 2;
        matriz1[1][1] = 3;
        double[][] matriz2 = new double[2][2];
        matriz2[0][0] = 1;
        matriz2[0][1] = 6;
        matriz2[1][0] = 2;
        matriz2[1][1] = 4;
        double expected = 2.45;
        double actual = operacion.distanciaEntreMatrices(matriz1, matriz2);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void matrizUnitariaTest() throws Exception{
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        lista[0][0] =new Complejo(4,3);
        lista[0][1] =new Complejo(10,6);
        lista[1][0] = new Complejo(6,-7);
        lista[1][1] = new Complejo(2,5);
        boolean res= false;
        boolean respuesta = operacion.matrizUnitaria(lista) ;
        assertEquals(respuesta,res);
    }
    
    @Test
    public void matrizHermitianaTest() throws Exception{
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        lista[0][0] =new Complejo(1,5);
        lista[0][1] =new Complejo(5,1);
        lista[1][0] = new Complejo(6,1);
        lista[1][1] = new Complejo(1,6);
        boolean res= false;
        boolean respuesta = operacion.matrizHermitiana(lista) ;
        assertEquals(respuesta,res);
    }
    
    @Test
    public void tensorMatrizTest(){
        OperacionesConMatrices operacion = new OperacionesConMatrices();
        Complejo[][] lista = new Complejo[2][2];
        Complejo[][] listaDos = new Complejo[2][2];
        Complejo[][] res = new Complejo[4][4];
        lista[0][0] = new Complejo(5, 0);
        lista[0][1] = new Complejo(4, 0);
        lista[1][0] = new Complejo(3, 0);
        lista[1][1] = new Complejo(1, 0);
        listaDos[0][0] = new Complejo(1, 0);
        listaDos[0][1] = new Complejo(1, 0);
        listaDos[1][0] = new Complejo(1, 0);
        listaDos[1][1] = new Complejo(1, 0);
        res[0][0] = new Complejo(5, 0);
        res[0][1] = new Complejo(5, 0);
        res[0][2] = new Complejo(4, 0);
        res[0][3] = new Complejo(4, 0);
        res[1][0] = new Complejo(5, 0);
        res[1][1] = new Complejo(5, 0);
        res[1][2] = new Complejo(4, 0);
        res[1][3] = new Complejo(4, 0);
        res[2][0] = new Complejo(3, 0);
        res[2][1] = new Complejo(3, 0);
        res[2][2] = new Complejo(1, 0);
        res[2][3] = new Complejo(1, 0);
        res[3][0] = new Complejo(3, 0);
        res[3][1] = new Complejo(3, 0);
        res[3][2] = new Complejo(1, 0);
        res[3][3] = new Complejo(1, 0);
        Complejo[][] respuesta = operacion.productoTensor(lista, listaDos);
        Assert.assertArrayEquals(respuesta, res);
    }
    
}
