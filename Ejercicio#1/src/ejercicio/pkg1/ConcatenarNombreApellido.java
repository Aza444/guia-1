package ejercicio.pkg1;

import java.util.Scanner;

public class ConcatenarNombreApellido {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese sus apellidos
        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        // Concatenar el nombre y apellidos
        String nombreCompleto = nombre + " " + apellidos;

        // Imprimir el resultado
        System.out.println("Nombre completo: " + nombreCompleto);

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
