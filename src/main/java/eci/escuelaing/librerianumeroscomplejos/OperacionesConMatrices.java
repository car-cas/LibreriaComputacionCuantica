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
    
    public OperacionesConMatrices(){
        operacion = new Operaciones();
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
            for (int j=0;j<respuesta[i].length;i++){
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
        for (int i=0;i<respuesta.length;i++){
            for (int j=0;j<respuesta[i].length;i++){
                respuesta[i][j] = new Complejo(c.getNumeroA()*x[i][0].getNumeroA(),c.getNumeroB()*x[0][j].getNumeroB());
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
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;i++){
                x[i][j]=x[j][i];
            }
        }
        return x;
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
            for (int j=0;j<respuesta[i].length;i++){
                respuesta[i][j]= new Complejo(x[i][j].getNumeroA(),x[i][j].getNumeroB()*-1);
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
    
    
    
}
