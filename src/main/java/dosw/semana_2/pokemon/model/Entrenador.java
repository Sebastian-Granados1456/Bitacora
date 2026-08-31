package dosw.semana_2.pokemon.model;

import java.util.List;

/**
 * Modelo de un Entrenador usado desde el Nivel 4 en adelante. Clase de
 * datos pura (SRP): guarda id, nombre, medallas y su equipo de Pokémon.
 */
public class Entrenador {
    private Long id;
    private String nombre;
    private int medallas;
    private List<Pokemon> equipo;

    public Entrenador(Long id, String nombre, int medallas, List<Pokemon> equipo) {
        this.id = id;
        this.nombre = nombre;
        this.medallas = medallas;
        this.equipo = equipo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getMedallas() { return medallas; }
    public void setMedallas(int medallas) { this.medallas = medallas; }

    public List<Pokemon> getEquipo() { return equipo; }
    public void setEquipo(List<Pokemon> equipo) { this.equipo = equipo; }

    @Override
    public String toString() {
        return nombre + "(" + medallas + " medallas)";
    }
}
