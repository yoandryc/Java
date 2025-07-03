import org.generation.operaciones.Operaciones;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creacion de un objeto, instaciar la clase operaciones.
        Operaciones operacionesObjeto=new Operaciones();
        Ejercicios ejerciciosObjeto =new Ejercicios();
        // usando metodo estatico desde la clase
        Operaciones.showMenu();
        //usando metodo de instancia
        System.out.println(operacionesObjeto.sumar(17,21));
        System.out.println(operacionesObjeto.restar(17,21));
        System.out.println(operacionesObjeto.restar(21,17));
        System.out.println(ejerciciosObjeto.sumaParcial(100));
        Ejercicios.ajedrez(4);
        System.out.println(operacionesObjeto.getCirculoArea(7));
        String hipotenusa = calcularHipotenusa(cateto1, cateto2);
        System.out.println(operacionesObjeto.hypot(5,6));
    }
}