import java.util.Scanner;

/**
 * Reto 6: Implementar la secuencia de Fibonacci en Java.
 * "Cada número es la suma de los dos anteriores, empezando por 0 y 1."
 * Ejemplo: 0 1 1 2 3 5 8 13 21 34 55 89 ...
 */
public class Reto6_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números de Fibonacci deseas ver? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser mayor a 0.");
            sc.close();
            return;
        }

        System.out.println("\nSecuencia de Fibonacci (" + n + " números):");

        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) System.out.print(", ");

            long temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
        sc.close();
    }
}
