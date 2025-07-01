package controlFlujo;

import java.util.Scanner;
public class controlFujo {
    public static void main(String[] args) {
        /*
        *Ciclo para verificar si un paciente es menor de edad
        * 1. Le pedimos sus datos (jeronimo 16 años)
        * 2. Almacenar el dato en una variable
        * 3. Si el paciente es menor de edad, no se le puede dar tratamiento, se le dara una
        * valoracion acompañado de su tutor
        * 4. si no es menor de edad, el paciente recibe tratamiento normal
         */

        int edadPaciente =16;
        if (edadPaciente < 18){
            System.out.println("Este paciente es menor de edad por lo que no se le dar tratamiento");

        }else{
            System.out.println("Este paciente recibe valoracion y tratamiento");
        }

        //* Validar que la hora de la cita este dentro del horario

        int cita= 13;
        if ((cita >= 9 && cita <= 17) || (cita <13 && cita >= 14)){
            System.out.println("Estas en tu horario de comida, Provechito");
        }else{
            System.out.println("Pon atencion a la clase aun no toca la comida");
        }
//!//////////////////////////////////////////////////////////////////////////////////////////////
        /*
        *Scanner metodo de java que permite solicitar al usuario cualquier tipo de datos.
        * Tenemos que importar la clase scanner en nuestra clase e instaciamos  un nuevo objeto
        * de tipo scanner.
        *
        */
    //* 1. instanciar un nuevo objeto de tipo scanner
    Scanner sc =new Scanner(System.in);
    //*2 darle  contexto  al usuario
        System.out.println("ingresa tu nombre");
    //*3 guardar el objeto Scanner en una variable,s egun el tipo de dato solicitado
    String nombre = sc.next();
    //*4 Imprimimos el valor de la variable  nombre
        System.out.println("Bienvenidos "+ nombre);
        //* Nota: si quiero solicitarte al usuario puedo reutilizar el objeto de tipo Scanner
        //previamente instanciado.
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println(nombre +" tu edad es "+ edad+ " años.");
//! cajero automatico
        /*
        * Creamos un scanner llamado scr
        * Definimos una variable saldo coon un valor incial de 10000
        * Definimos la variable opcion que almacenara lo que el usuario elija del menu.
         */
        Scanner scr =new Scanner(System.in);
        int saldo=1000; //?saldo inicial como numero entero
        int opcion;
        //mostramos el menu y pedimos al usuario que elija una opcion (1 al 4)
        System.out.println("bievenido al cajero automatico");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.println("Elige una opcion: ");
        opcion = scr.nextInt();
    //* Usamos un Switch para elegir que opcion ejecutar segun la eleccion.
        switch (opcion){
            case 1: // Muestra el saldo actual
                System.out.println("Tu saldo actual es de $ "+ saldo);
                break;
            case 2: //Depositar dinero
                System.out.println("Ingresa la cantidad a depositar: ");
                int deposito= scr.nextInt();
                saldo +=deposito;
                System.out.println("Has depositado $" +deposito +" Saldo nuevo $" +saldo);
                break;
                /*
                *Pide al usuario un monto a depositar
                * Suma ese monto al saldo
                * muestra el nuevo saldo
                 */
            case 3: //Retirar dinero
                System.out.println("Ingresa la cantidad a retirar: ");
                int retiro= scr.nextInt();
                if (retiro <=saldo){
                    saldo-=retiro;
                    System.out.println("has retirado $"+retiro+"Saldo restante: $"+ saldo);
                }else{
                    System.out.println("Fondos insuficientes");
                }
                break;
                /*
                * pide un monto a retirar
                * con el if verifica si el monto es menor o igual al saldo.
                * si es posible, lo resta. Si no, muestra un mensaje de fondos insuficentes.
                 */
            case 4://salir
                System.out.println("Gracias por usar el cajero. Hasta la proxima!");
                break;
            default:
                System.out.println("Opcion no valida");
        }//! Cierre de switch
        //Por buena practia debemos cerrar el Scanner
        sc.close();
        scr.close();
        //Operador ternario
        int hora = 21;
        String operadorTernario =(hora<20)? "Buenos dias": "Buenas tardes ya, noches ya!";
        System.out.println(operadorTernario);





    }//cierre de main
}// cierre de clase
