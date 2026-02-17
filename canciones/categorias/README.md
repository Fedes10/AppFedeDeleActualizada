# Categorías de Canciones

Esta carpeta contiene las categorías del cancionero, organizadas por momentos litúrgicos.

## Estructura de cada JSON

```json
{
  "id": "identificador_unico",
  "nombre": "Nombre de la Categoría",
  "orden": 1,
  "descripcion": "Descripción breve de la categoría",
  "icono": "nombre_icono_material",
  "color": "#HEX_COLOR",
  "canciones": [
    {
      "id": "cancion-001",
      "titulo": "Nombre de la Canción",
      "autor": "Autor o Compositor",
      "letra": "Letra completa de la canción...",
      "audio": "canciones/audio/nombre-cancion.mp3",
      "duracion": "3:45",
      "acordes": true
    }
  ]
}
```

## Categorías disponibles (en orden litúrgico)

1. **Entrada** - Cantos de entrada para la celebración
2. **Kyrie Eleison** - Cantos penitenciales
3. **Aleluya** - Aclamación al Evangelio
4. **Ofertorio** - Presentación de las ofrendas
5. **Santo** - Sanctus
6. **Cordero de Dios** - Agnus Dei
7. **Comunión** - Durante la comunión
8. **Virgen** - Cantos marianos
9. **Adoración** - Cantos de adoración y alabanza

## Cómo añadir canciones

1. Abre el JSON de la categoría correspondiente
2. Añade un nuevo objeto al array `canciones`
3. Asegúrate de que el `id` sea único
4. Si hay audio, colócalo en la carpeta `audio/`
