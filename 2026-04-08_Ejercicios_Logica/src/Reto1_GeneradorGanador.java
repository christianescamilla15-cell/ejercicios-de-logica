import java.util.Scanner;
import java.util.Random;

/**
 * Reto 1: Generador de número ganador al azar.
 * El usuario ingresa el número total de participantes
 * y el programa muestra por consola el número ganador.
 */
public class Reto1_GeneradorGanador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número total de participantes: ");
        int participantes = sc.nextInt();

        if (participantes <= 0) {
            System.out.println("Error: El número de participantes debe ser mayor a 0.");
        } else {
            int ganador = random.nextInt(participantes) + 1;
            System.out.println("\n¡El número ganador es: " + ganador + " de " + participantes + " participantes!");
        }

        sc.close();
    }
}
