/**
 * Participante del Juego del Calamar. El estado se actualiza a medida que
 * el jugador es eliminado o se convierte en ganador tras las 3 pruebas.
 */
public class Jugador {
    private final int numero;
    private final String nombre;
    private final long deuda;
    private long premio;
    private String estado; // ACTIVO / ELIMINADO / GANADOR

    public Jugador(int numero, String nombre, long deuda) {
        this.numero = numero;
        this.nombre = nombre;
        this.deuda = deuda;
        this.premio = 0;
        this.estado = "ACTIVO";
    }

    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }

    // Devuelve solo el primer nombre (sin apellido), que es el criterio real
    // que usa la Prueba 3 del Puente de Cristal para medir longitud (>=5).
    public String getPrimerNombre() { return nombre.split(" ")[0]; }
    public long getDeuda() { return deuda; }
    public long getPremio() { return premio; }
    public String getEstado() { return estado; }

    // Suma dinero al premio acumulado del jugador (se usa cuando otro
    // jugador es eliminado y su parte se reparte entre los que quedan).
    public void agregarPremio(long monto) { this.premio += monto; }

    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return numero + " - " + nombre;
    }
}
