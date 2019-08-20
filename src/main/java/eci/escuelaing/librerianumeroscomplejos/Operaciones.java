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
 * Clase Operaciones, se encuentra toda la libreria de operaciones 
 * para calcular numeros complejos
 * 
 */
public class Operaciones {
    private Complejo x;
    private Complejo y;
    
    /**
     * 
     * Metodo suma, calcula la suma de dos numeros complejos
     * 
     * @param x Complejo
     * @param y Complejo
     * @return Complejo 
     */
    public  Complejo suma(Complejo x,Complejo y){
       double respuesta = x.getNumeroA() + y.getNumeroA();
       double respuestaDos = x.getNumeroB() + y.getNumeroB();
       return new Complejo(respuesta,respuestaDos);
    }
    /**
     * 
     * Metodo Producto, calcula el producto de dos numeros complejos
     * 
     * @param x Complejo
     * @param y Complejo
     * @return Complejo 
     */
    public Complejo producto(Complejo x,Complejo y){
        double respuesta = (x.getNumeroA() * y.getNumeroA())-(x.getNumeroB() * y.getNumeroB());
        double respuestaDos = (x.getNumeroA() * y.getNumeroB())+(x.getNumeroB()* y.getNumeroA());
        return new Complejo(respuesta,respuestaDos);
    }
    /**
     * 
     * Metodo resta, calcula la resta de dos numeros complejos
     * 
     * @param x Complejo
     * @param y Complejo
     * @return Complejo 
     */
    public Complejo resta(Complejo x,Complejo y){
        double respuesta = x.getNumeroA() - y.getNumeroA();
        double respuestaDos = x.getNumeroB() - y.getNumeroB();
        return new Complejo(respuesta,respuestaDos);
        
    }
    /**
     * 
     * Metodo division, calcula la division de dos numeros complejos
     * 
     * @param x Complejo
     * @param y Complejo
     * @return Complejo 
     */
    public Complejo division(Complejo x,Complejo y){
        double respuesta = ((x.getNumeroA()*y.getNumeroA())+(x.getNumeroB()*y.getNumeroB()))/((y.getNumeroA()*y.getNumeroA())+(y.getNumeroB()*y.getNumeroB())); 
        double respuestaDos = ((x.getNumeroB()*y.getNumeroA())-(x.getNumeroA()*y.getNumeroB()))/((y.getNumeroA()*y.getNumeroA())+(y.getNumeroB()*y.getNumeroB()));
        return new Complejo(respuesta,respuestaDos);
    }
    /**
     * 
     * Metodo suma, calcula el modulo de un numero complejo
     * 
     * @param x Complejo
     * @return Complejo 
     */
    public double modulo(Complejo x){
        double respuesta = Math.sqrt(Math.pow(x.getNumeroA(),2) + Math.pow(x.getNumeroB(),2));
        return respuesta;
        
    }
    /**
     * 
     * Metodo conjugado, calcula el conjugado de un numero complejo
     * 
     * @param x Complejo
     * @return Complejo 
     */
    public  Complejo conjugado(Complejo x){
        return new Complejo(x.getNumeroA(),x.getNumeroB()* -1); 
    }
    /**
     * 
     * Metodo CartesianoAPolar, convierte un numero complejo de cartesiano a
     * polar.
     * 
     * @param x Complejo
     * @return Polar 
     */
    public Polar CartesianoAPolar(Complejo x){
        double r;
        r = modulo(x);
        double rads = Math.atan(x.getNumeroB()/x.getNumeroA());
        double angulo = Math.toDegrees(rads);
        return new Polar(angulo,r);
    }
    /**
     * Metodo PolarACartesiano, dado un angulo y una recta retorna un numero 
     * complejo cartesiano.
     * 
     * @param x Polar
     * @return Complejo
     */
    public Complejo PolarACartesiano(Polar x){
        double r = x.getHipoten();
        double radian = Math.toRadians(x.getAngulo()); 
        return new Complejo(r*Math.cos(radian),r*Math.sin(radian));
    }
    
    /**
     * Metodo Fase, dado un numero complejo, retorna la fase o el angulo de 
     * dicho numero complejo.
     * 
     * @param x Complejo
     * @return double
     */
    public double fase(Complejo x){
        double rads = Math.atan(x.getNumeroB()/x.getNumeroA());
        double angulo = Math.toDegrees(rads);
        return angulo;
    }
}
