import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
    // Declaramos variables
    int n, contador = 0, vidas = 5, respuesta= 2, cont3=0, cont2=0, cont4 = 0;
    String letra ;
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
    System.out.println();
    // Creamos un bucle para que se ejecute siempre y x sea mayor a 0
    for (int x = 5; x > 0; x--) {
// Creamos un bucle para que se ejecute siempre y cuando el usuario no haya adivinado la palabra
        while (respuesta ==2 && x>0) {
            cont2=0;
            System.out.println("Usted cuenta con #" + x + " vidas.");
        System.out.println();
        // Solicitamos una letra que el usuario crea que es correcta
        System.out.println("Ingrese una letra del abecedario: ");
        // Capturamos letra
        letra = entrada.nextLine(); 
        for (int u = 0; u < n; u++) {
            if (palabra[u].equalsIgnoreCase(letra)) {
                pDescubrir [u] = palabra[u];
                cont2+=1;
            }
        }
        // Le quitamos una vida si el usuario ingresa una letra incorrecta
        System.out.println();
        if (cont2==0) {
            System.out.println("Usted perdió una vida");
            x=x-1;  
        }
        // Mostramos que letras a adivinado el usuario hasta el momento
        System.out.println("Las letras adivinadas hasta el momento son: ");
        for (String dato1 : pDescubrir) {
            System.out.print(dato1 + " ");
        }
        System.out.println();
        // Preguntamos al usuario si ya adivino la palabra
        System.out.println("¿Señor usuario ya logro adivinar la palabra o ya no cuenta con mas vidas? \n1. si \n2. no\nElija: ");
        // Capturamos la respuesta
        respuesta = entrada.nextInt();
        entrada.nextLine();
        }
        System.out.println("Ingrese cada una de las letras si ya logro adivinar la palabra o ya no cuenta con mas vidas." );
        // Solicitamos cada una de las letras de la palabra que cree que logro adivinar
        for (int z = 0; z < pDescubrir.length; z++) {
          System.out.println("Ingrese la letra de la posición #" + z + ":");
          pDescubrir [z] = entrada.nextLine();
        }
        for (int s = 0; s < pDescubrir.length; s++) {
            if (palabra[s].equalsIgnoreCase(pDescubrir[s])) {
                cont3+=1;
                if (cont3 ==n) {
                x =  x - vidas;
                }
                
            }
            else {
                x =  x - vidas;  
            }
        }
    }
if (cont3==n) {
    System.out.println("Felicidades usted gano");
}
else if (cont3<n ){
System.out.println("Lo sentimos usted perdió, la palabra que usted escribió es: " );
for (String dato3 : pDescubrir) {
    System.out.print(dato3 + " ");
}
System.out.println("\nLa palabra a descubrir era: ");
for (String dato4 : palabra) {
    System.out.print(dato4 + " ");
}
}
    // Limpiamos el buffer
    entrada.close();
    }
    
}
