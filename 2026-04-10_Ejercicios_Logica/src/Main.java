/**
 * Reto 1: Main — Demostración del uso de CuentaBancaria
 *
 * Este programa:
 * 1. Crea al menos una cuenta bancaria
 * 2. Realiza depósitos y retiros
 * 3. Muestra los resultados en consola
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("═══════════════════════════════════════");
        System.out.println("   RETO 1 — CUENTA BANCARIA (POO)");
        System.out.println("═══════════════════════════════════════");

        // Crear primera cuenta — Christian Hernández
        CuentaBancaria cuenta1 = new CuentaBancaria(
            "Christian Hernández",
            5000.00,
            "Ahorro"
        );

        // Mostrar información inicial
        cuenta1.mostrarInformacion();

        // Realizar operaciones
        System.out.println("\n--- Operaciones en la cuenta 1 ---");
        cuenta1.depositarDinero(1500.50);
        cuenta1.retirarDinero(800.00);

        // Consultar saldo directamente
        System.out.println("\nSaldo consultado: $" + String.format("%.2f", cuenta1.consultarSaldo()));

        // Prueba de validaciones
        System.out.println("\n--- Pruebas de validación ---");
        cuenta1.retirarDinero(50000);  // Debe fallar — insuficiente
        cuenta1.depositarDinero(-100); // Debe fallar — monto negativo
        cuenta1.retirarDinero(0);      // Debe fallar — monto cero

        // Mostrar estado final
        cuenta1.mostrarInformacion();

        // Crear segunda cuenta para demostrar múltiples instancias
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("   SEGUNDA CUENTA (demo de POO)");
        System.out.println("═══════════════════════════════════════");

        CuentaBancaria cuenta2 = new CuentaBancaria(
            "María López",
            10000.00,
            "Corriente"
        );

        cuenta2.mostrarInformacion();
        cuenta2.depositarDinero(2500);
        cuenta2.retirarDinero(1200);
        cuenta2.mostrarInformacion();

        // Resumen final
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("   RESUMEN FINAL");
        System.out.println("═══════════════════════════════════════");
        System.out.println("Cuenta 1 — " + cuenta1.getNombreTitular() + ": $" + String.format("%.2f", cuenta1.consultarSaldo()));
        System.out.println("Cuenta 2 — " + cuenta2.getNombreTitular() + ": $" + String.format("%.2f", cuenta2.consultarSaldo()));
        System.out.println("═══════════════════════════════════════");
    }
}
