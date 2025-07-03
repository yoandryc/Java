import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        for (int i = 1; i < 100; i*=2) {
            System.out.println(i);
        }*/
        /*
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Esto es del primer for, vuelta numero "+i);
            for (int j = 1; j < 10 ; j++) {
                System.out.println("Esto es del segundo for, vuelta numero "+j);
            }
        }
        */
        /*
        * 1. uilizando ciclos anidados . en este caso for
        * relizar la siguiente figura
        * # # # #
        * # # # #
        * # # # #
        * # # # #
         */
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("# ");

            }
            System.out.println("");
        }
        int simbolo;
        System.out.println("de cuanto va a ser joven");
        simbolo = sc.nextInt();
        for (int i = 0; i < simbolo; i++) {
            for (int j = 0; j <simbolo ; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }


    }
}
