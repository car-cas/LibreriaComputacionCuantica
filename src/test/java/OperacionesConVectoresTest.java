/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import eci.escuelaing.librerianumeroscomplejos.Complejo;
import eci.escuelaing.librerianumeroscomplejos.Operaciones;
import eci.escuelaing.librerianumeroscomplejos.Polar;
import eci.escuelaing.librerianumeroscomplejos.OperacionesConVectores;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author laboratorio
 */
public class OperacionesConVectoresTest {
    
    @Test
    public void adicionDeVectoresTest(){
        
            OperacionesConVectores vector = new OperacionesConVectores();
            Complejo[] lista = new Complejo[2];
            Complejo[] listaDos = new Complejo[2];
            Complejo[] respuesta = new Complejo[2];
            lista[0] = new Complejo(4,3);
            lista[1] = new Complejo(4,2);
            listaDos[0] = new Complejo(4,3);
            listaDos[1] = new Complejo(4,2);
            respuesta[0] = new Complejo(8,6);
            respuesta[1] = new Complejo(8,4);
            Complejo[] c = vector.adicion(lista, listaDos);
            assertEquals(c,respuesta);
            
    }
}
