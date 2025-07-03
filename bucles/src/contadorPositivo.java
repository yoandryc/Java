import java.util.Scanner;
public class contadorPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc=0,aux=0;
        while (true){
            System.out.println("ingresa un numero positivo");
            opc=sc.nextInt();

            if (opc>0){
                aux++;
            }else{
                break;
            }
        }
        System.out.println("ingresaste "+aux+ " Positivos");











    }
}
