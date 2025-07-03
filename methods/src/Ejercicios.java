public class Ejercicios {
    /*
    *1. sumaParcial
    * 2 retorna una valor entero, ejemplo sumas los n(numereos del 1 al 100 y devolver
    * resultado
    * 3. recibe un parametro hasta donde vamos a sumar
     */
public int sumaParcial(int a){
    int cont=0;
    for (int i = 0; i <=a; i++) {
        cont=cont+i;
    }
    //System.out.println(cont);
    return (cont);
}


    /*
    * 1. tablero de ajedrez,
    * 2. no retonna nada
    * 3. muestra en pantalla un tablero de ajedrez de n x n lados, donde n es el valor ingresado
    * en el metodo
    * 4.recibe como parametro un numero de tipo entero, este numero representa la cantidad de
    * filas y columnas que va tener nuestro tablero
     */
public static void ajedrez(int a){
    for (int i = 0; i < a; i++) {
        for (int j = 0; j <a ; j++) {
            System.out.print("# ");
        }
        System.out.println("");
    }
}












}

