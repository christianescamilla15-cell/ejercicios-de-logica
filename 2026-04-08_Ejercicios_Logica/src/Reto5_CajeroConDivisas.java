import java.util.Scanner;
import java.util.ArrayList;

/**
 * Reto 5: Aplicación de cajero con conversión de divisas.
 * Solicita usuario y contraseña, luego permite:
 * 1. Consultar saldo
 * 2. Ingresar dinero
 * 3. Retirar dinero
 * 4. Consultar últimos movimientos
 * 5. Convertir divisas (MXN↔USD, MXN↔EUR, USD↔EUR)
 * 6. Salir (presione 0)
 */
public class Reto5_CajeroConDivisas {

    static final double MXN_A_USD = 0.058;
    static final double MXN_A_EUR = 0.054;
    static final double USD_A_EUR = 0.93;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BIENVENIDO AL CAJERO =====");
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        System.out.println("\n¡Bienvenido, " + usuario + "!");

        double saldo = 0;
        ArrayList<String> movimientos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Consultar últimos movimientos");
            System.out.println("5. Convertir divisas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + String.format("%.2f", saldo) + " MXN");
                    break;

                case 2:
                    System.out.print("Monto a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        movimientos.add("Depósito: +$" + String.format("%.2f", deposito));
                        System.out.println("Depósito exitoso. Saldo: $" + String.format("%.2f", saldo));
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Monto a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        movimientos.add("Retiro: -$" + String.format("%.2f", retiro));
                        System.out.println("Retiro exitoso. Saldo: $" + String.format("%.2f", saldo));
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Últimos movimientos ---");
                    if (movimientos.isEmpty()) {
                        System.out.println("Sin movimientos.");
                    } else {
                        for (int i = movimientos.size() - 1; i >= Math.max(0, movimientos.size() - 5); i--) {
                            System.out.println("  " + movimientos.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Convertir Divisas ---");
                    System.out.println("1. MXN → USD");
                    System.out.println("2. MXN → EUR");
                    System.out.println("3. USD → EUR");
                    System.out.println("4. USD → MXN");
                    System.out.println("5. EUR → MXN");
                    System.out.println("6. EUR → USD");
                    System.out.print("Seleccione conversión: ");
                    int conv = sc.nextInt();
                    System.out.print("Monto a convertir: ");
                    double monto = sc.nextDouble();

                    double resultado = 0;
                    String label = "";

                    switch (conv) {
                        case 1: resultado = monto * MXN_A_USD; label = "USD"; break;
                        case 2: resultado = monto * MXN_A_EUR; label = "EUR"; break;
                        case 3: resultado = monto * USD_A_EUR; label = "EUR"; break;
                        case 4: resultado = monto / MXN_A_USD; label = "MXN"; break;
                        case 5: resultado = monto / MXN_A_EUR; label = "MXN"; break;
                        case 6: resultado = monto / USD_A_EUR; label = "USD"; break;
                        default: System.out.println("Opción no válida."); continue;
                    }
                    System.out.println("Resultado: " + String.format("%.2f", resultado) + " " + label);
                    break;

                case 0:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto, " + usuario + "!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
