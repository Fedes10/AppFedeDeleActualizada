# Calendario

Esta carpeta contiene los eventos del calendario de la app.

## Archivos

- `calendario.json` - Todos los eventos con sus categorías

## Estructura

Los eventos están organizados por categorías:
- **Peregrinaciones**: Peregrinaciones a Guadalupe, Fátima, etc.
- **Vigilias**: Vigilias de oración
- **Fiestas**: Fiestas litúrgicas importantes
- **Formación**: Cursos y encuentros formativos
- **Retiros**: Retiros espirituales
- **Encuentros**: Encuentros de jóvenes

## Añadir nuevos eventos

Para añadir un nuevo evento, edita el archivo `calendario.json` y añade un nuevo objeto al array `eventos` con la siguiente estructura:

```json
{
  "id": "identificador-unico",
  "titulo": "Nombre del evento",
  "fecha": "YYYY-MM-DD",
  "hora": "HH:MM o 'Todo el día'",
  "ubicacion": "Lugar del evento",
  "categoria": "id-de-categoria",
  "color": "#HEXCOLOR",
  "descripcion": "Descripción del evento",
  "peregrinacion_id": "opcional - si está vinculado a una peregrinación"
}
```

## Categorías disponibles

- `peregrinacion` - Verde (#4CAF50)
- `vigilia` - Púrpura (#9C27B0)
- `fiesta` - Rosa (#E91E63)
- `formacion` - Naranja (#FF9800)
- `retiro` - Marrón (#795548)
- `encuentro` - Azul (#2196F3)
