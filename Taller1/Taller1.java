import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Taller1{


    public List<String> Ejercicio1(){
        List<String> estudiantes = List.of("Ana", "Carlos", "Andres", "Pedro", "Alejandra", "Juan", "Amanda");
        List<String> empiezaA = estudiantes.stream()
        .filter(nombre -> nombre.startsWith("A"))
        .toList();

        return empiezaA;
    }

    public void Ejercicio2(){
        List<String> productos = List.of("Laptop", "Mouse", "Teclado", "Monitor", "Impresora");
        productos.forEach(producto -> System.out.println("Producto disponible: " + producto));
    }

    public List<String> Ejercicio3(){
        List<String> ciudades = List.of("Bogotá", "Medellín", "Cali", "Barranquilla");
        List<String> ciudadesM = ciudades.stream()
        .map(ciudad -> ciudad.toUpperCase())
        .toList();

        return ciudadesM;

    }

    public String Ejercicio4(){
        List<Integer> numInt = List.of(12, 8, 5, 10, 15);
        int suma = numInt.stream()
        .reduce(0, (acum, n) -> acum + n);

        return ("suma = " + suma);
    }

    public Set<String> Ejercicio5(){
        List<String> correos = List.of("a@correo.com", "b@correo.com", "a@correo.com", "c@correo.com", "b@correo.com");
        Set<String> correosR = correos.stream()
        .collect(Collectors.toSet());

        return correosR;
    }

    public List<String> Ejercicio6(){
        List<String> nombres = List.of("Laura", "Pedro", "Carlos", "Ana");
        List<String> nombresM = nombres.stream()
        .map(nombre -> nombre.toUpperCase())
        .peek(e -> System.out.println("Transformado: " + e))
        .toList();

        System.out.println("Lista: " + nombresM);
        return nombresM;
    }

    public void Ejercicio7(){
        List<Integer> edades = List.of(25, 18, 32, 21, 19, 28);
        List<Integer> edadesAsc = edades.stream()
        .sorted()
        .toList();
        System.out.println("Ascendente: " + edadesAsc);
        
        List<Integer> edadesDesc = edades.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
        System.out.println("Descendente: " + edadesDesc);
    
    }

    public List<String> Ejercicio8(){
        List<String> codigos = List.of("P01","P02","P01","P03","P02","P04");
        List<String> codigosR = codigos.stream()
        .distinct()
        .toList();

        return codigosR;
    }

    public List<Integer> Ejercicio9(){
        List<Integer> puntajes = List.of(980, 950, 920, 910, 890, 870, 860, 840, 830, 820, 800, 790, 780, 770, 760, 750, 740, 730, 720, 710);
        List<Integer> mPuntajes= puntajes.stream()
        .limit(5)
        .toList();

        return mPuntajes;
    }

    public List<String> Ejercicio10(){
        List<String> peliculas = List.of("Avatar", "Titanic", "Interestelar", "Matrix", "Gladiador");
        List<String> mPeliculas= peliculas.stream()
        .skip(2)
        .toList();

        return mPeliculas;
    }

    public Optional<Integer> Ejercicio11(){
        List<Integer> precios = List.of(12000, 5000, 18000, 7500, 3000);
        Optional<Integer> minPrecio= precios.stream()
        .min(Comparator.naturalOrder());

        System.out.println("Precio mínimo: " + minPrecio.get());

        return minPrecio;
    }

    public Optional<Integer> Ejercicio12(){
        List<Integer> precios = List.of(1800000, 2500000, 3200000, 2100000, 4000000);
        Optional<Integer> maxPrecio= precios.stream()
        .max(Comparator.naturalOrder());

        System.out.println("Precio máximo: " + maxPrecio.get());

        return maxPrecio;
    }

    public boolean Ejercicio13(){
        List<Integer> numeros = List.of(7, 11, 13, 20, 25);
        boolean numPar= numeros.stream()
        .anyMatch(n -> n % 2 == 0);

        return numPar;
    }

    public boolean Ejercicio14(){
        List<Double> notas = List.of(4.0, 3.5, 4.2, 5.0, 3.8);
        boolean notasS= notas.stream()
        .allMatch(n -> n >= 3.0);

        return notasS;
    }

    public boolean Ejercicio15(){
        List<String> nombres = List.of("juan", "maria", "admin", "pedro", "soporte");
        boolean nombresN= nombres.stream()
        .noneMatch(n -> n.equals("root"));

        return nombresN;
    }




    public static void main(String[] args) {
        Taller1 taller = new Taller1();
        System.out.println(taller.Ejercicio1());
        taller.Ejercicio2();
        System.out.println(taller.Ejercicio3());
        System.out.println(taller.Ejercicio4());
        System.out.println(taller.Ejercicio5());
        taller.Ejercicio6();
        taller.Ejercicio7();
        System.out.println(taller.Ejercicio8());
        System.out.println(taller.Ejercicio9());
        System.out.println(taller.Ejercicio10());
        taller.Ejercicio11();
        taller.Ejercicio12();

    }
}