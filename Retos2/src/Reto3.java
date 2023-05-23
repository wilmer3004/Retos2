import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
    // Declaramos variables
    int n, contador = 0, vidas = 5, respuesta= 2, cont3=0, cont2=0;
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
        // Le asignamos según la posición i a pDescubrir un guion bajo
        pDescubrir[i]="_";
    }
    // Mostramos un mensaje para describir que significan los guiones bajos
    System.out.println("La palabra que tiene que descubrir es: \n");
    // Mostramos la cantidad de letras que hay como guiones bajos según pDescubrir
    for (String dato : pDescubrir) {
        System.out.print(dato + " ");
    }
    System.out.println();
    // Creamos un bucle para que se ejecute siempre y cuando x sea mayor a 0
    for (int x = 5; x > 0; x--) {
// Creamos un bucle para que se ejecute siempre y cuando el usuario no haya adivinado la palabra
        while (respuesta ==2 && x>0) {
            cont2=0;
            // Mostramos la cantidad de vidas que posee el usuario
            System.out.println("Usted cuenta con #" + x + " vidas.");
        System.out.println();
        // Solicitamos una letra que el usuario crea que es correcta
        System.out.println("Ingrese una letra del abecedario: ");
        // Capturamos letra
        letra = entrada.nextLine(); 
        // Creamos un bucle para comparar si la letra ingresada esta el arreglo palabra
        for (int u = 0; u < n; u++) {
            // Creamos una condición para comparar la letra con el arreglo palabra
            if (palabra[u].equalsIgnoreCase(letra)) {
                // Si se cumple la condición se le va a asignar en la posición u la letra que esta definida en la posición u en palabra
                pDescubrir [u] = palabra[u];
                // Le sumamos a cont2  1 si cada vez que se cumpla la condición 
                cont2+=1;
            }
        }
        // Le quitamos una vida si el usuario ingresa una letra incorrecta
        System.out.println();
        // Si cont2 = 0 significa que no hay ninguna letra adivinada por lo tanto se le restara una vida
        if (cont2==0) {
            System.out.println("Usted perdió una vida");
            x=x-1;  
        }
        // Mostramos que letras a adivinado el usuario hasta el momento
        System.out.println("Las letras adivinadas hasta el momento son: ");
        // Creamos un bucle para mostrar que letras se han adivinado
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
        // Si ya perdió todas las vidas o el usuario cree que ya adivino la palabra le va a preguntar cada una de las letras según la longitud del arreglo pDescubrir
        System.out.println("Ingrese cada una de las letras si ya logro adivinar la palabra o ya no cuenta con mas vidas." );
        // Solicitamos cada una de las letras de la palabra que cree que logro adivinar
        for (int z = 0; z < pDescubrir.length; z++) {
          System.out.println("Ingrese la letra de la posición #" + z + ":"); 
          pDescubrir [z] = entrada.nextLine();
        }
        // Creamos un bucle que compare la palabra que se tenia que descubrir con la palabra que ingreso el usuario
        for (int s = 0; s < pDescubrir.length; s++) {
            // Ejecutamos una condición para que se le sume a cont3 uno cada vez que se cumpla y al final le restaremos x la cantidad de vidas si la longitud del arreglo = a cont3
            if (palabra[s].equalsIgnoreCase(pDescubrir[s])) {
                cont3+=1;
                if (cont3 ==n) {
                x =  x - vidas;
                }
                
            }
            // Si no se cumple la validación inmediatamente le quitara a x la cantidad de vidas para que se acabe el bucle
            else {
                x =  x - vidas;  
            }
        }   
    }
    // Si cont3 es igual a n vamos a identificar que el usuario acertó la palabra por lo tanto ganara el juego
if (cont3==n) {
    System.out.println("Felicidades usted gano");
}
// De lo contrario el usuario perderá y se le mostrar cual palabra dígito y en realidad cual era la palabra a descubrir
else if (cont3<n ){
System.out.println("Lo sentimos usted perdió, la palabra que usted escribió es: " );
// Creamos un bucle para mostrar la palabra que dígito en el arreglo el usuario
for (String dato3 : pDescubrir) {
    System.out.print(dato3 + " ");
}
System.out.println("\nLa palabra a descubrir era: ");
// Creamos un bucle para mostrar la palabra que en realidad tenia que descubrir el usuario
for (String dato4 : palabra) {
    System.out.print(dato4 + " ");
}
}
    // Limpiamos el buffer
    entrada.close();
    }
    
}
