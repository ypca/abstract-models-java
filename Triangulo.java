/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Abstractos;

/**
 *
 * @author Alumnos
 */
public class Triangulo extends Figura{
        protected int base,altura;
        public Triangulo(int ba, int al){
            base=ba; altura=al;
    }
        public double area(){return base*altura/2;}
        public void mostrarNombre(){
            System.out.println("triangulo");
        }}
