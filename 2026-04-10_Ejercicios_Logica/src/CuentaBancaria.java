/**
 * Reto 1: Modelado de Cuenta Bancaria con POO
 *
 * Clase que representa una cuenta bancaria con:
 * - Atributos: nombre del titular, saldo, tipo de cuenta
 * - Métodos: mostrar información, consultar saldo, depositar, retirar
 */
public class CuentaBancaria {

    // ─── Atributos ────────────────────────────────────────
    private String nombreTitular;
    private double saldo;
    private String tipoCuenta;

    // ─── Constructor ──────────────────────────────────────
    public CuentaBancaria(String nombreTitular, double saldoInicial, String tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }

    // ─── Métodos ──────────────────────────────────────────

    /**
     * Muestra la información completa de la cuenta.
     */
    public void mostrarInformacion() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║   INFORMACIÓN DE LA CUENTA        ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ Titular: " + nombreTitular);
        System.out.println("║ Tipo:    " + tipoCuenta);
        System.out.println("║ Saldo:   $" + String.format("%.2f", saldo));
        System.out.println("╚═══════════════════════════════════╝");
    }

    /**
     * Retorna el saldo actual de la cuenta.
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
     * Deposita un monto a la cuenta. Valida que sea positivo.
     */
    public void depositarDinero(double monto) {
        if (monto <= 0) {
            System.out.println("⚠️  Error: El monto a depositar debe ser mayor a 0.");
            return;
        }
        saldo += monto;
        System.out.println("✅ Depósito exitoso de $" + String.format("%.2f", monto));
        System.out.println("   Nuevo saldo: $" + String.format("%.2f", saldo));
    }

    /**
     * Retira un monto de la cuenta. Valida que sea positivo y que haya saldo suficiente.
     */
    public void retirarDinero(double monto) {
        if (monto <= 0) {
            System.out.println("⚠️  Error: El monto a retirar debe ser mayor a 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("⚠️  Error: Saldo insuficiente. Saldo actual: $" + String.format("%.2f", saldo));
            return;
        }
        saldo -= monto;
        System.out.println("✅ Retiro exitoso de $" + String.format("%.2f", monto));
        System.out.println("   Nuevo saldo: $" + String.format("%.2f", saldo));
    }

    // ─── Getters y Setters ────────────────────────────────
    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
