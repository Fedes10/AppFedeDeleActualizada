# Oraciones

Esta carpeta contiene el librito de oraciones de la app.

## Archivos

- `oraciones.json` - Todas las oraciones con sus categorías

## Estructura

Las oraciones están organizadas por categorías:
- **Mañaneras**: Oraciones para empezar el día
- **Nocturnas**: Oraciones para terminar el día
- **Marianas**: Oraciones a la Virgen María
- **Eucarísticas**: Oraciones ante el Santísimo
- **Penitenciales**: Oraciones de perdón
- **Vocacionales**: Oraciones por las vocaciones

## Añadir nuevas oraciones

Para añadir una nueva oración, edita el archivo `oraciones.json` y añade un nuevo objeto al array `oraciones` con la siguiente estructura:

```json
{
  "id": "identificador-unico",
  "titulo": "Nombre de la oración",
  "categoria": "id-de-categoria",
  "contenido": "Texto de la oración...",
  "autor": "Autor o fuente",
  "duracion": "X min",
  "favorito": false
}
```
