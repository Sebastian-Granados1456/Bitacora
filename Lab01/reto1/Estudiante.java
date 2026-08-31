/**
 * Representa a un integrante de la pareja: guarda solo los datos que se
 * necesitan para construir el saludo (nombre, edad, correo y semestre).
 * Es un "record" porque no necesita lógica propia, solo almacenar datos.
 */
public record Estudiante(String nombre, int edad, String correo, int semestre) {
}
