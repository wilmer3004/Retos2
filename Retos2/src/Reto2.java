import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        // Declaramos variables
        int n, contador = 0;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos cuantos nadadores participaron en la competencia
        System.out.println("Ingrese la cantidad de nadadores que participaron en la competencia de natación: ");
        // Capturamos n
        n = entrada.nextInt();
        // Creamos un array para captura los nombres y otro para los tiempos
        String [] nombre = new String[n];
        Double [] tiempo = new Double [n];
        entrada.nextLine();
        // Creamos un bucle para almacenar el nombre del competidor 

        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese el nombre del participante #" + contador);
            contador+=1;
            nombre [i] = entrada.nextLine(); 
        }
        // Creamos un bucle para recolectar el tiempo del competidor
        for (int j = 0; j < tiempo.length; j++) {
            System.out.println("Ingrese el tiempo del participante " + nombre[j] + "");
            tiempo [j] = entrada.nextDouble();
        }
        // Creamos un bucle para mostrar el competidor y su tiempo
        for (int  x= 0; x < n; x++) {
            System.out.println("El participante " + nombre[x] + " realizo un tiempo de " + tiempo[x]);
        }
        // Creamos un bucle para evaluar quien gano
        for (int m = 0; m < tiempo.length; m++) {
            for (int l = 1; l < n-1; l++) {
                if (tiempo[m]<tiempo[l]) {
                    System.out.println("El tiempo de " + nombre[m] + " es de: " + tiempo[m] +" siendo menor que el de "+ nombre[l] +" con un tiempo de: " + tiempo[l]);
                }
                else if (tiempo[m]>tiempo[l]){
                    System.out.println("El tiempo de " + nombre[l] + " es de: " + tiempo[l] +" siendo menor que el de "+ nombre[m] +" con un tiempo de: " + tiempo[m]); 
                }
            }
        }


        // Limpiamos el buffer
        entrada.close();
    }
    
}
