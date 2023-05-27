import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
    // Declaramos variables
    int cont=1,cont1=1,cont2=0;
    // Declaramos e inicializamos las matrices
    String [] [] producto = new String [8][4];
    // Instanciamos la clase Scanner
    Scanner entrada = new Scanner(System.in);
    // Creamos un bucle para recorrer filas
    for (int x = 0; x < 8; x++) {
        // Creamos un bucle para recorrer columnas 
        for (int y = 0; y < 4; y++) {
            // Solicitamos el nombre del producto
            if (x==0||x==2||x==4||x==6) {
            System.out.println("Ingrese el nombre del producto #"+cont+": ");
            // Capturamos en el arreglo producto el nombre del producto
            producto [x] [y] = entrada.nextLine(); 
            cont+=1;
            }
            else {
            // Solicitamos el precio del producto
            System.out.println("Por favor ingrese el precio que tiene el producto #"+ cont1 );
            // Capturamos el precio del producto
            producto [x] [y] = entrada.nextLine();
            cont1+=1;
            }        
     }
    }
    System.out.println();
    // Mostramos en una tabla los resultados almacenados en la matriz
    // Creamos un bucle para recorrer filas
    for (int x = 0; x < 8; x++) {       
        // Creamos un bucle para recorrer las posiciones de la maquina expendedora
        for (int y = 0; y < 4; y++) {
            // Creamos una condición para verificar en que iteración va a mostrar los nombres y la posición del producto
            if (x==0||x==2||x==4||x==6) {
                for (y = 0; y < 4; y++) {
                    // Mostramos la posición del producto
                    System.out.print(cont2 +"."+y + " \t");   
                }
                System.out.println();
                // Creamos un bucle para recorrer columnas
            for ( y = 0; y < 4; y++) {
                // Mostramos el nombre del producto
                System.out.print( producto [x] [y] + " \t");
        }
        }
        else {
        // Creamos un bucle para recorrer columnas
            for ( y = 0; y < 4; y++) {
            // Mostramos el precio del producto
                System.out.print("$" + producto [x] [y] + " \t");
            }
        }        
        System.out.println();
    }
    // Creamos una condición para que le sume a cont2 cada vez que se cumpla y se termine el bucle anterior
    if (x==0||x==2||x==4||x==6) {
        cont2+=1;}
    }
    // Limpiamos el buffer
    entrada.close();
}

}
