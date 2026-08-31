import java.util.Comparator;
import java.util.List;

public class RetoFinal{
    public List<Estudiante> Ejercicio16(){
        List<Estudiante> estudiantes = List.of(
            new Estudiante("Ana", 4.5),
            new Estudiante("Carlos", 3.2),
            new Estudiante("Pedro", 2.8),
            new Estudiante("Laura", 4.8),
            new Estudiante("Andrés", 3.9),
            new Estudiante("María", 2.5)
        );

        List<Estudiante> est = estudiantes.stream()
        .filter(e -> e.getPromedio() >= 3.0)
        .map(e -> new Estudiante(e.getNombre().toUpperCase(), e.getPromedio()))
        .sorted(Comparator.comparingDouble(Estudiante::getPromedio).reversed())
        .peek(e -> System.out.println("Procesado: " + e.getNombre() + "  " + e.getPromedio()))
        .toList();

        System.out.println("\nLista final:");
        System.out.println(est);

        return est;
    }

    
    public static void main(String[] args) {
          RetoFinal reto= new RetoFinal();
          reto.Ejercicio16();
      }

}