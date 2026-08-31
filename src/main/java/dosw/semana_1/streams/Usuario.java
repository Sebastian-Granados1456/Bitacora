package dosw.semana_1.streams;

/**
 * Usuario simple usado en los ejercicios 3 y 4: guarda id, nombre, edad y
 * si la cuenta está activa. Es un record porque no necesita lógica propia.
 */
public record Usuario(int id, String name, int age, boolean active) {
}
