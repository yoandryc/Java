import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int counter =1;
        do {
            System.out.println(counter);
            counter++;
        }while (counter<=100);*/
    int option;
    do {
        System.out.println("Seleciona una opcion: ");
        System.out.println("1. Saludar");
        System.out.println("2. Mostar el clima");
        System.out.println("3. salir");
        option= sc.nextInt();
        switch (option){
            case 1 -> System.out.println("hola como esta");
            case 2 -> System.out.println("El clima de hoy esta soleado");
            case 3 -> System.out.println("Byes");
            default -> System.out.println("Opcion incorrecta");
        }
    }while (option!=3);

/*
*pasar el ejerccio de la contraseña a la logica para el do while
* recordando que seiempre se ejecuta una vez
 */
        short cont=0;
        String password="1234" ,opc;
        do{
            System.out.println("ingresa la contraseña");
            opc = sc.next();

            if (opc.equals(password)){
                System.out.println("Inicio de sesion");
                break;

            }else{
                System.out.println("contraseña erronea");
                cont++;
            }

        }while (cont<3);
        if (cont==3) System.out.println("Cuenta bloqueada");



















    }
}
