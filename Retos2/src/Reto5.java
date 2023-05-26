import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {

        // Declaramos variables
        int fila1, columna1, fila2, columna2, cont =0;

        // ---------------------------------------------------------------------------------

         // Instanciamos la clase Scanner
         Scanner entrada = new Scanner(System.in);
        // Declaramos e inicializamos las matrices que utilizaremos para almacenar los datos del concentrate

        // ---------------------------------------------------------------------------------

        // Esta primera matriz la utilizaremos para poderle mostrar los datos en incognito al usuario
        String [][] concentrate1 = new String [4][4];
         // Esta segunda matriz la utilizaremos para almacenar los datos que va a tener el concentrate
        String [][] concentrate2 = new String [4][4];
         // Esta primera matriz la utilizaremos para poder comparar si el usuario ya adivino algún campo
        int [][] concentrate3 = new int [4][4];
        
        // ---------------------------------------------------------------------------------

        // Definimos los valores de todas las posiciones de la matriz concentrate2 para identificar donde estarán las parejas
        concentrate2 [0][0]="22"; 
        concentrate2 [0][1]="10"; 
        concentrate2 [0][2]="15";
        concentrate2 [0][3]="22";
        concentrate2 [1][0]="10";   
        concentrate2 [1][1]="7";
        concentrate2 [1][2]="18";
        concentrate2 [1][3]="2";
        concentrate2 [2][0]="15";
        concentrate2 [2][1]="9";
        concentrate2 [2][2]="31";
        concentrate2 [2][3]="7";
        concentrate2 [3][0]="18";
        concentrate2 [3][1]="31";
        concentrate2 [3][2]="9";
        concentrate2 [3][3]="2";

        // Creamos un bucle para rellenar la matriz concentrate1 con ? y el primer bucle sera para recorrer filas
        for (int i = 0; i < 4; i++) {
            // Creamos un bucle para recorrer columnas
            for (int j = 0; j < 4; j++) {
                // Asignamos un incognito a la posición x = i & y = j 
                concentrate1 [i][j] = "?";
            }
        }

        // creamos un bucle para rellenar con 0 la matriz concentrate3 que sera la que nos servirá para que no se sume mas puntos si el usuario repite un numero 

        // Creamos un bucle para rellenar la matriz concentrate1 con ? y el primer bucle sera para recorrer filas 
        for (int x = 0; x < 4; x++) {
            // Creamos un bucle para recorrer columnas
            for (int y = 0; y < 4; y++) {
                // Asignamos un incognito a la posición x = i & y = j 
                concentrate3 [x][y] = 0;
            }
        }

        // ---------------------------------------------------------------------------------

        // Creamos un bucle para rellenar la matriz concentrate1 y el primer bucle sera para recorrer filas
        for (int i = 0; i < 4; i++) {
            // Creamos un bucle para recorrer columnas
            for (int j = 0; j < 4; j++) {
                // Asignamos un incognito a la posición x = i & y = j 
                concentrate1 [i][j] = "?";
            }
        }

        // ---------------------------------------------------------------------------------

        // Creamos un bucle para que se ejecute siempre y cuando vidas sea mayor a 0
        for (int vidas = 5; vidas > 0; vidas--) {
        System.out.println("Las parejas actualmente encontradas son la siguientes: \n");
        // Creamos un bucle para rellenar la matriz concentrate1 y el primer bucle sera para recorrer filas
        for (int i = 0; i < 4; i++) {
             // Creamos una condición para que se ejecute una sola vez para que se muestre la posición de columnas
             if (i == 0) {
                // Imprimimos una primera posición bacía
                System.out.print(" " + "\t"); 
                // Creamos un bucle para que muestre las posiciones de las columnas
                for (int k = 0; k < concentrate3.length; k++) {
                    System.out.print(k+ "\t"); 
                }
               System.out.println();
            }
            System.out.print(i + "\t");
            // Creamos un bucle para recorrer columnas
            for (int j = 0; j < 4; j++) {
               
                //  mostramos los datos almacenados en la posición x = i & y = j  de la matriz concentrate1
                 System.out.print( concentrate1 [i][j] + "\t");
            }
            System.out.println();
        }

        // ---------------------------------------------------------------------------------

        // Solicitamos al usuario que Digite la posición de la primer fila a compara
        System.out.println("\nPor favor ingrese la posición de la primer fila de 0 a 3, que desea comprobar: ");
        // Capturamos el valor de la fila1
        fila1 = entrada.nextInt();
        // Solicitamos al usuario que Digite una posición de la primer columna a comparar
        System.out.println("Por favor ingrese la posición de la primer columna de 0 a 3, que desea comprobar: ");
        // Capturamos el valor de la columna1
        columna1 = entrada.nextInt();

        // ---------------------------------------------------------------------------------

        // Solicitamos al usuario que Digite la posición de la segunda fila a compara
        System.out.println("Por favor ingrese la posición de la segunda fila de 0 a 3, que desea comprobar: ");
        // Capturamos el valor de la fila2
        fila2 = entrada.nextInt();
        // Solicitamos al usuario que Digite una posición de la segunda columna a comparar
        System.out.println("Por favor ingrese la posición de la segunda columna de 0 a 3, que desea comprobar: ");
        // Capturamos el valor de la columna2
        columna2 = entrada.nextInt();

        // ------------------------------------------------------------------------------------------

        // Creamos una condicional para evaluar que no se digite un valor mayor o menor a los indicados
        if (fila1 >3 || fila2>3 || columna1>3 || columna2>3 || fila1 <0 || fila2<0 || columna1<0|| columna2<0){
            System.out.println("Ingreso un valor no valido en una fila o columna");
        }
        // Creamos una condición para que me compare las dos posiciones que ingreso el usuario
        if (concentrate2 [fila1][columna1] == concentrate2[fila2][columna2]) {
            System.out.println("Felicidades acaba de encontrar una pareja");
            // Si se cumple la condición le asignaremos los valores de la matriz concentrate2 a la matriz concentrate1 según la variable fila1 y la variable columna1 y lo mismo con la tercera matriz concentrate3 solo que a esta le asignaremos un 1
            concentrate1 [fila1][columna1] = concentrate2 [fila1][columna1];
            concentrate3 [fila1][columna1] =1;
            // Si se cumple la condición le asignaremos los valores de la matriz concentrate2 a la matriz concentrate1 según la variable fila2 y la variable columna2 y lo mismo con la tercera matriz concentrate3 solo que a esta le asignaremos un 1
            concentrate1 [fila2][columna2] = concentrate2 [fila2][columna2];
            concentrate3 [fila2][columna2] = 1;
            vidas+=1;
        } 
        else {
            System.out.println("\nLas posiciones ingresadas no son iguales\n");
        }
        


        }
 
        // ---------------------------------------------------------------------------------


        // Limpiamos el buffer
        entrada.close();
    }
    
}
