# 📋 Plantilla para Nueva Peregrinación

Esta carpeta contiene la plantilla y las instrucciones para crear una nueva peregrinación.

## Archivos

- [`plantilla.json`](plantilla.json) - Archivo JSON de ejemplo con todos los campos documentados

## Instrucciones Paso a Paso

### 1. Crear la estructura de carpetas

```bash
# Reemplaza "nueva_peregrinacion" con el nombre de tu peregrinación
# (minúsculas, sin acentos, sin espacios)

mkdir peregrinaciones/nueva_peregrinacion
mkdir peregrinaciones/nueva_peregrinacion/images
mkdir peregrinaciones/nueva_peregrinacion/images/general
mkdir peregrinaciones/nueva_peregrinacion/images/2026
```

### 2. Copiar la plantilla

```bash
cp peregrinaciones/_plantilla/plantilla.json peregrinaciones/nueva_peregrinacion/nueva_peregrinacion.json
```

### 3. Editar el JSON

Abre el archivo JSON y reemplaza todos los valores de ejemplo:

1. **Campos de identificación**:
   - `id`: `peregrinacion-nombre-2026`
   - `tipo`: `nombre` (sin año, minúsculas)

2. **Contenido**:
   - `titulo`, `subtitulo`, `descripcion`, `descripcion_larga`

3. **Fechas y logística**:
   - `fecha_inicio`, `fecha_fin`, `destino`, `punto_salida`, `punto_llegada`

4. **Inscripción**:
   - `precio`, `precio_detalle`, `inscripcion_abierta`, `plazas_disponibles`
   - `formulario_inscripcion` (URL de Google Forms)

5. **Multimedia**:
   - `imagen` (portada)
   - `video_youtube` (si hay vídeo)
   - `imagenes_galeria` (lista de imágenes)

6. **Programa**:
   - `programa_dias` (programa detallado día a día)

7. **Información práctica**:
   - `que_llevar` (lista de cosas)
   - `informacion_adicional`
   - `contacto_nombre`, `contacto_telefono`, `contacto_email`

8. **Histórico**:
   - `ediciones_anteriores` (si las hay)

### 4. Añadir imágenes

Sube las imágenes a las carpetas correspondientes:

- `images/general/` - Imágenes del destino (santuario, paisajes, etc.)
- `images/2026/` - Fotos de la edición actual (se añaden después)

**Importante**: Optimiza las imágenes antes de subirlas.

### 5. Registrar en el índice

Edita `peregrinaciones/index.json` y añade la nueva peregrinación:

```json
{
  "id": "nueva_peregrinacion",
  "nombre": "Peregrinación a [Destino]",
  "nombre_corto": "Destino",
  "archivo": "nueva_peregrinacion/nueva_peregrinacion.json",
  "activa": true,
  "destacada": false,
  "orden": 4,
  "icono": "🚶",
  "color": "#FF5722"
}
```

### 6. Actualizar versiones

Edita `versions.json` en el directorio raíz e incrementa la versión de peregrinaciones:

```json
{
  "peregrinaciones": "X"  // Incrementar el número
}
```

### 7. (Opcional) Crear README específico

Crea un archivo `README.md` dentro de la carpeta de la nueva peregrinación con información adicional.

## Iconos Disponibles para Actividades

| Icono | Uso |
|-------|-----|
| `directions_bus` | Transporte |
| `directions_walk` | Caminata |
| `restaurant` | Comida |
| `hotel` | Alojamiento |
| `church` | Misa/Oración |
| `groups` | Reunión |
| `celebration` | Celebración |
| `nightlight` | Noche |
| `wb_sunny` | Mañana |
| `flag` | Llegada |
| `music_note` | Música |
| `local_cafe` | Descanso |
| `photo_camera` | Fotos |
| `explore` | Tiempo libre |
| `home` | Final |

## Validación

Antes de subir, valida que:

1. ✅ El JSON es válido (usa jsonlint.com)
2. ✅ Todas las rutas de imágenes existen
3. ✅ Las URLs de vídeos funcionan
4. ✅ El formulario de inscripción está activo
5. ✅ Las fechas son correctas
6. ✅ La peregrinación está registrada en index.json

## Ejemplo de Resultado Final

```
peregrinaciones/
├── nueva_peregrinacion/
│   ├── nueva_peregrinacion.json
│   ├── README.md
│   └── images/
│       ├── general/
│       │   ├── portada.jpg
│       │   └── santuario.jpg
│       └── 2026/
│           └── (vacío hasta que se realice)
```

---

*Consulta el README principal de peregrinaciones para más información.*
