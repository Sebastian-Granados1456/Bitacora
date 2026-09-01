# Bitácora — DOSW

Repositorio personal de la asignatura DOSW (Java + Streams + Expresiones
Lambda + Git/GitHub + Patrones de diseño + Planeación ágil). Entrega del
Corte #1: contiene exclusivamente el desarrollo de los talleres pedidos:

- **Taller #2 — Bitácora Pokémon**: proyecto Maven en `src/main/java/dosw/semana_1` y `semana_2` (ver detalle completo más abajo en este mismo README).
- **Taller #4 — Patrones de Diseño Combinados**: `src/main/java/dosw/taller4_patrones/` (10 ejercicios, cada uno combina 2 patrones) — ver [`Talleres/TALLER_DOSW_4_explicacion.txt`](Talleres/TALLER_DOSW_4_explicacion.txt).
- **Taller #6 — Planeación Ágil TechCup**: proyecto Jira "TechCup DOSW" (clave `TCH`) con épica, 17 features, sprints configurados y capturas en [`Talleres/capturas_taller6/`](Talleres/capturas_taller6/).

```bash
mvn compile                                    
java -cp target/classes dosw.semana_1.streams.EjercicioN
java -cp target/classes dosw.semana_2.pokemon.EjercicioNN
java -cp target/classes dosw.taller4_patrones.ejercicioNN_tema.Main
```

> Nota técnica: el enunciado pide la ruta `src/main/dosw/...`, pero la
> convención estándar de Maven exige que el código fuente Java viva bajo
> `src/main/java/...`. Se usó `src/main/java/dosw/semana_1/...` y
> `src/main/java/dosw/semana_2/...` para que el proyecto compile con
> `mvn compile` sin romper la convención — el paquete raíz sigue siendo
> `dosw` tal como pide el taller.

---

# SEMANA No 1 — DOSW Manejo de Streams

> Los 5 ejercicios de esta semana vienen de la diapositiva **"DOSW 1 - S02.pptx"** (sección "Ejercicios de Repaso", diapositivas 2-6), tal como pide la Tarea #1 de esa misma presentación.

---

### Ejercicio 01 — Números Pares mayores a diez
Dada una lista de números enteros, obtener una nueva lista solo con los
números pares mayores a 10.

**Código implementado:** [`src/main/java/dosw/semana_1/streams/Ejercicio1.java`](src/main/java/dosw/semana_1/streams/Ejercicio1.java)

**Explicación:** se usa `filter()` con una lambda que combina las dos
condiciones (par y mayor a 10) y `collect()` para construir la lista
resultado, sin bucles explícitos.

### Ejercicio 02 — Cantidad de Palabras con más de 4 caracteres
Filtrar palabras de más de 4 caracteres, convertirlas a mayúsculas,
ordenarlas alfabéticamente y contar cuántas quedan.

**Código implementado:** [`src/main/java/dosw/semana_1/streams/Ejercicio2.java`](src/main/java/dosw/semana_1/streams/Ejercicio2.java)

**Explicación:** `filter()` descarta las palabras cortas, `map()` las
transforma a mayúsculas y `sorted()` las ordena; `count()` sobre el mismo
filtro da la cantidad final de palabras resultantes.

### Ejercicio 03 — Obtener nombres de los Usuarios
Filtrar solo los usuarios activos, obtener sus nombres en mayúscula y
ordenarlos alfabéticamente.

**Código implementado:** [`src/main/java/dosw/semana_1/streams/Ejercicio3.java`](src/main/java/dosw/semana_1/streams/Ejercicio3.java) (usa [`Usuario.java`](src/main/java/dosw/semana_1/streams/Usuario.java))

**Explicación:** `filter(Usuario::active)` se queda con los activos,
`map()` extrae el nombre en mayúscula y `sorted()` ordena el resultado.

### Ejercicio 04 — Personas mayores de edad
Con los mismos atributos de Usuario, filtrar los mayores de edad y
obtener sus nombres.

**Código implementado:** [`src/main/java/dosw/semana_1/streams/Ejercicio4.java`](src/main/java/dosw/semana_1/streams/Ejercicio4.java)

**Explicación:** `filter()` con la condición `age >= 18` y `map()` para
quedarse solo con el nombre de cada usuario que cumple.

### Ejercicio 05 — Transacciones Bancarias
Procesar una lista de transacciones usando `peek()` para verlas y
`anyMatch()` para saber si existe al menos una no aprobada.

**Código implementado:** [`src/main/java/dosw/semana_1/streams/Ejercicio5.java`](src/main/java/dosw/semana_1/streams/Ejercicio5.java) (usa [`Transaction.java`](src/main/java/dosw/semana_1/streams/Transaction.java))

**Explicación:** `peek()` imprime cada transacción a medida que el stream
la procesa, y `anyMatch()` evalúa si alguna tiene `approved == false`; el
lote es válido solo si ninguna transacción falla esa condición.

---

# SEMANA No 2 — Bitácora Pokémon

---

## Nivel 1 — Entrenador Novato (operaciones básicas con Streams)

### Ejercicio 01 — Pokémon Tipo Fuego
Obtener únicamente los Pokémon cuyo tipo sea Fuego.
**Código:** [`Ejercicio01.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio01.java) · **Explicación:** `filter()` compara el tipo de cada Pokémon contra `"Fuego"`.

### Ejercicio 02 — Pokédex Gritona
Transformar todos los nombres a mayúsculas.
**Código:** [`Ejercicio02.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio02.java) · **Explicación:** `map(String::toUpperCase)` (method reference) sobre cada nombre.

### Ejercicio 03 — Poder Total del Equipo
Sumar los niveles de todo el equipo.
**Código:** [`Ejercicio03.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio03.java) · **Explicación:** `reduce(0, (a,b) -> a+b)` acumula la suma total.

### Ejercicio 04 — Pokémon Alfa
Encontrar el Pokémon con el nivel más alto.
**Código:** [`Ejercicio04.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio04.java) · **Explicación:** `max(Comparator.comparingInt(...))` sobre el nivel.

### Ejercicio 05 — Pokémon Legendarios
Contar cuántos Pokémon tienen nivel superior a 80.
**Código:** [`Ejercicio05.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio05.java) · **Explicación:** `filter()` + tamaño de la lista resultante (equivalente a `count()`).

## Nivel 2 — Entrenador Intermedio (filtrado y ordenamiento avanzado)

### Ejercicio 06 — Pokédex Sin Duplicados
Eliminar Pokémon repetidos.
**Código:** [`Ejercicio06.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio06.java) · **Explicación:** `distinct()` elimina duplicados manteniendo el orden de aparición.

### Ejercicio 07 — Orden del Profesor Oak
Ordenar alfabéticamente los nombres.
**Código:** [`Ejercicio07.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio07.java) · **Explicación:** `sorted()` usa el orden natural de `String`.

### Ejercicio 08 — Evoluciones Preparadas
Obtener los Pokémon listos para evolucionar.
**Código:** [`Ejercicio08.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio08.java) · **Explicación:** `filter(PokemonSimple::puedeEvolucionar)` con method reference sobre el booleano.

> A partir de aquí se usa la clase [`model/Pokemon.java`](src/main/java/dosw/semana_2/pokemon/model/Pokemon.java) (id, nombre, tipo, nivel, poderCombate, region, legendario), tal como pide el taller desde el Nivel 3.

## Nivel 3 — Líder de Gimnasio (manipulación de objetos complejos)

### Ejercicio 09 — Equipo Élite
Pokémon con `poderCombate` mayor a 500.
**Código:** [`Ejercicio09.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio09.java) · **Explicación:** `filter()` sobre `poderCombate` + `sorted()` descendente.

### Ejercicio 10 — Pokédex Compacta
Lista de solo los nombres del equipo.
**Código:** [`Ejercicio10.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio10.java) · **Explicación:** `map(Pokemon::getNombre)` + `toList()`.

### Ejercicio 11 — Poder Promedio
Promedio de `poderCombate` del equipo.
**Código:** [`Ejercicio11.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio11.java) · **Explicación:** `mapToDouble()` + `average()`.

### Ejercicio 12 — Campeón Regional
Pokémon con mayor `poderCombate` de la lista.
**Código:** [`Ejercicio12.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio12.java) · **Explicación:** `max(Comparator.comparingDouble(...))`.

### Ejercicio 13 — Organizar por Tipo
Agrupar los Pokémon por tipo.
**Código:** [`Ejercicio13.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio13.java) · **Explicación:** `Collectors.groupingBy(Pokemon::getTipo, ...)`.

### Ejercicio 14 — Organizar por Región
Agrupar los Pokémon por región.
**Código:** [`Ejercicio14.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio14.java) · **Explicación:** mismo patrón que el ejercicio 13, agrupando por región.

> A partir de aquí se usa también la clase [`model/Entrenador.java`](src/main/java/dosw/semana_2/pokemon/model/Entrenador.java) (id, nombre, medallas, equipo), tal como pide el taller desde el Nivel 4.

## Nivel 4 — Alto Mando (objetos anidados y comparaciones)

### Ejercicio 15 — Maestro de Gimnasios
Entrenador con más medallas.
**Código:** [`Ejercicio15.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio15.java) · **Explicación:** `max(Comparator.comparingInt(...))` sobre medallas.

### Ejercicio 16 — Entrenadores Experimentados
Entrenadores con más de 5 medallas.
**Código:** [`Ejercicio16.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio16.java) · **Explicación:** `filter()` + `map()` + `Collectors.joining()` para el formato de salida.

### Ejercicio 17 — Equipo Más Poderoso
Entrenador con la suma de `poderCombate` más alta.
**Código:** [`Ejercicio17.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio17.java) · **Explicación:** `mapToDouble().sum()` por entrenador + `max()` con `Comparator` personalizado.

## Nivel 5 — Campeón de la Liga Pokémon DOSW (análisis avanzado y rankings)

### Ejercicio 18 — Top 5 Pokémon Más Fuertes
Ranking de los 5 Pokémon con mayor `poderCombate`.
**Código:** [`Ejercicio18.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio18.java) · **Explicación:** `sorted(Comparator...reversed())` + `limit(5)`.

### Ejercicio 19 — Top 3 Entrenadores
Ranking con criterios de desempate encadenados (medallas, poder, alfabético).
**Código:** [`Ejercicio19.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio19.java) · **Explicación:** `Comparator.comparingInt(...).reversed().thenComparing(...)` encadenado tres veces.

### Ejercicio 20 — Pokédex Analítica
Resumen completo: por tipo, por región, legendarios, promedio de nivel y el más fuerte.
**Código:** [`Ejercicio20.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio20.java) · **Explicación:** combina `groupingBy()+counting()`, `filter()+count()`, `mapToInt()+average()` y `max()` en un mismo ejercicio.

---

## Retos Especiales

**Reto Legendario — Method References:** se usan en más de 5
ejercicios (`Ejercicio02` con `String::toUpperCase`, `Ejercicio08` con
`PokemonSimple::puedeEvolucionar`, `Ejercicio10` con `Pokemon::getNombre`,
`Ejercicio12` con `Pokemon::getPoderCombate`, `Ejercicio15` con
`EntrenadorSimple::medallas`, `Ejercicio20` con `Pokemon::isLegendario`,
entre otros) en lugar de lambdas explícitas.

**Reto Shiny — Buenas prácticas de commits:** el desarrollo se hizo
en tandas pequeñas, cada una cerrada con un commit descriptivo
(`feat:`/`refactor:`/`docs:`) — ver historial de `git log`.

---

## Estrategia de Ramas (Git Flow)

Este repositorio mantiene `main` y `develop` como ramas principales. El
trabajo de cada semana se hace en `feature/semana-n-dosw`, y cada
ejercicio en `feature/semana-n-dosw-ejercicio-n`, mezclando hacia la rama
de la semana al terminar y hacia `develop` mediante Pull Request al cerrar
toda la semana. Las ramas semanales no se eliminan tras el merge — quedan
como evidencia del proceso.

## Reglas del Torneo

- Prohibido usar bucles tradicionales (`for`, `while`, `do-while`) para
  resolver los ejercicios, ordenar manualmente o recorrer colecciones de
  forma imperativa.
- Obligatorio usar únicamente Streams y Lambdas, documentar cada
  ejercicio en este README y subir evidencia de ejecución por reto.
