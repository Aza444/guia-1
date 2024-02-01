package ejercicio.pkg2;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer valor
        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo valor
        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el tercer valor
        System.out.print("Ingrese el tercer valor: ");
        double valor3 = scanner.nextDouble();

        // Realizar las operaciones aritméticas
        double suma = valor1 + valor2 + valor3;
        double resta = valor1 - valor2 - valor3;
        double multiplicacion = valor1 * valor2 * valor3;

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
