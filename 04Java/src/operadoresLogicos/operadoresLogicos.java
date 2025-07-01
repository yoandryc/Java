package operadoresLogicos;

import java.util.Scanner;

public class operadoresLogicos {
    public static void main(String[] args) {
        Scanner lee =new Scanner(System.in);
        /* atajo para metodo maii : pswvm + tab*/
        //Operadores logico
        int edad=27;
        boolean tieneLicencia= true;
        boolean vigente= true;
        //Condicion compuesta uando && y !
        if (tieneLicencia && vigente && !(edad<17)){
            System.out.println("Sigale joven");
        } else{
            System.out.println("Por eso joven, como le hacemos? ");
        }
        //Ejemplo de autenticacion
        System.out.println("Autenticacion");
        boolean usuarioValido=true;
        boolean tienePermisos =false;
        if (usuarioValido && tienePermisos){
            System.out.println("Acceso correcto");
        }else{
            System.out.println("Acceso Denegado");
        }
        //permisos de plataformas
        boolean planBasico=true;
        boolean planPremium=false;
        if (planBasico && planPremium){
            System.out.println("Bienvenido no hay anuncios");
        }else{
            System.out.println("Cambiate a premium para disfrutar de toda la programacion sin " +
                    "interupciones");
        }
//! ///////////////////////////////////////////////////////////////////////////////////////////////////////
        //?Ejercicio 1: Calculadora de Propina

        //*Crea un programa en Java que solicite al usuario ingresar el total de una cuenta en un restaurante.
        //*Luego, el programa debe calcular el 15% de propina y mostrar:
        //*El monto original
        //*El monto de la propina
        //*El total a pagar
        //*Pista: Usa operadores aritméticos + y *.
        double montoOriginal,propina,totalPagar;
        System.out.println("\u001B[31m Ejercicio 1: Calculadora de Propina: \u001B[0m");
        System.out.println("ingresa el total de tu cuenta en La Madalena: ");
        montoOriginal = lee.nextDouble();
        propina =montoOriginal*0.15;
        totalPagar=montoOriginal+propina;
        // Muestra los resultados
        System.out.printf("Monto original: $%.2f%n", montoOriginal);
        System.out.printf("Propina (15%%): $%.2f%n", propina);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        System.out.println("Gracias por su visita a La Madalena.");
//!///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //?Ejercicio 2: Comparación de Edades
    // *Escribe un programa en Java que compare la edad de dos personas.
    // *El usuario debe ingresar dos números (edadPersona1 y edadPersona2)./
        //* El programa debe mostrar quién es mayor, o si tienen la misma edad.
        //*Pista: Usa operadores de comparación >, <, ==.
    short edadPersona1,edadPersona2;
        System.out.println("\u001B[31m Ejercicio 2: Comparación de Edades \u001B[0m");
        System.out.println("ingresa la edad de la primera persona");
        edadPersona1= lee.nextShort();
        System.out.println("ingresa la edad de la segunda persona");
        edadPersona2= lee.nextShort();
        if (edadPersona1==edadPersona2){
            System.out.println("tiene la misma edad la persona con "+edadPersona1+" años y la segunda persona con "
                    +edadPersona2+" años");
        } else if (edadPersona1>edadPersona2) {
            System.out.println("la primera persona es mayor tiene "+edadPersona1+" años y la segunda persona con "
                    +edadPersona2+" años es la menor");
        }else{
            System.out.println("la segunda persona es mayor tiene "+edadPersona2+" años y la primera persona con "
                    +edadPersona1+" años es la menor");
        }
        lee.close();

    }//cierre de main
}// cierre de clase

