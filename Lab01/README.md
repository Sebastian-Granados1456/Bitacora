# Lab01 — Hackathon Express (DOSW)

Solución individual de los 7 retos del laboratorio, en Java puro (sin
Maven), organizados en un paquete `retoN/` por reto tal como pide el
enunciado. Cada carpeta se compila de forma independiente:

```bash
cd Lab01/retoN
javac *.java
java Main
```

> Nota de entrega: agrega aquí tu captura de ejecución de cada reto antes
> de subir la evidencia al profesor, junto con el commit `"Reto#N culminado"`
> que pide el enunciado.

---

## Reto 1 — La Bienvenida (`reto1/`)
**Tema:** `stream · map · collect`

El estudiante se modela con el record `Estudiante` (nombre, edad, correo,
semestre). `MensajeBienvenida.generar()` recorre la lista con
`stream().map()` para convertir el estudiante en un fragmento de texto,
y `collect(Collectors.joining(" y "))` para unir los fragmentos en el
mensaje final — sin bucles explícitos.

## Reto 2 — Carrera en Paralelo (`reto2/`)
**Tema:** `lambda · merge conflict`

`CarreraUtils` resuelve por separado el mínimo, el máximo y las
verificaciones de múltiplo/paridad, todas con expresiones lambda pasadas a
`stream().min()/max()`. `combinar()` unifica todo en un único `Resultados`
(record) con mayor, menor, cantidad y los tres flags booleanos pedidos por
el enunciado.

## Reto 3 — La Máquina de los Códigos Secretos (`reto3/`)
**Tema:** `StringBuilder · StringBuffer · stream`

`CanalA` amplifica el mensaje (lo repite 3 veces) usando `StringBuilder`
recorrido con `IntStream.range().forEach()`. `CanalB` lo invierte con
`StringBuffer.reverse()`. `Descifrador` combina las dos técnicas en una
única `Function<String,String>` (expresión lambda) que primero amplifica y
luego invierte, y expone `descifrarTodos()` usando `stream().map()` para
procesar varios mensajes a la vez.

## Reto 4 — El Tesoro de las Llaves Duplicadas (`reto4/`)
**Tema:** `HashMap · Hashtable · Collectors.toMap`

El `HashMap` conserva el primer valor ante claves repetidas usando
`putIfAbsent()`. El `Hashtable` inserta directamente (estructura
sincronizada). Los dos mapas se combinan con `Collectors.toMap()`, cuya
función de merge `(valorA, valorB) -> valorB` prioriza siempre el valor del
Hashtable en caso de conflicto. El resultado se imprime en mayúsculas y
ordenado ascendentemente con `stream().map().sorted()`.

## Reto 5 — Batalla de Conjuntos (`reto5/`)
**Tema:** `HashSet · TreeSet · stream().filter`

El `HashSet` se filtra con una lambda para eliminar múltiplos de 3; el
`TreeSet`, para eliminar múltiplos de 5 — ambos con `stream().filter()`.
Los sobrevivientes de las dos estructuras se combinan en un `TreeSet` final
(sin duplicados y ordenado) y se imprimen con `forEach()`.

## Reto 6 — La Máquina de Decisiones (`reto6/`)
**Tema:** `switch-case · Map<String,Runnable> · lambda`

Los 8 comandos (SALUDAR/DESPEDIR/CANTAR/DANZAR/BROMEAR/GRITAR/SUSURRAR/
ANALIZAR) se resuelven con `switch-case` en dos grupos, y luego se
registran como lambdas `() -> accion()` dentro de un único
`Map<String, Runnable>`. `ejecutarComando()` invoca la acción con
`.run()`, y `ejecutarTodos()` recorre el mapa completo con
`forEach((cmd, accion) -> accion.run())`.

## Reto 7 — El Juego del Calamar (`reto7/`)
**Tema:** `stream · filter · lambda · POO`

La clase `Jugador` guarda número, nombre, deuda, premio y estado. Las 3
pruebas viven en `JuegoCalamar`, cada una usando únicamente
`stream().filter()` para decidir quién avanza (deuda ≤ 170M, dado par,
nombre con 5+ caracteres). Cada eliminado en pruebas 1 y 2 aporta 50M al
premio acumulado, y 100M si es eliminado en la prueba 3;
`declararGanadores()` reparte el premio inicial (150.000.000.000) más lo
acumulado entre los finalistas. Con los datos de ejemplo del enunciado el
único finalista es el jugador 456 (Gi-hun), con premio final de
150.200.000.000 wones — coincide con la salida esperada del taller.

---

## Cuestionario teórico (Parte 4)

Pendiente de completar antes de la entrega final: responder aquí las 12
preguntas de Git/HashMap/streams que pide el enunciado del laboratorio.
