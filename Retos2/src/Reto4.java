import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
    // Declaramos variables e inicializamos las matrices
    String [] [] producto = new String [4][4];
    Double [] [] precio = new Double [4][4];
    // Instanciamos la clase Scanner
    Scanner entrada = new Scanner(System.in);
    // Creamos un bucle para recorrer filas
    for (int x = 0; x < 4; x++) {
        // Creamos un bucle para recorrer columnas 
        for (int y = 0; y < 4; y++) {
            // Solicitamos el nombre del producto
            System.out.println("Ingrese el nombre del producto: ");
            // Capturamos en el arreglo producto el nombre del producto
            producto [x] [y] = entrada.nextLine();
            // Solicitamos el precio del producto
            System.out.println("Por favor ingrese el nombre que tiene el producto " + producto [x] [y]);
            // Capturamos el precio del producto
            precio [x] [y] = entrada.nextDouble();
            // Cambiamos el tipo de entrada del dato
            entrada.nextLine();
     }
    }
    for (int x = 0; x < 4; x++) {   
        for (int y = 0; y < 4; y++) {
            System.out.print(x +""+y + " ");
        }
        System.out.println();
        for (int y = 0; y < 4; y++) {
            System.out.print( producto [x] [y] + " ");
        }
        System.out.println();
        for (int y = 0; y < 4; y++) {
            System.out.print("$" + precio [x] [y] + " ");
        }
        System.out.println();
    }

    // Limpiamos el buffer
    entrada.close();
}
    
}
