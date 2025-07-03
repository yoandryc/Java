package org.generation.operaciones;

public class Operaciones {
    //!metodo constructor , no lleva valor de retorno, y siempre
    //! se llama igual que la clase, con mayus y todo
    public Operaciones() {
    }
    //firma del metodo cuando esta vacio
    //!metodo de instancia se tiene que crear un objeto para
    //! poder utilizarlo
    public int sumar(int a, int b){
        //cuerpo del meotodo
        int resultado =a+b;
        return resultado;
    }
    //otro metodo de instancia
    public int restar(int a, int b){
        return a-b;
    }
    //metodo de instancia que nos de el area de un circulo, pidiendo com un argumento el radio.
    //Pi + r+r
    //areglarlo para que lo redondee
    public double getCirculoArea(double radio){
    double pi = Math.PI;
    return Math.round(pi * Math.pow(radio,2));
    }
    /*
    *Crear un metodo para sacar hipotenusas
    *1. recibe 2 parametros double a y b
    *  hipotenusa = √(a² + b²)
     */
    public  double hypot (double a,double b){
    double h =Math.sqrt(a*a+b*b);
    return String.format("%.2f", h);
    }
    //? Metodo estatico, se usa desde la clase sin necesidad de crear un objeto
    public static void showMenu(){
        System.out.println("En este momento la clase tiene estas operaciones: ");
        System.out.println(" sumar , recibe 2 argumentos tipo int y los suma.");
        System.out.println("restar, recibe 2 argumentos tipo int y los resta");
    }
}
