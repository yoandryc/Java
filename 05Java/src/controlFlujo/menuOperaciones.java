package controlFlujo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class menuOperaciones {
    public static void main(String[] args) {
        /*
        !EJERCICIO2
?Crea un programa en Java que simule un pequeño menú de operaciones matemáticas.
*Debe permitir al usuario elegir una operación entre:
*Suma
*Resta
*Multiplicación
*División
?Luego debe pedir dos números y mostrar el resultado de la operación.
*/
        float numero1,numero2,result;
        short opcion;
        boolean continuar = true;
        Scanner sc =new Scanner(System.in);
        while (continuar) {
            System.out.println("Menu-Operaciones");
            System.out.printf("1.-Suma%n" + "2.-Resta%n" + "3.-Multiplicación%n" +
                    "4.-División%n"+"5.-Salir%n");
            System.out.println("elige el numero de operacion");
            opcion = sc.nextShort();
            switch (opcion) {
                case 1:
                    System.out.println("\u001B[31mEligio-Suma\u001B[0m");
                    System.out.println("Ingresa el primer numero");
                    numero1 = sc.nextFloat();
                    System.out.println("Ingresa el segundo numero");
                    numero2 = sc.nextFloat();
                    result = numero1 + numero2;
                    System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, result);
                    break;
                case 2:
                    System.out.println("\u001B[31mEligio-Resta\u001B[0m");
                    System.out.println("Ingresa el primer numero");
                    numero1 = sc.nextFloat();
                    System.out.println("Ingresa el segundo numero");
                    numero2 = sc.nextFloat();
                    result = numero1 - numero2;
                    System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, result);
                    break;
                case 3:
                    System.out.println("\u001B[31mEligio-Multiplicación\u001B[0m");
                    System.out.println("Ingresa el primer numero");
                    numero1 = sc.nextFloat();
                    System.out.println("Ingresa el segundo numero");
                    numero2 = sc.nextFloat();
                    result = numero1 * numero2;
                    System.out.printf("%.2f X %.2f = %.2f%n", numero1, numero2, result);
                    break;
                case 4:
                    System.out.println("\u001B[31mEligio-División\u001B[0m");
                    System.out.println("Ingresa el primer numero");
                    numero1 = sc.nextFloat();
                    System.out.println("Ingresa el segundo numero");
                    numero2 = sc.nextFloat();
                    result = numero1 / numero2;
                    System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, result);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    continuar = false; // Cambia la bandera para salir del ciclo
                    break;
                default:
                    System.out.println("Por eso joven elija un numero de operacion");
            }
        }
            sc.close();




















    }//!cierre de main
}//!cierre de clase

