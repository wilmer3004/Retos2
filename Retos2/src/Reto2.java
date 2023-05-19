import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        // Declaramos variables
        int n, contador = 0;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos cuantos nadadores participaron en la competencia
        System.out.println("Ingrese la cantidad de competidores que participaron en la competencia de natación: ");
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
        for (int l = 0; l < tiempo.length; l++) {
            System.out.println("Ingrese el tiempo del participante " + nombre[l] + ": ");
            tiempo [l] = entrada.nextDouble();
        }
        // Creamos el array para tomar los tiempos de menor a mayor
        Double [] maxMin = new Double [n];
        // Inicializamos el contador nuevamente a 0
        contador = 0;
        // Creamos un bucle para mostrar el competidor y su tiempo
        for (int  x= 0; x < n; x++) {
            System.out.println("El participante " + nombre[x] + " realizo un tiempo de " + tiempo[x]);
            maxMin [contador] = tiempo[x] ;
            contador = contador + 1;
        }

        // Creamos un bucle para organizar los tiempos de menor a mayor y asu vez los nombres
  for (int k = 0; k < n; k++) {
        // Declaramos las variables dentro del bucle para que vuelvan a 0 y 1 una vez que se haya ejecutado el siguiente bucle
            Double  nu = 0.0;
            String nomb = " ";
            int cont = 1;
        // Creamos un bucle para que se evalúen todos los números que fueron definidos en el arreglo maxmin según  la cantidad de números ingresados
            for (int j = 0; j < (n-1); j++) {
                // Verificamos si el numero siguiente a la posición 0 es mayor al de la posición 0 y asi sucesivamente mientras la posición j sea menos a la cantidad total de números ingresados menos 1, ademas validamos que cont no sea mayor a la cantidad total de números ingresados
                if (maxMin [cont] > maxMin [j] && cont<= n) {
                    // Almacenamos temporalmente dentro de una variable el numero que estaba en la posición j para asi no perder el valor que estaba en esta posición dentro del arreglo
                    nu = maxMin [j];
                    nomb = nombre[j];
                    // Asignamos el valor del arreglo maxmin de la posición j a el de la posición cont de acuerdo a si se cumple la condición
                    maxMin [j] = maxMin [cont];
                    nombre [j] = nombre [cont];
                    // Reasignamos a la posición cont el valor almacenado en la variable nu
                    maxMin [cont] = nu;
                    nombre [cont]= nomb; 
                
                }
            cont = cont + 1;   
            }
        }
        // Indicamos el orden de los participantes según su tiempo para indicar las posiciones
        System.out.println("El orden de los competidores del mayor tiempo al menor es el siguiente: ");
        // Creamos un bucle para mostrar los tiempos de los usuarios de menor a mayor
    for (int z = 0; z < maxMin.length; z++) {
        System.out.println(nombre[z]+": " + maxMin[z] +" minutos.");
    }
    System.out.println("Por lo tanto gano: " + nombre[n-1] + " con un tiempo de " + maxMin[n-1] + " minutos, siendo el menor de todos los tiempos.");



        // Limpiamos el buffer
        entrada.close();
    }
    
}
