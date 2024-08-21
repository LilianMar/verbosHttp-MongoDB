# verbosHttp-MongoDB
# Proyecto de Gestión de Artículos

## Verbos HTTP Soportados

- **GET**: Obtener información.
- **POST**: Crear un nuevo recurso.
- **DELETE**: Eliminar un recurso.
- **PATCH**: Actualizar parcialmente un recurso.
- **PUT**: Reemplazar completamente un recurso.
- **HEAD**: Obtener los encabezados de la respuesta sin el cuerpo.

## Anotaciones en el Controlador

- **`@RestController`**: Indica que la clase es un controlador de Spring Boot que maneja solicitudes HTTP y sus respuestas son automáticamente serializadas a JSON o XML.
  
- **`@RequestMapping("item")`**: Define la ruta base para las solicitudes en este controlador. En este caso, el controlador manejará todas las solicitudes que comiencen con `/item`.

- **`@Autowired`**: Permite la inyección automática de dependencias. Es usado para inyectar automáticamente servicios o repositorios necesarios en el controlador.

## Clase `GroceryItem`

La clase `GroceryItem` es un modelo que representa un artículo de la lista de compras con los siguientes campos:

- **`id`**: Identificador único del artículo.
- **`name`**: Nombre del artículo.
- **`quantity`**: Cantidad del artículo.
- **`category`**: Categoría del artículo.

### Constructores

- **Constructor por defecto**: `GroceryItem()`
- **Constructor con parámetros**: `GroceryItem(String id, String name, int quantity, String category)`

### Métodos

- **`getId`, `setId`**: Métodos para obtener y establecer el ID del artículo.
- **`getName`, `setName`**: Métodos para obtener y establecer el nombre del artículo.
- **`getQuantity`, `setQuantity`**: Métodos para obtener y establecer la cantidad del artículo.
- **`getCategory`, `setCategory`**: Métodos para obtener y establecer la categoría del artículo.

### Método `toString`

- **Descripción**: El método `toString` sobrescribe el método `toString` de la superclase `Object` para proporcionar una representación en cadena legible del objeto `GroceryItem`.
- **Uso**: Permite imprimir una descripción detallada del artículo en forma de cadena.

```java
@Override
public String toString() {
    return "GroceryItem{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", quantity=" + quantity +
            ", category='" + category + '\'' +
            '}' + "\n";
}
