import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
    // Declaramos variables
    int n, contador = 0;
    // Instanciamos la clase Scanner
    Scanner entrada = new Scanner(System.in);
    // Solicitamos la cantidad de letras de la palabra
    System.out.println("Ingrese la cantidad de letras que tiene la palabra que usted va a ingresar: ");
    // Capturamos el valor n
    n = entrada.nextInt();
    // Creamos un array para capturar la palabra 
    String [] palabra = new String [n];
    String [] pDescubrir = new String [n];
    // Creamos un bucle para capturar las letras de la palabra que desea que el otro usuario adivine
    entrada.nextLine();
    for (int i = 0; i < palabra.length; i++) {
        contador+=1;
        System.out.println("Ingrese la letra de la posición " + contador +": ");
        palabra[i] = entrada.nextLine();
        pDescubrir[i]="_";
    }
    System.out.println("La palabra que tiene que descubrir es: \n");
    for (String dato : pDescubrir) {
        System.out.print(dato + " ");
    }
    // Limpiamos el buffer
    entrada.close();
    }
    
}
