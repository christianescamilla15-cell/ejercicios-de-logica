import java.util.Scanner;
import java.util.Random;

/**
 * Reto 3: Adivinar un número.
 * 1. El programa declara un número al azar del 1 al 10 (Class Random)
 * 2. Mientras no se haya adivinado, el usuario puede seguir ingresando números
 * 3. Avisa si el número ingresado es mayor o menor al declarado
 * 4. El programa termina cuando el usuario adivine el número
 */
public class Reto3_AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        int intento;
        int intentos = 0;

        System.out.println("¡Adivina el número del 1 al 10!");

        do {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento > numeroSecreto) {
                System.out.println("El número es MENOR. Intenta de nuevo.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es MAYOR. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + " en " + intentos + " intentos.");
            }
        } while (intento != numeroSecreto);

        sc.close();
    }
}
