/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Abstractos;

/**
 *
 * @author Alumnos
 */
public class Cuadrado extends Figura{
        protected int lado;
        public Cuadrado(int lado){
            this.lado=lado;}
        public double area(){
            return lado*lado;}
        public void mostrarNombre(){System.out.println("cuadrado");}
}
