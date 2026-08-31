package dosw.slides_s05_tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas siguiendo la estructura AAA (Arrange-Act-Assert) explicada
 * en "DOSW 1 - S05.pptx". Se escribieron ANTES que Calculadora.java
 * existiera (ciclo TDD: ROJO al no compilar/fallar, VERDE al
 * implementar suma(), y se re-corrieron tras cualquier refactor).
 */
class CalculadoraTest {

    // Caso base del docx: 3 + 5 = 8, con enteros representados como double.
    @Test
    void sumaDeEnterosPositivosDebeSerCorrecta() {
        Calculadora calculadora = new Calculadora(); // Arrange
        double resultado = calculadora.suma(3, 5);   // Act
        assertEquals(8, resultado);                  // Assert
    }

    // Progresión sugerida en la diapositiva 56: admitir números decimales.
    @Test
    void sumaDeDecimalesDebeSerCorrecta() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(2.5, 1.3);
        assertEquals(3.8, resultado, 0.0001);
    }

    // Progresión sugerida en la diapositiva 56: admitir números negativos.
    @Test
    void sumaConNumeroNegativoDebeSerCorrecta() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(10, -4);
        assertEquals(6, resultado);
    }

    // Progresión sugerida en la diapositiva 56: la suma debe dar igual sin importar si a > b o b > a.
    @Test
    void sumaDebeSerConmutativa() {
        Calculadora calculadora = new Calculadora();
        assertEquals(calculadora.suma(7, 2), calculadora.suma(2, 7));
    }
}
