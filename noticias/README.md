# Noticias

Archivo: `noticias.json`

## Campos de cada noticia

| Campo | Descripción |
|-------|-------------|
| `id` | Identificador único (ej: "noticia-fatima-2025") |
| `titulo` | Título de la noticia |
| `descripcion` | Resumen corto (1-2 líneas) |
| `contenido` | Texto completo con formato Markdown |
| `imagen` | Ruta de imagen (ej: "noticias/images/foto.jpg") |
| `categoria` | Categoría: Peregrinaciones, Vigilias, Formación, Eventos, Información |
| `fecha` | Fecha publicación (YYYY-MM-DD) |
| `autor` | Autor de la noticia |

## Añadir noticia

1. Añade un objeto nuevo al array `noticias`
2. Sube imagen a `noticias/images/`
3. Actualiza `ultima_actualizacion`

## Imágenes

- Formato: JPG o PNG
- Tamaño recomendado: 1200x630px (ratio 1.91:1)
- Carpeta: `noticias/images/`
