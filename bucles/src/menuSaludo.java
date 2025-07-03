import java.util.Scanner;

public class menuSaludo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        byte opc=0;
        do {
            System.out.println("Menu interactivo");
            System.out.println("Seleciona una opcion: ");
            System.out.println("1. Saludar");
            System.out.println("2. Salir");
            opc=sc.nextByte();
            switch(opc){
                case 1 -> System.out.println("hola como esta joven");
                case 2 -> System.out.println("saliendo el menu");
                default -> System.out.println("Opcion incorrecta");
            }
        }while (opc!=2);

    }
}
