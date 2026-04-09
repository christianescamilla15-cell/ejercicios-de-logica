import java.util.Scanner;

public class Reto2_Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        int opcion;

        do {
            System.out.println("\n===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
                    } else {
                        System.out.println("El monto debe ser mayor a 0.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Su saldo es: $" + saldo);
                    } else if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
