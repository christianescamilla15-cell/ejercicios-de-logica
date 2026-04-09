/**
 * Conversor de Temperaturas — Celsius a Fahrenheit y Kelvin
 *
 * Fórmulas:
 *   Fahrenheit = (Celsius * 9/5) + 32
 *   Kelvin = Celsius + 273.15
 *
 * Validaciones:
 *   - El dato de entrada debe ser de tipo number
 *   - Si no es numérico, muestra error y vuelve a solicitar
 */

function convertir() {
    const input = document.getElementById('celsius');
    const errorDiv = document.getElementById('error');
    const resultDiv = document.getElementById('result');

    const valor = input.value.trim();
    const celsius = Number(valor);

    // Validar que sea un número
    if (valor === '' || isNaN(celsius)) {
        errorDiv.classList.add('show');
        resultDiv.classList.remove('show');
        input.focus();
        input.select();
        console.error('Error: El valor ingresado no es un número válido:', valor);
        return;
    }

    // Ocultar error si existía
    errorDiv.classList.remove('show');

    // Conversiones
    const fahrenheit = (celsius * 9 / 5) + 32;
    const kelvin = celsius + 273.15;

    // Mostrar en DOM
    document.getElementById('resCelsius').textContent = celsius + ' °C';
    document.getElementById('resFahrenheit').textContent = fahrenheit.toFixed(2) + ' °F';
    document.getElementById('resKelvin').textContent = kelvin.toFixed(2) + ' K';
    resultDiv.classList.add('show');

    // Imprimir en consola
    console.log('--- Conversión de Temperaturas ---');
    console.log('Entrada: ' + celsius + ' °C');
    console.log('Grados Fahrenheit: ' + fahrenheit);
    console.log('Grados Kelvin: ' + kelvin);
}

// También permitir conversión con Enter
document.getElementById('celsius').addEventListener('keydown', function(e) {
    if (e.key === 'Enter') convertir();
});
