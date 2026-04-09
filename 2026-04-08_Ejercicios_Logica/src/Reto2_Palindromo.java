import java.util.Scanner;

/**
 * Reto 2: Determinar si un texto es un palíndromo.
 * Solicita al usuario un texto y muestra:
 * - "Es un palíndromo"
 * - "No es un palíndromo"
 */
public class Reto2_Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String invertido = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertido)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        sc.close();
    }
}
