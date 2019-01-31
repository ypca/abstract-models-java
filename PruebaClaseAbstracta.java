
package Metodos_Abstractos;


public class PruebaClaseAbstracta {
    public static void main(String[] args){
        Figura fig;
        //fig = new Figura(); no se puede instanciar una clase abstracta
        Triangulo tri = new Triangulo(4,3);
        tri.mostrarOrigen();
        tri.mostrarNombre();
        fig = tri;
        fig.mostrarNombre();
        System.out.println("Area triangulo: "+fig.area());
        Cuadrado cua=new Cuadrado(5);
        fig=cua;
        fig.mostrarNombre();
        System.out.println("Area cuadrado: "+fig.area());
    }
    
}
