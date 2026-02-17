# Eventos (Calendario)

Archivo: `eventos.json`

## Campos de cada evento

| Campo | Descripción |
|-------|-------------|
| `id` | Identificador único (ej: "evento-fatima-2025") |
| `titulo` | Título del evento |
| `descripcion` | Descripción del evento |
| `fecha_inicio` | Fecha de inicio (YYYY-MM-DD) |
| `fecha_fin` | Fecha de fin (YYYY-MM-DD) |
| `hora_inicio` | Hora de inicio (HH:MM) |
| `hora_fin` | Hora de fin (HH:MM) |
| `ubicacion` | Lugar del evento |
| `tipo` | Tipo: peregrinacion, inscripcion, formacion, retiro, celebracion |
| `color` | Color hexadecimal para el calendario |
| `imagen` | Imagen del evento (opcional) |
| `enlace_noticia` | ID de la noticia relacionada (opcional) |
| `recordatorio` | true/false - si se debe mostrar recordatorio |

## Añadir evento

1. Añade un objeto nuevo al array `eventos`
2. Si tiene imagen, súbela a `eventos/images/`
3. Actualiza `ultima_actualizacion`

## Tipos de evento

| Tipo | Color sugerido |
|------|---------------|
| `peregrinacion` | #1565C0 (azul) |
| `inscripcion` | #D32F2F (rojo) |
| `formacion` | #7B1FA2 (morado) |
| `retiro` | #6A1B9A (morado oscuro) |
| `celebracion` | #F57C00 (naranja) |
