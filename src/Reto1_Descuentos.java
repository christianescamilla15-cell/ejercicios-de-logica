import java.util.Scanner;

public class Reto1_Descuentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el monto de compra: $");
        double monto = sc.nextDouble();

        double porcentaje;

        if (edad < 18) {
            porcentaje = 5;
        } else if (edad <= 60) {
            porcentaje = 10;
        } else {
            porcentaje = 20;
        }

        double descuento = monto * (porcentaje / 100);
        double total = monto - descuento;

        System.out.println("\n--- Resultado ---");
        System.out.println("Descuento aplicado: " + porcentaje + "% ($" + descuento + ")");
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}
