package dosw.slides_s05_tdd;

/**
 * Ejemplo de TDD de "DOSW 1 - S05.pptx" (diapositivas 54-56): esta
 * clase se escribió DESPUÉS de CalculadoraTest, siguiendo el ciclo
 * ROJO (test falla porque la clase no existe) → VERDE (se escribe el
 * mínimo código para pasar) → REFACTOR. El método suma() es el único
 * comportamiento pedido por el cliente en el enunciado del ejemplo.
 */
public class Calculadora {

    // Suma dos números decimales; funciona igual con enteros, negativos o mezclados (conmutativa).
    public double suma(double a, double b) {
        return a + b;
    }
}
