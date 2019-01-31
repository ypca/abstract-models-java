
package Metodos_Abstractos;


public abstract class Figura {
    int x,y;
    public void mostrarOrigen(){
        System.out.println("x= "+x+" y= "+y);
    }
    public abstract double area();
    public abstract void mostrarNombre();
}

   


