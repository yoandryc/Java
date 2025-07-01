package variablesDatosOperadores;

public class VariablesDatosOperadores {
/*
* Todo debe de ir dentro del metodo principal
 */
public static void main (String[] args){
//boolean
    boolean javaDivertido = true;
    boolean javaDificil= false;
    //byte
    byte minByte = -128;
    byte maxByte = 127;
    char letraA = 'A';
    char letraUnicode = '\u0041';
    //short
    short minShort = -32768;
    short maxShort = 32767;
    //Int
    int edad= 28;
    int primerSueldo = 30000; //decretado
    //Long
    long distanciaTierraSol = 149600000000L; // L al final indica tipo de dato long
    //Float
    float pi=3.1416f; //F para indicar que es un dato flotante
    //Double
    double gravedad= 9.80665;
    //imprimir valores
    //Concatenar:
    //"texto simple " + variable + "mas texto"
    System.out.println("Boolean: "+ javaDivertido + ", "+ javaDificil); //sout + tab para auto completar
    //Completar
    System.out.println("Byte: "+ minByte + ", "+maxByte);
    System.out.println("Char: "+ letraA + "y "+ letraUnicode);
    System.out.println("Short: "+ minShort +", "+ maxShort);
    System.out.println("Int: Edad de la juventud "+edad + " Mi primer sueldo " + primerSueldo);
    System.out.println("Long: La distancia de la tierra al sol es: "+ distanciaTierraSol);
    System.out.println("Float: "+pi);
    System.out.println("Double "+gravedad);
/// ////////////////////////////////////////////////////////////////////////
    //operadores comparatidos
    boolean esIgual= (5==5);
    boolean noEsIgual= (5!=3);
    boolean mayorQue = (5>3);
    boolean menorQue = (3<5);
    boolean mayorIgualQue =(5>=5);
    boolean menorIgualQue =(3<=5);
    System.out.println("operadores comparativos");
    System.out.println("Igual a "+ esIgual);
    System.out.println("No es igual "+ noEsIgual);
    System.out.println("Mayor que " +mayorQue);
    System.out.println("Menor que " +menorQue);
    System.out.println("Mayor o igual que "+mayorIgualQue);
    System.out.println("Menor o igual que "+menorIgualQue);

}//cierre de main
}// Cierre de clase
