import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*
//*1 crear una variable que sirva de contador
        int counter =0;
 while (counter<100){
  /*   //primero suma 1 y luego lee el valor
     ++counter;
     //primero lee el valor actual y luego le suma 1

     System.out.println(counter);
     counter ++;
     }*/
         int userEntry=0;
    while (userEntry != -1){
        System.out.println("ingresa un numero: ");
        userEntry =sc.nextInt();
        if (userEntry ==0)continue;
        if(userEntry %2 ==0){
            System.out.println("ingresaste el numero " + userEntry +" y es un numero par");
            //reinicia el bucle desde el punto actual, lo que hace que
            //todo el codigo  denajo sea ingnorado
            continue;
        }
        System.out.println("ingresaste el numero " + userEntry +" y es un numero impar");
    }
/*
*1. pedir al usuario que ingrese  una contraseña
* 2. el usuario tiene 3 oportunidades para ingresar la contraseña
* 3.en cada ingreso erroneo mandar un mensaje.
* 4. si el usuario ingresa bien la contraseña , decirle que inicio sesion y parar el bucle (break)
* 5. si se le acaban los intentos terminar el bucle y mandar un mensaje de cuenta bloqueada
 */
short cont=0;
String password="1234" ,opc;
while (cont<3){
    System.out.println("ingresa la contraseña");
    opc = sc.next();

    if (opc.equals(password)){
        System.out.println("Inicio de sesion");
        break;

    }else{
        System.out.println("contraseña erronea");
        cont++;
    }

}
if (cont==3) System.out.println("Cuenta bloqueada");














    }
}