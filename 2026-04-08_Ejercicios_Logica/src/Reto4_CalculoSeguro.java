import java.util.Scanner;

/**
 * Reto 4: Cálculo automático de primas de seguro.
 * Calcula la prima base según la edad del usuario:
 * - Menores de 18: no pueden contratar
 * - 18-30 años: prima base $1000
 * - 31-50 años: prima base $1500
 * - 51-65 años: prima base $2500
 * - Mayores de 65: prima base $3500
 *
 * Ajuste por ingresos mensuales:
 * - Ingresos >= $300: aumento del 10% a la prima
 * - Ingresos < $300: aumento del 5% a la prima
 */
public class Reto4_CalculoSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("No puede contratar un seguro siendo menor de 18 años.");
            sc.close();
            return;
        }

        System.out.print("Ingrese sus ingresos mensuales: $");
        double ingresos = sc.nextDouble();

        double primaBase;

        if (edad <= 30) {
            primaBase = 1000;
        } else if (edad <= 50) {
            primaBase = 1500;
        } else if (edad <= 65) {
            primaBase = 2500;
        } else {
            primaBase = 3500;
        }

        double ajuste;
        if (ingresos >= 300) {
            ajuste = primaBase * 0.10;
        } else {
            ajuste = primaBase * 0.05;
        }

        double primaFinal = primaBase + ajuste;

        System.out.println("\n--- Cálculo de Seguro ---");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Ingresos mensuales: $" + ingresos);
        System.out.println("Prima base: $" + primaBase);
        System.out.println("Ajuste por ingresos: +$" + ajuste);
        System.out.println("Prima mensual a pagar: $" + primaFinal);

        sc.close();
    }
}
