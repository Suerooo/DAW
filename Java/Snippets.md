## Validación

### validation.string.required.assign

- Prefix: `jv-str-req`

- Descripción: Valida un String obligatorio y asigna una versión normalizada con trim()

- Caso de uso: Constructores, setters o mappers donde necesites normalizar texto de entrada y proteger invariantes.

```java
if (${1:value} == null || ${1}.isBlank()) {
    throw new IllegalArgumentException("${2:campo} no puede ser nulo ni vacío");
}
this.${3:fieldName} = ${1}.trim();
```

### validation.number.nonnegative.assign

- Prefix: `jv-num-nonneg`

- Descripción: Valida que un número no sea negativo y lo asigna

- Caso de uso: Campos numéricos de dominio como cantidades, stock, edad, límites o importes no negativos.

```java
if (${1:value} < 0) {
    throw new IllegalArgumentException("${2:campo} no puede ser negativo. Valor recibido: " + ${1:value});
}
this.${3:fieldName} = ${1:value};
```

### validation.object.require-non-null.assign

- Prefix: `jv-obj-nn`

- Descripción: Asigna un valor obligatorio usando Objects.requireNonNull

- Caso de uso: Asignación de dependencias o campos obligatorios con mensaje claro de fallo.

```java
this.${2:fieldName} = Objects.requireNonNull(${1:value}, "${3:campo} no puede ser null");
```

### validation.collection.not-empty.copy

- Prefix: `jv-col-req`

- Descripción: Valida una colección obligatoria y guarda una copia inmutable

- Caso de uso: DTOs y agregados que deben encapsular una colección no vacía sin exponer mutabilidad externa.

```java
if (${1:items} == null || ${1:items}.isEmpty()) {
    throw new IllegalArgumentException("${2:campo} no puede ser null ni vacío");
}
this.${3:fieldName} = List.copyOf(${1:items});
```

### validation.state.require

- Prefix: `jv-state-req`

- Descripción: Protege invariantes o precondiciones de estado

- Caso de uso: Métodos que solo pueden ejecutarse en ciertos estados internos.

```java
if (!${1:condition}) {
    throw new IllegalStateException("${2:Estado inválido}");
}
```

## Flujo de control

### flow.switch.expression.return

- Prefix: `jv-switch-ret`

- Descripción: Switch expression moderna con retorno y default defensivo

- Caso de uso: Conversión de enums, mapping de códigos, selección de estrategia o cálculo de valores.

```java
return switch (${1:value}) {
    case ${2:CONSTANT_A} -> ${3:resultA};
    case ${4:CONSTANT_B} -> ${5:resultB};
    default -> throw new IllegalArgumentException("Valor no soportado: " + ${1:value});
};
```

### flow.switch.statement

- Prefix: `jv-switch`

- Descripción: Switch moderna con arrow labels y default explícito

- Caso de uso: Ramas con efectos laterales o lógica más larga por caso.

```java
switch (${1:value}) {
    case ${2:CONSTANT_A} -> {
        ${3:// lógica}
    }
    case ${4:CONSTANT_B} -> {
        ${5:// lógica}
    }
    default -> throw new IllegalArgumentException("Valor no soportado: " + ${1:value});
}
```

## Excepciones

### exception.try-with-resources.wrap

- Prefix: `jv-try-res`

- Descripción: Try-with-resources con wrapping a excepción unchecked

- Caso de uso: I/O, lectura de archivos, streams o recursos cerrables donde quieras elevar una excepción unchecked.

```java
try (${1:var resource} = ${2:openResource()}) {
    ${3:// uso del recurso}
} catch (${4:IOException e}) {
    throw new UncheckedIOException("${5:Error procesando recurso}", e);
}
```

### exception.wrap.with-context

- Prefix: `jv-ex-wrap`

- Descripción: Envuelve una excepción agregando contexto útil

- Caso de uso: Capas de servicio o integración donde el contexto del error importa más que la excepción original sola.

```java
try {
    ${1:// operación}
} catch (${2:Exception e}) {
    throw new ${3:IllegalStateException}("${4:Error en ${5:operación}}", e);
}
```

### exception.custom.business

- Prefix: `jv-ex-business`

- Descripción: Excepción de dominio o negocio reutilizable

- Caso de uso: Errores funcionales del dominio que no deben mezclarse con IllegalArgumentException o SQLException.

```java
public class ${1:BusinessException} extends RuntimeException {
    public ${1:BusinessException}(String message) {
        super(message);
    }

    public ${1:BusinessException}(String message, Throwable cause) {
        super(message, cause);
    }
}
```

### exception.custom.data-access

- Prefix: `jv-ex-data`

- Descripción: Excepción de acceso a datos para desacoplar SQLException del dominio

- Caso de uso: Repositorios JDBC cuando quieres encapsular detalles de infraestructura.

```java
public class ${1:DataAccessException} extends RuntimeException {
    public ${1:DataAccessException}(String message) {
        super(message);
    }

    public ${1:DataAccessException}(String message, Throwable cause) {
        super(message, cause);
    }
}
```

## Logging

### logging.jul.logger-field

- Prefix: `jv-log-jul`

- Descripción: Declara un logger java.util.logging por clase

- Caso de uso: Proyectos solo JDK o librerías sin dependencia de logging adicional.

```java
private static final Logger LOG = Logger.getLogger(${1:MyClass}.class.getName());
```

### logging.jul.catch-log-rethrow

- Prefix: `jv-log-catch`

- Descripción: Loggea la excepción con contexto y la relanza

- Caso de uso: Puntos de borde donde necesitas dejar trazabilidad antes de propagar el error.

```java
catch (${1:Exception e}) {
    LOG.log(Level.${2:SEVERE}, "${3:Error procesando operación}", e);
    throw e;
}
```

### logging.slf4j.logger-field.optional

- Prefix: `jv-log-slf4j`

- Descripción: Declara un logger SLF4J (requiere dependencia externa)

- Caso de uso: Backend con SLF4J/Logback o Spring Boot. Requiere dependencia externa.

```java
private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(${1:MyClass}.class);
```

## Colecciones y streams

### collections.map.compute-if-absent-list

- Prefix: `jv-map-list`

- Descripción: Agrupa elementos en un Map<K, List<V>> sin código repetido

- Caso de uso: Agrupación incremental sin if/else ni código repetido.

```java
${1:map}.computeIfAbsent(${2:key}, ignored -> new ArrayList<>()).add(${3:value});
```

### collections.map.merge-counter

- Prefix: `jv-map-merge`

- Descripción: Cuenta ocurrencias en un Map<K, Long> usando merge

- Caso de uso: Conteos y agregaciones simples por clave.

```java
${1:counts}.merge(${2:key}, 1L, Long::sum);
```

### collections.stream.to-map.merge

- Prefix: `jv-stream-tomap`

- Descripción: Convierte un stream a Map con política explícita ante claves duplicadas

- Caso de uso: Transformación a Map cuando puede haber claves duplicadas y necesitas política explícita.

```java
Map<${1:K}, ${2:V}> ${3:result} = ${4:items}.stream()
    .collect(Collectors.toMap(
        ${5:item -> item.key()},
        ${6:Function.identity()},
        ${7:(left, right) -> left},
        LinkedHashMap::new
    ));
```

### collections.immutable.copy-list

- Prefix: `jv-list-copy`

- Descripción: Crea una copia inmutable de una lista

- Caso de uso: Defensive copy al recibir listas desde fuera del objeto.

```java
List<${1:Type}> ${2:safeCopy} = List.copyOf(${3:source});
```

## Estructuras comunes

### structure.record.dto

- Prefix: `jv-record-dto`

- Descripción: Plantilla de record para DTOs o respuestas inmutables

- Caso de uso: DTOs, respuestas REST, mensajes de integración y resultados inmutables.

```java
public record ${1:UserResponse}(
    ${2:Long id},
    ${3:String name},
    ${4:String email}
) {}
```

### structure.enum.code-lookup

- Prefix: `jv-enum-code`

- Descripción: Enum con lookup por código para integrar APIs, BD o mensajería

- Caso de uso: Normalización de códigos externos de BD, colas o APIs.

```java
public enum ${1:Status} {
    ${2:ACTIVE}("${3:A}"),
    ${4:INACTIVE}("${5:I}");

    private static final Map<String, ${1:Status}> BY_CODE = Arrays.stream(values())
        .collect(Collectors.toUnmodifiableMap(${1:Status}::code, Function.identity()));

    private final String code;

    ${1:Status}(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

    public static ${1:Status} fromCode(String code) {
        var value = BY_CODE.get(code);
        if (value == null) {
            throw new IllegalArgumentException("Código no soportado: " + code);
        }
        return value;
    }
}
```

## Concurrencia básica

### concurrency.executor.fixed-thread-pool

- Prefix: `jv-executor-fixed`

- Descripción: Executor fijo con nombres de hilo legibles

- Caso de uso: Procesamiento paralelo controlado con nombres de hilo observables.

```java
AtomicInteger ${1:threadCounter} = new AtomicInteger();
ExecutorService ${2:executor} = Executors.newFixedThreadPool(
    ${3:4},
    runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("${4:worker}-" + ${1:threadCounter}.incrementAndGet());
        thread.setDaemon(false);
        return thread;
    }
);
```

### concurrency.completable-future.supply-async

- Prefix: `jv-cf-supply`

- Descripción: CompletableFuture con timeout y logging de errores

- Caso de uso: Invocaciones asíncronas con timeout y observabilidad mínima.

```java
CompletableFuture<${1:Result}> ${2:future} = CompletableFuture
    .supplyAsync(() -> ${3:service.load()}, ${4:executor})
    .orTimeout(${5:2}, TimeUnit.${6:SECONDS})
    .whenComplete((${7:result}, ${8:error}) -> {
        if (${8:error} != null) {
            ${9:LOG}.log(Level.${10:WARNING}, "${11:Error en tarea asíncrona}", ${8:error});
        }
    });
```

### concurrency.concurrent-hash-map.counter

- Prefix: `jv-chm-count`

- Descripción: Contador concurrente eficiente con ConcurrentHashMap y LongAdder

- Caso de uso: Métricas, conteos concurrentes o acumulación thread-safe.

```java
ConcurrentHashMap<${1:String}, LongAdder> ${2:counts} = new ConcurrentHashMap<>();
${2:counts}.computeIfAbsent(${3:key}, ignored -> new LongAdder()).increment();
```

## Acceso a datos

### data.jdbc.query-single-row

- Prefix: `jv-jdbc-one`

- Descripción: Consulta JDBC tipificada para obtener una sola fila con PreparedStatement

- Caso de uso: Repositorios JDBC simples sin ORM para consultas por id o clave única.

```java
String sql = """
    SELECT ${1:id}, ${2:name}
    FROM ${3:users}
    WHERE ${4:id} = ?
    """;

try (Connection connection = ${5:dataSource}.getConnection();
     PreparedStatement statement = connection.prepareStatement(sql)) {
    statement.setLong(1, ${6:id});
    try (ResultSet rs = statement.executeQuery()) {
        if (!rs.next()) {
            return Optional.empty();
        }
        return Optional.of(new ${7:UserDto}(
            rs.getLong("${1:id}"),
            rs.getString("${2:name}")
        ));
    }
} catch (SQLException e) {
    throw new DataAccessException("${8:Error consultando ${7:UserDto}}", e);
}
```

### data.jdbc.transaction-template

- Prefix: `jv-jdbc-tx`

- Descripción: Plantilla de transacción JDBC con commit y rollback explícitos

- Caso de uso: Bloques de escritura con varias sentencias que deben confirmar o revertir juntas.

```java
try (Connection connection = ${1:dataSource}.getConnection()) {
    connection.setAutoCommit(false);
    try {
        ${2:// operaciones JDBC}
        connection.commit();
    } catch (Exception e) {
        connection.rollback();
        throw e;
    }
} catch (SQLException e) {
    throw new DataAccessException("${3:Error ejecutando transacción}", e);
}
```

## Consola y utilidades puntuales

### console.scanner.read-int.line-safe

- Prefix: `jv-scan-int`

- Descripción: Lectura de entero desde una línea completa evitando problemas de nextInt()

- Caso de uso: Utilidades CLI o ejercicios. No es prioritario para backend.

```java
System.out.print("${1:Introduce un número}: ");
int ${2:numero} = Integer.parseInt(${3:scanner}.nextLine().trim());
```
