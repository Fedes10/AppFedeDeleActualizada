# Canciones

Archivo: `canciones.json`

## Campos de cada canción

| Campo | Descripción |
|-------|-------------|
| `id` | Identificador único (ej: "hakuna-huracan") |
| `titulo` | Título de la canción |
| `artista` | Artista o grupo |
| `categoria` | Categoría: La Dele, Hakuna, Adoración, Mariano, Tradicional |
| `letra` | Letra completa de la canción |
| `audio` | Ruta del archivo de audio (ej: "canciones/audio/nombre.mp3") |
| `duracion` | Duración en segundos |

## Añadir canción

1. Añade un objeto nuevo al array `canciones`
2. Sube el MP3 a `canciones/audio/`
3. Actualiza `ultima_actualizacion`

## Audio

- Formato: MP3
- Bitrate recomendado: 128-192 kbps
- Carpeta: `canciones/audio/`

## Categorías válidas

- `La Dele` - Canciones propias de la Delegación
- `Hakuna` - Canciones del grupo Hakuna
- `Adoración` - Canciones de adoración
- `Mariano` - Canciones marianas
- `Tradicional` - Canciones tradicionales católicas
