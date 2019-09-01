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
    public void matrixNormTest() throws Exception {
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
	public void matrixDistanceTest() throws Exception {
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
}
