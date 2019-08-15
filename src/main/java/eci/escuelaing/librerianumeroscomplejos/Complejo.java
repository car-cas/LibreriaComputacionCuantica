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
 */
public class Complejo {
    private double numeroA;
    private double numeroB;
    
    public Complejo(double numeroA,double numeroB){
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
    
    public double getNumeroA(){
        return numeroA;
    }
    
    public double getNumeroB(){
        return numeroB;
    }
    
    @Override
    public String toString() {
        String simbolo = "";
        if(numeroB >= 0){
            simbolo="+";
        }
        return numeroA + " " + simbolo + " " + numeroB + 'i';
    }
    
    @Override
    public boolean equals(Object obj) { 
        return (this == obj);
    }
    
}
