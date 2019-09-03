/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.librerianumeroscomplejos;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 * 
 * Clase OperacionesConMatrices, se encuentra toda la libreria de operaciones 
 * para calcular Matrices de numeros complejos
 * 
 */
public class OperacionesConMatrices {
    private Operaciones operacion;
    private Complejo[][] matriz;
     
    public OperacionesConMatrices(){
        operacion = new Operaciones();
    }  
    
    public Complejo[][] getMatriz(){
        return matriz;
    }
    
    public Integer tamanio() {
        return matriz.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        OperacionesConMatrices mc = (OperacionesConMatrices) obj;
        if (this.tamanio() != mc.tamanio()) {
            return false;
        }
        boolean flag = false;
        for (int i = 0; i < matriz.length; i++) {
            Complejo[] numeroComplejos = matriz[i];

        }
        
        return true;
    }
    
    /**
     * 
     * Metodo adicionDeMatrices, calcula la suma de dos matrices 
     * de numeros complejos
     * 
     * @param x Complejo[][]
     * @param y Complejo[][]
     * @return Complejo 
     */
    public Complejo[][] adicionDeMatrices(Complejo[][] x, Complejo[][]y){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<respuesta.length;i++){
            for (int j=0;j<respuesta[i].length;j++){
                respuesta[i][j] = operacion.suma(x[i][j], y[i][j]);
            }
        }
        return respuesta;
    }
    /**
     * 
     * Metodo inversaDeMatriz, calcula la inversa de una matriz 
     * de numeros complejos
     * 
     * @param x Complejo[][]
     * @return Complejo 
     */
    public Complejo[][] inversaDeMatriz(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<respuesta.length;i++){
            for (int j=0;j<respuesta[i].length;j++){
                respuesta[i][j]= new Complejo(x[i][j].getNumeroA()*-1,x[i][j].getNumeroB()*-1);
            }
        }
        return respuesta;
    }
    /**
     * 
     * Metodo multiplicacionEsalarPorMatriz, calcula la multipliacion escalar 
     * por una matriz de numeros complejos y numero complejo
     * 
     * @param x Complejo[][]
     * @param c Complejo[]
     * @return Complejo 
     */
    public Complejo[][] multiplicacionEscalarPorMatriz(Complejo[][] x,Complejo c){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                respuesta[i][j] = operacion.producto(x[i][j], c);
            }
        }
        return respuesta;
    }
    /**
     * 
     * Metodo matrizTranspuesta, calcula la transpuesta de una matriz 
     * de numeros complejos
     * 
     * @param x Complejo[][]
     * @return Complejo 
     */
    public Complejo[][] matrizTranspuesta(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                respuesta[i][j]=x[j][i];
            }
        }
        return respuesta;
    }
    /**
     * 
     * Metodo matrizConjugada, calcula la conjugacion de una matriz
     * 
     * @param x Complejo[][]
     * @return Complejo 
     */
    
    public Complejo[][] matrizConjugada(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        for (int i=0;i<respuesta.length;i++){
            for (int j=0;j<respuesta[0].length;j++){
                respuesta[i][j]= operacion.conjugado(x[i][j]);
            }
        }
        return respuesta;
    }
    /**
     * 
     * Metodo matrizAdjunta, calcula la matriz adjunta de una matriz 
     * de numeros complejos
     * 
     * @param x Complejo[][]
     * @return Complejo 
     */
    public Complejo[][] matrizAdjunta(Complejo[][] x){
        Complejo [][] respuesta = new Complejo[x.length][x[0].length];
        respuesta = matrizTranspuesta(x);
        respuesta = matrizConjugada(respuesta);
        return respuesta;
    }
    /**
     * Metodo accionMatrizSobreVector, calcula la accion de una matriz sobre
     * un vector 
     * @param m1 Complejo[][]
     * @param v Complejo[]
     * @return Complejo[]
     * @throws Exception 
     */
    public  Complejo[] accionMatrizSobreVector(Complejo[][] m1,Complejo[] v) throws Exception{
        if (m1[0].length != v.length) {
            throw new Exception("la longitud de las filas de la matriz es diferente a la longitud el vector");
	} else {
            Complejo[] r = new Complejo[v.length];  
            Complejo s = new Complejo(0,0);
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    s = operacion.suma(s, operacion.producto(m1[i][j], v[j]));
		}
		r[i] = s;
		s = new Complejo(0,0);
            }
            return r;
	}
    }
    /**
     * Metodo normaMatrices, calcula la norma de una matriz de numeros reales.
     * 
     * @param matriz double[][]
     * @return double 
     */
    public double normaMatrices(double[][] matriz){
	double[][] mt = new double[matriz.length][matriz[0].length];
	for (int i = 0;i < mt.length;i++) {
		for (int j = 0;j < mt.length;j++) {
                    mt[i][j] = matriz[j][i];
		}
	}
	double[][] r = new double[matriz.length][matriz[0].length];
	double s = 0;
	for (int i = 0; i < mt.length; i++) {
		for (int j = 0; j < mt[0].length; j++) {
			for (int k = 0; k < mt.length; k++) {
				s = s + (mt[i][k] * matriz[i][j]);
			}
			r[i][j] = s;
			s = 0;
		}
	}
	double trace = 0;
	for (int i = 0; i < r.length; i++) {
		trace = trace + r[i][i];
	}
	return Math.sqrt(trace);
    }
    /**
     * Metodo distanciaEntreMatrices, calcula la distancia de dos matrices de
     * reales
     * 
     * @param m1 double[]
     * @param m2 double[]
     * @return double 
     */
    public double distanciaEntreMatrices(double[][] m1, double[][] m2){
        double ms[][] = new double[m1.length][m1[0].length];
	for (int i = 0; i < ms.length; i++) {
            for (int j = 0; j < ms[0].length; j++) {
		ms[i][j] = m1[i][j] - m2[i][j];
            }
	}
	double[][] mt = new double[ms.length][ms[0].length];
	for (int i = 0;i < mt.length;i++) {
            for (int j = 0;j < mt.length;j++) {
                mt[i][j] = ms[j][i];
            }
	}
	double[][] r = new double[mt.length][mt[0].length];
	double s = 0;
	for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
		for (int k = 0; k < mt.length; k++) {
                    s = s + (mt[i][k] * ms[i][j]);
		}
		r[i][j] = s;
		s = 0;
            }
	}
	double trace = 0;
	for (int i = 0; i < r.length; i++) {
            trace = trace + r[i][i];
	}
	return Math.sqrt(trace);
    } 
    /**
     * Metodo matrizMultiplicacion, multiplica dos matrices de complejos
     * @param m1 Complejo[][]
     * @param m2 Complejo[][]
     * @return Complejo[][]
     * @throws Exception 
     */
    public Complejo[][] matrizMultiplicacion(Complejo[][] m1,Complejo[][] m2) throws Exception {
        if (m1.length != m2[0].length) {
            throw new Exception("la matriz no es cuadrada");
        } else {
            Complejo[][] r = new Complejo[m1.length][m1[0].length];
            Complejo s = new Complejo(0, 0);
            for (int m = 0; m < m1.length; m++) {
                for (int n = 0; n < m1[0].length; n++) {
                    for (int i = 0; i < m1.length; i++) {
                        Complejo temp = operacion.producto(m1[m][i], m2[i][n]);
                        s = operacion.suma(s, temp);
                    }
                    r[m][n] = s;
                    s = new Complejo(0, 0);
                }
            }
            return r;
        }
    } 
    /**
     * Metodo matrizUnitaria, verifica que la matriz sea unitaria
     * @param m1 Complejo [][]
     * @return boolean 
     * @throws Exception 
     */
    public boolean matrizUnitaria(Complejo[][] m1) throws Exception {
        if (m1.length != m1[0].length) {
            throw new Exception("la matriz no es cuadrada");
        } else {
            boolean flag;
            flag = this.matrizMultiplicacion(m1, this.matrizAdjunta(m1)).equals(this.matrizMultiplicacion(this.matrizAdjunta(m1), m1));
            return flag;
        }
    }
    /**
     * Metodo matrizHermitiana, verifica que la matriz sea hermitiana
     * @param m1 Complejo [][]
     * @return boolean 
     * @throws Exception 
     */
    public  boolean matrizHermitiana(Complejo[][] m1) throws Exception {
        if (m1.length != m1[0].length) {
            throw new Exception("la matriz no es cuadrada");
	} else {
            return m1.equals(matrizAdjunta(m1));
	}
    }
    /**
     * Metodo productoTensor, calcula el producto tensor de dos matrices
     * @param m1 Complejo[][]
     * @param m2 Complejo[][]
     * @return Complejo[][]
     */
    public  Complejo[][] productoTensor(Complejo[][] m1, Complejo[][] m2) {
        Complejo[][] r = new Complejo[m1.length * m2.length][ m1[0].length * m2[0].length];
	Complejo[][] sp;
	int m = 0;
	int n = 0;
	for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                sp = this.multiplicacionEscalarPorMatriz(m2,m1[i][j]);
		for(int k = 0; k < sp.length; k++) {
                    for(int l = 0; l < sp[0].length; l++) {
                        r[m][n] = sp[k][l];
			n++;
                    }
                    m++;
                    n = j * m2[0].length;
		}
                m = i * m2.length;
		n = (j + 1) * m2[0].length;
            }
            m = (i + 1) * m2.length;
            n = 0;
        }
	return r;
    }
}   

