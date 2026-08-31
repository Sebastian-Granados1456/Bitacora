public class Estudiante{
    private String nombre;
    private double promedio;

    public Estudiante(String nombre, double promedio){
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public String toString() {
        return nombre + "(" + promedio + ")";
    }

}