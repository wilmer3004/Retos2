import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        // Declaramos variables
        int n, cont = 1;
        Double promedio = 0.0, suma = 0.0;
        String materia;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos el nombre de la materia a la que va a digitar las notas
        System.out.println("Digite el nombre de la materia: ");
        // Capturamos el nombre de la materia
        materia = entrada.nextLine();
        // Solicitamos al usuario cuantas notas va a ingresar
        System.out.println("Digite cuantas notas va a ingresar");
        // Capturamos la cantidad de notas
        n = entrada.nextInt();
        // Creamos un array para almacenar las notas
        Double [] nota = new Double [n];
        // Creamos un bucle para que capture n notas
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite la nota  #" + cont + " de 1,0 a 5,0:");
            nota [i] = entrada.nextDouble(); 
            cont +=1;
        }
        // Creamos un bucle para sumar las notas que hay en el arreglo nota
        for (int j = 0; j < nota.length; j++) {
            suma = suma + nota[j];
        }
        //  realizamos la operación del promedio que tienen las notas 
        promedio = suma/n;
        System.out.println("Las notas que usted ingreso de la materia "+materia+" fueron: ");
        // Creamos un bucle para mostrar las notas ingresadas
        for (Double dato : nota) {
            System.out.print(dato + " ");
        }
        // Creamos una condicional para evaluar el promedio de la notas y asi indicar al usuario ri aprobó o reprobó
        if (promedio < 3) {
            System.out.println("\nEl promedio de las notas fue de " + promedio +  " por lo tanto reprobaste");
        } 
        else if (promedio >= 3 && promedio <= 4) {
            System.out.println("\nEl promedio de las notas fue de " + promedio +  " por lo tanto pasaste raspando");            
        }
        else if (promedio > 4 && promedio <= 5) {
            System.out.println("\nEl promedio de las notas fue de " + promedio +  " por lo tanto aprobaste con buenos resultados");            
        }
        else {
            System.out.println("El promedio es mayor que 5 o menor que 0 por lo tanto alguna de las notas que usted dígito es errónea");
        }
        // Limpiamos buffer
        entrada.close();
    }
    
}
