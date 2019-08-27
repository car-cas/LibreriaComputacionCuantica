/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eci.escuelaing.librerianumeroscomplejos.Complejo;
import eci.escuelaing.librerianumeroscomplejos.Operaciones;
import eci.escuelaing.librerianumeroscomplejos.Polar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 * 
 * Unit test
 * 
 */
public class OperacionesTest {

    /**
     * Prueba para calcular la suma de dos numeros complejos 
     */
    @Test
    public void sumaTest(){
        
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        Complejo c  = new Complejo(9,-4);
        Complejo respuesta = operacion.suma(a,b); 
        assertEquals(respuesta,c);
                
    }
    /**
     * Prueba para calcular el producto de dos numeros complejos 
     */
    @Test
    public void ProductoTest(){
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        Complejo respuesta = operacion.producto(a,b); 
        Complejo c  = new Complejo(41,-13);
        assertEquals(respuesta,c);
                
    }
    /**
     * Prueba para calcular la resta de dos numeros complejos 
     */
    @Test
    public void restaTest(){
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        Complejo respuesta = operacion.resta(a,b); 
        Complejo c  = new Complejo(-1,10);
        assertEquals(respuesta,c);
                
    }
    /**
     * Prueba para calcular la division de dos numeros complejos 
     */
    @Test
    public void DivisionTest(){
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(-2,1);
        Complejo b = new Complejo(1,2);
        Complejo respuesta = operacion.division(a,b); 
        Complejo c  = new Complejo(0,1);
        assertEquals(respuesta,c);
                
    }
    /**
     * Prueba para calcular el conjugado de dos numeros complejos 
     */
    @Test
    public void conjugadoTest(){
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        Complejo respuesta = operacion.conjugado(a); 
        Complejo c  = new Complejo(4,-3);
        assertEquals(c,respuesta);
                
    }
    /**
     * Prueba para calcular de polar a cartesiano de dos numeros complejos 
     */
    @Test
    public void polarACartesianoTest(){
        Operaciones operacion = new Operaciones();
        Polar x = new Polar(36.86989764584402,5);
        Complejo respuesta = operacion.PolarACartesiano(x);
        Complejo c  = new Complejo(4,3);
        assertEquals(c,respuesta);
                
    }
    /**
     * Prueba para calcular la fase  de un numero complejos
     */
    @Test
    public void faseTest(){
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        double respuesta = operacion.fase(a); 
        double c  = 36.86989764584402;
        assertEquals(c, respuesta,0);
                
    }
    /**
     * Prueba para calcular el modulo  de un numero complejos
     */
    @Test
    public void ModuloTest(){
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(4,3);
        Complejo b = new Complejo(5,-7);
        double  respuesta = operacion.modulo(a); 
        double c  = 5;
        assertEquals(c, respuesta,0);         
    }
    @Test
    public void sumaiTest(){
        
        Operaciones operacion = new Operaciones();
        Complejo a = new Complejo(0,1);
        Complejo b = new Complejo(0,1);
        Complejo c  = new Complejo(-1,0);
        Complejo respuesta = operacion.producto(a,b); 
        assertEquals(respuesta,c);
                
    }

}
