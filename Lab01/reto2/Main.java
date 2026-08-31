import java.util.List;

/**
 * Reto 2 - Carrera en Paralelo.
 * Procesa las dos listas de la carrera y muestra el resultado combinado
 * de cada una (máximo, mínimo, cantidad y las verificaciones pedidas).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(14, 3, 27, 8, 51, 6);
        List<Integer> lista2 = List.of(100, 45, 72, 13, 88);

        mostrar("Lista 1", lista1);
        mostrar("Lista 2", lista2);
    }

    // Imprime el resumen de una lista en el formato pedido por el enunciado,
    // apoyándose en CarreraUtils.combinar() para obtener todos los datos.
    private static void mostrar(String etiqueta, List<Integer> datos) {
        Resultados r = CarreraUtils.combinar(datos);
        System.out.println(etiqueta + " => max:" + r.mayor() + " min:" + r.menor() + " cant:" + r.cantidad());
        System.out.println("  ¿" + r.mayor() + " múltiplo de 2? " + (r.mayorMultiploDe2() ? "Sí" : "No"));
        System.out.println("  ¿" + r.mayor() + " divisible entre 2? " + (r.mayorDivisibleEntre2() ? "Sí" : "No"));
        System.out.println("  ¿Cantidad (" + r.cantidad() + ") es " + (r.cantidadPar() ? "par? Sí" : "impar? Sí"));
    }
}
