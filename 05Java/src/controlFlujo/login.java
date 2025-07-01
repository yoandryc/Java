package controlFlujo;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
!EJERCICIO1
?Sistema de Autenticación (if anidados)
*Instrucciones:
*Crea un programa en Java que simule un inicio de sesión.
*Solicita al usuario que ingrese su nombre de usuario y contraseña.
?Usa condicionales if anidados para:
*Verificar si el nombre de usuario es correcto.
*Luego, si el nombre es correcto, verificar si la contraseña es correcta.
*Si alguno de los dos es incorrecto, muestra el mensaje correspondiente.
?Credenciales válidas para probar:
*Usuario: admin
*Contraseña: 1234

 */
//EJERCICIO1
        String usuario = "admin", contrasena = "1234";
        System.out.println("Iniciar seccion");
        System.out.println("Usuario ");
        String user = sc.next();
        System.out.println("Ingresa tu contraseña");
        String password = sc.next();
        // Verificamos usuario y contraseña con .equals
        if (usuario.equals(user)) {
            if (contrasena.equals(password)) {
                System.out.println("Bienvenido, ingreso exitoso");
            }
        } else {
            System.out.println("Usuario o contraseña incorrecta, intenta de nuevo");
        }
        sc.close();
    }//cierre de main
}// cierre de clase


