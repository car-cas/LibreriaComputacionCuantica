/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import eci.escuelaing.librerianumeroscomplejos.Complejo;
import eci.escuelaing.librerianumeroscomplejos.OperacionesConVectores;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 * 
 * Unit test
 * 
 */
public class OperacionesConVectoresTest {
    
    /**
     * Prueba para calcular la suma de dos numeros vectores complejos 
     */
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
    
    @Test
    public void inversaDeUnVectorTest(){
        OperacionesConVectores vector = new OperacionesConVectores();
        Complejo[] lista = new Complejo[2];
        Complejo[] respuesta = new Complejo[2];
        lista[0] = new Complejo(7,3);
        lista[1] = new Complejo(4,1);
        respuesta[0] = new Complejo(-7,-3);
        respuesta[1] = new Complejo(-4,-1);
        Complejo[] c = vector.inversa(lista);
        assertEquals(c,respuesta);
    }
    
    @Test
    public void multiplicacionConUnEscalarTest(){
        OperacionesConVectores vector = new OperacionesConVectores();
        Complejo[] lista = new Complejo[2];
        Complejo[] respuesta = new Complejo[2];
        Complejo a = new Complejo(4,3);
        lista[0] = new Complejo(7,3);
        lista[1] = new Complejo(4,1);
        respuesta[0] = new Complejo(28,9);
        respuesta[1] = new Complejo(16,3);
        Complejo[] c = vector.multiplicacionEscalar(lista, a);
        assertEquals(c,respuesta);
    }
}
