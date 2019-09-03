/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.librerianumeroscomplejos;

import java.util.ArrayList;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 * 
 * Clase OperacionesConVectores, se encuentra toda la libreria de operaciones 
 * para calcular vectores con numeros complejos
 */

public class OperacionesConVectores extends ArrayList<Complejo> {
    private Operaciones operacion;
    private Complejo[] vector;
    
    public OperacionesConVectores(){
        this.vector=vector;
        operacion = new Operaciones();
    }
    
    public Complejo[] getVector() {
        return vector;
    }
    
    /**
     * 
     * Metodo adicion, calcula la suma de dos vectores de numeros complejos
     * 
     * @param j Complejo[]
     * @param k Complejo[]
     * @return Complejo 
     */
    public Complejo[] adicion (Complejo[] j,Complejo[] k){
        Complejo[] respuesta = new Complejo[j.length];
        for (int i = 0; i < respuesta.length; i++){
            respuesta[i] = operacion.suma(j[i], k[i]);
        }
        return respuesta;
    }
    /**
     * 
     * Metodo inversa, calcula la inversa de un vector de numeros complejos
     * 
     * @param j Complejo[]
     * @return Complejo 
     */
    public Complejo[] inversa(Complejo[] j){
        Complejo [] respuesta = new Complejo[j.length];
        for (int i = 0; i < j.length; i++){
            respuesta[i] = new Complejo(j[i].getNumeroA()*-1,j[i].getNumeroB()*-1);
        }
        return respuesta;
    }
    /**
     * 
     * Metodo MultiplicacionEscalar, calcula la multipliacion escalar 
     * por un vector de numeros complejos y numero complejo
     * 
     * @param j Complejo[]
     * @param x Complejo
     * @return Complejo 
     */
    public Complejo[] multiplicacionEscalar (Complejo[] j,Complejo x){
        Complejo[] respuesta = new Complejo[j.length];
        for (int i = 0; i < respuesta.length; i++){
           respuesta[i] = new Complejo(x.getNumeroA()*j[i].getNumeroA(),x.getNumeroB()*j[i].getNumeroB());
        }
        return respuesta;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) return true;
    	if (this.getClass() != obj.getClass()) return false;
    	OperacionesConVectores vector = (OperacionesConVectores) obj;
        if(vector.getVector().length!=vector.size()){
            return false;
        }
        boolean b = false;
        for (int i = 0; i < vector.size(); i++) {
            if(!vector.getVector()[i].equals(vector.get(i))){
                b = false;
                break;
            }else{
                b = true;
            }
        }
    	return b;
    }
    
    @Override
    public int hashCode(){
        int hash=3;
        hash = 57 * hash + (int) (Double.doubleToLongBits(this.vector.hashCode()) ^ (Double.doubleToLongBits(this.vector.hashCode()) >>> 32));
        return hash;
    }
}
    
