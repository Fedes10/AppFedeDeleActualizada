# 🚶 Peregrinaciones - Delegación Diocesana de Juventud de Córdoba

## Índice de Contenidos

1. [Introducción](#introducción)
2. [Estructura de Carpetas](#estructura-de-carpetas)
3. [Descripción de Archivos](#descripción-de-archivos)
4. [Peregrinaciones Disponibles](#peregrinaciones-disponibles)
5. [Cómo Añadir una Nueva Peregrinación](#cómo-añadir-una-nueva-peregrinación)
6. [Plantilla de JSON](#plantilla-de-json)
7. [Gestión de Imágenes](#gestión-de-imágenes)
8. [Campos del JSON Explicados](#campos-del-json-explicados)
9. [Buenas Prácticas](#buenas-prácticas)
10. [Ejemplos](#ejemplos)

---

## Introducción

Este directorio contiene toda la información sobre las peregrinaciones organizadas por la Delegación Diocesana de Juventud de Córdoba. Cada peregrinación tiene su propia carpeta con su archivo de datos JSON, imágenes organizadas por año, y documentación específica.

Las peregrinaciones son uno de los pilares fundamentales de la Delegación, ofreciendo a los jóvenes la oportunidad de vivir experiencias de fe, comunidad y crecimiento personal a través de caminos hacia santuarios marianos y otros lugares de significado espiritual.

### Peregrinaciones Principales

La Delegación organiza tradicionalmente tres grandes peregrinaciones anuales:

1. **Peregrinación a Fátima (Portugal)** - La más emblemática, con décadas de historia
2. **Peregrinación a Guadalupe (Cáceres)** - Conectando con la tradición extremeña
3. **Peregrinación a la Inmaculada (Córdoba)** - Celebración local de la patrona

---

## Estructura de Carpetas

```
peregrinaciones/
│
├── README.md                     # Este archivo - Documentación principal
├── index.json                    # Índice con metadatos de todas las peregrinaciones
│
├── fatima/                       # Peregrinación a Fátima
│   ├── fatima.json               # Datos completos de la peregrinación
│   ├── README.md                 # Información específica sobre Fátima
│   └── images/                   # Imágenes organizadas
│       ├── 2026/                 # Imágenes de la edición 2026
│       ├── 2025/                 # Imágenes de ediciones anteriores
│       ├── 2024/                 # ...
│       └── general/              # Imágenes del santuario, recorrido, etc.
│
├── guadalupe/                    # Peregrinación a Guadalupe
│   ├── guadalupe.json
│   ├── README.md
│   └── images/
│       ├── 2026/
│       └── general/
│
├── inmaculada/                   # Peregrinación a la Inmaculada
│   ├── inmaculada.json
│   ├── README.md
│   └── images/
│       ├── 2026/
│       └── general/
│
└── _plantilla/                   # Plantilla para nuevas peregrinaciones
    ├── plantilla.json            # JSON de ejemplo con todos los campos
    ├── README.md                 # Instrucciones para crear nueva peregrinación
    └── images/                   # Ejemplo de estructura de imágenes
```

---

## Descripción de Archivos

### `index.json`

Archivo índice que contiene la lista de todas las peregrinaciones disponibles. La app utiliza este archivo para saber qué peregrinaciones cargar y dónde encontrar sus datos.

```json
{
  "version": "1",
  "ultima_actualizacion": "2026-02-16",
  "peregrinaciones": [
    {
      "id": "fatima",
      "nombre": "Fátima",
      "archivo": "fatima/fatima.json",
      "activa": true,
      "orden": 1
    }
  ]
}
```

### `{peregrinacion}/{peregrinacion}.json`

Cada peregrinación tiene su propio archivo JSON con toda la información: descripción, programa detallado por días, precios, vídeos, galería de imágenes, información sobre qué llevar, formulario de inscripción, contacto, y ediciones anteriores.

### `{peregrinacion}/images/`

Carpeta con las imágenes de cada peregrinación, organizadas por año. Esto permite:

- Mantener un histórico visual de cada edición
- Mostrar fotos de ediciones anteriores como referencia
- Separar imágenes generales (santuario, recorrido) de imágenes específicas de cada año

---

## Peregrinaciones Disponibles

### 🇵🇹 Fátima

**Santuario de Fátima, Portugal**

La Peregrinación a Fátima es la más emblemática de la Delegación. Desde hace décadas, cientos de jóvenes cordobeses caminan durante tres días hasta el Santuario de la Virgen de Fátima, donde la Virgen se apareció a los tres pastorcitos en 1917.

- **Duración**: 3 días (normalmente en agosto)
- **Distancia total**: Aproximadamente 120 km
- **Participantes habituales**: 200-400 jóvenes
- **Primera edición**: Décadas de tradición
- **Carpeta**: [`fatima/`](fatima/)
- **Datos**: [`fatima/fatima.json`](fatima/fatima.json)

#### Historia

La peregrinación a Fátima comenzó hace décadas como una iniciativa para que los jóvenes cordobeses vivieran una experiencia de fe profunda. A lo largo de los años, se ha convertido en un evento esperado por cientos de jóvenes que, cada verano, se ponen en camino hacia el santuario portugués.

El camino no es solo físico, sino también espiritual. Durante los tres días de caminata, los peregrinos comparten oraciones, cantos, reflexiones y momentos de fraternidad que forjan amistades para toda la vida.

---

### 🏛️ Guadalupe

**Real Monasterio de Santa María de Guadalupe, Cáceres**

Peregrinación al Monasterio de Nuestra Señora de Guadalupe, declarado Patrimonio de la Humanidad por la UNESCO y centro de devoción mariana en Extremadura. Un camino que une Andalucía con las tierras extremeñas.

- **Duración**: 2-3 días
- **Distancia**: Variable según punto de salida
- **Ubicación**: Guadalupe, provincia de Cáceres
- **Carpeta**: [`guadalupe/`](guadalupe/)
- **Datos**: [`guadalupe/guadalupe.json`](guadalupe/guadalupe.json)

#### Historia

El Monasterio de Guadalupe ha sido lugar de peregrinación durante siglos. La imagen de la Virgen de Guadalupe, patrona de Extremadura, atrae a fieles de toda España. Para la Delegación, esta peregrinación representa una oportunidad de conectar con la tradición mariana de los pueblos vecinos.

---

### ⛪ Inmaculada

**Basílica de Nuestra Señora de la Inmaculada, Córdoba**

Peregrinación urbana en honor a la Inmaculada Concepción, patrona de España. Un recorrido festivo por las calles de Córdoba hasta la Basílica, celebrando la solemnidad del 8 de diciembre.

- **Duración**: 1 día (8 de diciembre)
- **Modalidad**: Procesión/caminata urbana
- **Carpeta**: [`inmaculada/`](inmaculada/)
- **Datos**: [`inmaculada/inmaculada.json`](inmaculada/inmaculada.json)

#### Historia

Cada 8 de diciembre, la Iglesia celebra la Solemnidad de la Inmaculada Concepción. En Córdoba, esta fiesta tiene un carácter especial, y la Delegación organiza una peregrinación que recorre las calles de la ciudad hasta la Basílica dedicada a la Virgen.

---

## Cómo Añadir una Nueva Peregrinación

### Paso 1: Crear la estructura de carpetas

Crea una nueva carpeta dentro de `peregrinaciones/` con el nombre identificador de la peregrinación. El nombre debe:
- Estar en **minúsculas**
- **Sin acentos** ni caracteres especiales
- **Sin espacios** (usa guiones bajos si es necesario)

```bash
# Ejemplo: crear carpeta para Santiago de Compostela
mkdir peregrinaciones/santiago
mkdir peregrinaciones/santiago/images
mkdir peregrinaciones/santiago/images/2026
mkdir peregrinaciones/santiago/images/general
```

### Paso 2: Copiar la plantilla

Copia el archivo de plantilla y renómbralo:

```bash
# Copiar plantilla
cp peregrinaciones/_plantilla/plantilla.json peregrinaciones/santiago/santiago.json

# Copiar también el README de plantilla (opcional pero recomendado)
cp peregrinaciones/_plantilla/README.md peregrinaciones/santiago/README.md
```

### Paso 3: Completar el JSON

Edita el archivo JSON con toda la información de la nueva peregrinación:

1. Abre `peregrinaciones/santiago/santiago.json`
2. Rellena todos los campos obligatorios
3. Añade los campos opcionales que correspondan
4. Revisa que las rutas de imágenes sean correctas
5. Valida el JSON (puedes usar jsonlint.com)

### Paso 4: Añadir imágenes

Organiza las imágenes en las carpetas correspondientes:

```
santiago/images/
├── general/
│   ├── catedral.jpg         # Imagen principal del destino
│   ├── camino_01.jpg         # Paisajes del camino
│   └── portada.jpg           # Imagen para la portada
└── 2026/
    └── (vacío hasta que se realice la peregrinación)
```

### Paso 5: Crear README específico

Crea un archivo `README.md` dentro de la carpeta de la peregrinación con información específica:

```markdown
# Peregrinación a Santiago de Compostela

## Descripción
[Descripción detallada...]

## Información práctica
- Fechas: ...
- Punto de salida: ...
- etc.
```

### Paso 6: Registrar en el índice

Añade la nueva peregrinación al archivo `index.json`:

```json
{
  "id": "santiago",
  "nombre": "Santiago de Compostela",
  "archivo": "santiago/santiago.json",
  "activa": true,
  "orden": 4
}
```

### Paso 7: Actualizar versiones

Incrementa la versión en `versions.json` del directorio raíz:

```json
{
  "peregrinaciones": "3"
}
```

### Paso 8: Probar

1. Haz commit y push de los cambios
2. Espera unos minutos a que GitHub actualice el raw content
3. Abre la app y verifica que aparece la nueva peregrinación
4. Comprueba que todas las imágenes cargan correctamente

---

## Plantilla de JSON

A continuación se muestra la estructura completa de un archivo JSON de peregrinación con **todos los campos disponibles**. Consulta también [`_plantilla/plantilla.json`](_plantilla/plantilla.json) para una versión lista para copiar.

```json
{
  "id": "peregrinacion-nombre-2026",
  "tipo": "nombre",
  "titulo": "Peregrinación a [Destino] 2026",
  "subtitulo": "Frase descriptiva corta y atractiva",
  "descripcion": "Descripción corta (1-2 líneas) para mostrar en tarjetas y listados",
  "descripcion_larga": "Descripción extensa con toda la información sobre la peregrinación. Puede incluir varios párrafos separados por \\n\\n. Aquí se explica la historia, el significado, lo que vivirán los participantes, etc.",
  
  "imagen": "peregrinaciones/nombre/images/general/portada.jpg",
  
  "fecha_inicio": "2026-08-15",
  "fecha_fin": "2026-08-17",
  
  "precio": "150€",
  "precio_detalle": "Incluye: transporte en autobús, alojamiento, manutención completa y seguro. No incluye: gastos personales.",
  
  "inscripcion_abierta": true,
  "plazas_disponibles": 50,
  "formulario_inscripcion": "https://docs.google.com/forms/d/e/XXXXX/viewform",
  
  "destino": "Santuario de [Destino]",
  "punto_salida": "Plaza de las Tendillas, Córdoba",
  "punto_llegada": "Santuario de [Destino]",
  
  "video_youtube": "https://youtu.be/VIDEO_ID",
  "video_titulo": "Peregrinación a [Destino] - Vídeo resumen",
  
  "imagenes_galeria": [
    "peregrinaciones/nombre/images/general/santuario.jpg",
    "peregrinaciones/nombre/images/general/camino.jpg",
    "peregrinaciones/nombre/images/2025/grupo.jpg",
    "peregrinaciones/nombre/images/2025/llegada.jpg"
  ],
  
  "programa_dias": [
    {
      "dia": 1,
      "titulo": "Día 1 - Salida y primer tramo",
      "fecha": "15 de agosto",
      "actividades": [
        {
          "hora": "07:00",
          "titulo": "Concentración",
          "descripcion": "Encuentro en el punto de salida. Oración de envío.",
          "icono": "groups"
        },
        {
          "hora": "07:30",
          "titulo": "Salida en autobús",
          "descripcion": "Viaje hasta el punto de inicio de la caminata.",
          "icono": "directions_bus"
        },
        {
          "hora": "10:00",
          "titulo": "Inicio de la caminata",
          "descripcion": "Primer tramo de 15 km aproximadamente.",
          "icono": "directions_walk"
        },
        {
          "hora": "14:00",
          "titulo": "Comida",
          "descripcion": "Pausa para comer y descansar.",
          "icono": "restaurant"
        },
        {
          "hora": "16:00",
          "titulo": "Segundo tramo",
          "descripcion": "Continuación de la caminata.",
          "icono": "directions_walk"
        },
        {
          "hora": "20:00",
          "titulo": "Llegada al alojamiento",
          "descripcion": "Instalación y tiempo libre.",
          "icono": "hotel"
        },
        {
          "hora": "21:00",
          "titulo": "Cena",
          "descripcion": "Cena comunitaria.",
          "icono": "restaurant"
        },
        {
          "hora": "23:00",
          "titulo": "Oración de la noche",
          "descripcion": "Momento de oración y reflexión.",
          "icono": "nightlight"
        }
      ]
    },
    {
      "dia": 2,
      "titulo": "Día 2 - Jornada central",
      "fecha": "16 de agosto",
      "actividades": [
        {
          "hora": "07:00",
          "titulo": "Diana y desayuno",
          "descripcion": "Inicio del día con energía.",
          "icono": "wb_sunny"
        }
      ]
    },
    {
      "dia": 3,
      "titulo": "Día 3 - Llegada al Santuario",
      "fecha": "17 de agosto",
      "actividades": [
        {
          "hora": "12:00",
          "titulo": "Llegada al Santuario",
          "descripcion": "¡Meta alcanzada! Momento de emoción y agradecimiento.",
          "icono": "flag"
        },
        {
          "hora": "13:00",
          "titulo": "Santa Misa",
          "descripcion": "Celebración de la Eucaristía en el Santuario.",
          "icono": "church"
        }
      ]
    }
  ],
  
  "que_llevar": [
    "Mochila de montaña cómoda (40-50L)",
    "Saco de dormir",
    "Esterilla o aislante",
    "Calzado de trekking (¡ya usado!)",
    "Chanclas para el alojamiento",
    "Ropa cómoda y transpirable",
    "Ropa de abrigo para la noche",
    "Chubasquero",
    "Gorra o sombrero",
    "Protector solar",
    "Botella de agua (mínimo 1.5L)",
    "Documentación (DNI, tarjeta sanitaria)",
    "Medicación personal",
    "Linterna o frontal",
    "Cargador de móvil",
    "Pequeña toalla",
    "Kit de aseo básico",
    "Snacks energéticos",
    "Dinero en efectivo para extras"
  ],
  
  "informacion_adicional": "Información importante que no encaja en otros campos. Por ejemplo: requisitos de edad, condiciones físicas necesarias, normas de convivencia, etc.",
  
  "contacto_nombre": "Juan Pérez García",
  "contacto_telefono": "600123456",
  "contacto_email": "peregrinaciones@diocesisdecordoba.com",
  
  "ediciones_anteriores": [
    {
      "anio": "2025",
      "participantes": 350,
      "descripcion_breve": "Edición muy especial con récord de participación. El tiempo nos acompañó durante todo el camino.",
      "imagen": "peregrinaciones/nombre/images/2025/grupo.jpg"
    },
    {
      "anio": "2024",
      "participantes": 280,
      "descripcion_breve": "Primera edición tras la pandemia. Gran ambiente de reencuentro.",
      "imagen": "peregrinaciones/nombre/images/2024/grupo.jpg"
    }
  ]
}
```

---

## Gestión de Imágenes

### Estructura de Carpetas de Imágenes

Cada peregrinación tiene su carpeta `images/` con la siguiente estructura:

```
images/
├── general/              # Imágenes atemporales
│   ├── portada.jpg       # Imagen principal de la peregrinación
│   ├── santuario_01.jpg  # Fotos del destino
│   ├── santuario_02.jpg
│   ├── camino_01.jpg     # Paisajes del camino
│   └── mapa.jpg          # Mapa del recorrido
│
├── 2026/                 # Imágenes de la edición 2026
│   ├── grupo.jpg         # Foto de grupo
│   ├── salida.jpg        # Momento de la salida
│   ├── camino_01.jpg     # Durante el camino
│   ├── llegada.jpg       # Llegada al santuario
│   └── misa.jpg          # Celebración
│
├── 2025/                 # Ediciones anteriores
│   ├── grupo.jpg
│   └── ...
│
└── 2024/
    └── ...
```

### Nomenclatura Recomendada

| Tipo de imagen | Nombre sugerido | Descripción |
|----------------|-----------------|-------------|
| Portada | `portada.jpg` | Imagen principal representativa |
| Foto de grupo | `grupo.jpg` | Foto de todos los participantes |
| Salida | `salida.jpg` | Momento de inicio |
| Llegada | `llegada.jpg` | Momento de llegar al destino |
| Misa | `misa.jpg` | Celebración eucarística |
| Camino | `camino_01.jpg`, `camino_02.jpg`... | Fotos durante el recorrido |
| Santuario | `santuario_01.jpg`... | Fotos del lugar de destino |
| Noche | `noche_01.jpg`... | Actividades nocturnas |
| Convivencia | `convivencia_01.jpg`... | Momentos de fraternidad |

### Formatos Aceptados

| Formato | Uso recomendado | Características |
|---------|-----------------|-----------------|
| **JPG/JPEG** | Fotografías | Buena compresión, sin transparencia |
| **PNG** | Gráficos, logos | Soporta transparencia |
| **WebP** | Cualquiera | Mejor compresión, moderno |

**Recomendación**: Usa **JPEG** para fotos y **WebP** cuando sea posible para mejor rendimiento.

### Tamaños y Resoluciones

| Uso | Resolución | Peso máximo | Notas |
|-----|------------|-------------|-------|
| Portada/Hero | 1920 x 1080 px | 500 KB | Imagen grande, calidad alta |
| Galería | 1280 x 720 px | 300 KB | Calidad media-alta |
| Miniatura | 640 x 360 px | 100 KB | Para previsualizaciones |
| Icono/Avatar | 256 x 256 px | 50 KB | Cuadrado |

### Optimización de Imágenes

Antes de subir imágenes al repositorio, **siempre optimízalas**. Esto es crucial para:

1. **Reducir tiempo de carga** en la app
2. **Ahorrar datos móviles** de los usuarios
3. **Mantener el repositorio ligero**

#### Herramientas recomendadas

- **Web**: [Squoosh](https://squoosh.app/), [TinyPNG](https://tinypng.com/), [Compressor.io](https://compressor.io/)
- **Desktop**: ImageOptim (Mac), FileOptimizer (Windows)
- **CLI**: `imagemagick`, `optipng`, `jpegoptim`

#### Proceso recomendado

1. Redimensiona la imagen al tamaño necesario
2. Comprime usando calidad 80-85% para JPEG
3. Elimina metadatos EXIF (opcional, ahorra espacio)
4. Verifica que el resultado sigue viéndose bien

### URLs de Imágenes

En los JSON, las rutas de imágenes son **relativas** a la raíz del repositorio:

```json
"imagen": "peregrinaciones/fatima/images/general/portada.jpg"
```

La app convierte esto a la URL completa:

```
https://raw.githubusercontent.com/Fedes10/AppFedeDeleActualizada/main/peregrinaciones/fatima/images/general/portada.jpg
```

---

## Campos del JSON Explicados

### Campos de Identificación

| Campo | Tipo | Obligatorio | Descripción |
|-------|------|-------------|-------------|
| `id` | string | ✅ Sí | Identificador único. Formato: `peregrinacion-{tipo}-{año}` |
| `tipo` | string | ✅ Sí | Identificador corto sin año (fatima, guadalupe, santiago) |

**Ejemplo**:
```json
"id": "peregrinacion-fatima-2026",
"tipo": "fatima"
```

### Campos de Contenido Principal

| Campo | Tipo | Obligatorio | Descripción |
|-------|------|-------------|-------------|
| `titulo` | string | ✅ Sí | Título completo para mostrar en la app |
| `subtitulo` | string | ❌ No | Frase corta descriptiva |
| `descripcion` | string | ✅ Sí | Descripción corta (1-2 líneas) para tarjetas |
| `descripcion_larga` | string | ❌ No | Texto extenso con toda la información |
| `imagen` | string | ❌ No | Ruta a la imagen de portada |

### Campos de Fechas y Lugar

| Campo | Tipo | Obligatorio | Descripción |
|-------|------|-------------|-------------|
| `fecha_inicio` | string | ✅ Sí | Fecha de inicio (YYYY-MM-DD) |
| `fecha_fin` | string | ✅ Sí | Fecha de fin (YYYY-MM-DD) |
| `destino` | string | ✅ Sí | Nombre del lugar de destino |
| `punto_salida` | string | ❌ No | Lugar desde donde se sale |
| `punto_llegada` | string | ❌ No | Punto final exacto |

### Campos de Inscripción

| Campo | Tipo | Obligatorio | Descripción |
|-------|------|-------------|-------------|
| `precio` | string | ❌ No | Precio de la inscripción (ej: "150€") |
| `precio_detalle` | string | ❌ No | Qué incluye/no incluye el precio |
| `inscripcion_abierta` | boolean | ❌ No | `true` si se puede inscribir, `false` si no |
| `plazas_disponibles` | number | ❌ No | Número de plazas restantes |
| `formulario_inscripcion` | string | ❌ No | URL del formulario de Google Forms u otro |

### Campos Multimedia

| Campo | Tipo | Obligatorio | Descripción |
|-------|------|-------------|-------------|
| `video_youtube` | string | ❌ No | URL del vídeo de YouTube |
| `video_titulo` | string | ❌ No | Título descriptivo del vídeo |
| `imagenes_galeria` | array | ❌ No | Lista de rutas a imágenes para la galería |

### Campo `programa_dias`

Array de objetos que describen el programa día a día:

```json
"programa_dias": [
  {
    "dia": 1,
    "titulo": "Día 1 - Título del día",
    "fecha": "15 de agosto",
    "actividades": [
      {
        "hora": "07:00",
        "titulo": "Nombre de la actividad",
        "descripcion": "Descripción detallada",
        "icono": "nombre_icono_material"
      }
    ]
  }
]
```

#### Iconos disponibles para actividades

| Icono | Uso |
|-------|-----|
| `directions_bus` | Transporte en autobús |
| `directions_walk` | Caminata |
| `restaurant` | Comida/cena/desayuno |
| `hotel` | Alojamiento/descanso |
| `church` | Misa/oración/capilla |
| `groups` | Reunión/encuentro |
| `celebration` | Celebración/fiesta |
| `nightlight` | Actividad nocturna |
| `wb_sunny` | Momento de la mañana |
| `flag` | Llegada/meta |
| `music_note` | Música/cantos |
| `local_cafe` | Descanso/café |
| `nature` | Actividad al aire libre |
| `photo_camera` | Fotos |

### Campo `que_llevar`

Array de strings con la lista de cosas recomendadas:

```json
"que_llevar": [
  "Mochila cómoda",
  "Calzado de montaña",
  "Ropa de abrigo"
]
```

### Campos de Contacto

| Campo | Tipo | Descripción |
|-------|------|-------------|
| `contacto_nombre` | string | Nombre del responsable |
| `contacto_telefono` | string | Teléfono (sin espacios ni guiones) |
| `contacto_email` | string | Email de contacto |

### Campo `ediciones_anteriores`

Array de objetos con información de años pasados:

```json
"ediciones_anteriores": [
  {
    "anio": "2025",
    "participantes": 350,
    "descripcion_breve": "Texto corto...",
    "imagen": "ruta/a/imagen.jpg"
  }
]
```

**Nota**: Se usa `anio` en lugar de `año` por compatibilidad con sistemas que no manejan bien caracteres especiales.

---

## Buenas Prácticas

### ✅ Sí hacer

1. **Mantener datos actualizados**
   - Actualizar `inscripcion_abierta` cuando cambien las inscripciones
   - Actualizar `plazas_disponibles` regularmente
   - Añadir fotos tras cada edición

2. **Ser consistente**
   - Usar siempre el mismo formato de fechas (YYYY-MM-DD en campos de fecha)
   - Seguir la estructura de carpetas establecida
   - Mantener nomenclatura coherente en imágenes

3. **Documentar**
   - Actualizar este README cuando haya cambios importantes
   - Añadir ediciones anteriores al finalizar cada año
   - Escribir descripciones claras y útiles

4. **Optimizar**
   - Comprimir imágenes antes de subir
   - Usar resoluciones apropiadas
   - Eliminar archivos que ya no se usen

5. **Validar**
   - Comprobar que los JSON son válidos antes de subir
   - Verificar que las URLs de vídeos funcionan
   - Probar que los formularios están activos

### ❌ No hacer

1. **NO subir imágenes sin optimizar**
   - Evita fotos directamente de la cámara (suelen ser 5-10 MB)
   
2. **NO usar caracteres especiales en nombres de archivo**
   - ❌ `día_1_mañana.jpg`
   - ✅ `dia_1_manana.jpg`

3. **NO olvidar actualizar versions.json**
   - La app no detectará cambios si no incrementas la versión

4. **NO dejar campos obligatorios vacíos**
   - Mejor omitir el campo que dejarlo como string vacío

5. **NO duplicar imágenes**
   - Si una imagen sirve para varias cosas, usa la misma ruta

---

## Ejemplos

### Ejemplo de peregrinación mínima

Solo con los campos obligatorios:

```json
{
  "id": "peregrinacion-rocio-2026",
  "tipo": "rocio",
  "titulo": "Peregrinación al Rocío 2026",
  "descripcion": "Camino hacia la aldea del Rocío",
  "fecha_inicio": "2026-05-20",
  "fecha_fin": "2026-05-24",
  "destino": "Aldea del Rocío, Huelva"
}
```

### Ejemplo de peregrinación completa

Ver [`fatima/fatima.json`](fatima/fatima.json) para un ejemplo completo con todos los campos implementados.

### Añadir una imagen a la galería

1. Sube la imagen a la carpeta correspondiente:
   ```
   peregrinaciones/fatima/images/2025/procesion.jpg
   ```

2. Añade la ruta al array `imagenes_galeria`:
   ```json
   "imagenes_galeria": [
     "peregrinaciones/fatima/images/general/santuario.jpg",
     "peregrinaciones/fatima/images/2025/procesion.jpg"
   ]
   ```

3. Actualiza la versión y sube los cambios.

---

## Flujo de Trabajo Anual

### Antes de la peregrinación

1. ✏️ Actualizar el JSON con fechas y precios del nuevo año
2. ✏️ Crear el formulario de inscripción y añadir la URL
3. ✏️ Poner `inscripcion_abierta: true`
4. ✏️ Revisar y actualizar `que_llevar` si es necesario
5. 📤 Subir cambios y actualizar versiones

### Durante las inscripciones

1. 📊 Actualizar `plazas_disponibles` periódicamente
2. 📢 Cuando se llene, poner `inscripcion_abierta: false`

### Después de la peregrinación

1. 📸 Subir fotos a la carpeta del año (ej: `images/2026/`)
2. ✏️ Actualizar galería con mejores fotos
3. ✏️ Si hay vídeo nuevo, actualizar `video_youtube`
4. ✏️ Añadir entrada en `ediciones_anteriores`
5. 📤 Subir cambios y actualizar versiones

---

## Preguntas Frecuentes

### ¿Cómo puedo validar que mi JSON está bien formado?

Puedes usar herramientas online como [JSONLint](https://jsonlint.com/) o extensiones de tu editor de código (VS Code tiene validación integrada).

### ¿Qué pasa si olvido actualizar versions.json?

La app no detectará que hay cambios y seguirá mostrando los datos cacheados. Siempre incrementa la versión tras modificaciones.

### ¿Puedo usar imágenes de internet?

Sí, puedes usar URLs externas en `imagenes_galeria`, pero es preferible subir las imágenes al repositorio para garantizar disponibilidad y control.

### ¿Cómo obtengo el ID de un vídeo de YouTube?

De una URL como `https://www.youtube.com/watch?v=ABC123def`, el ID es `ABC123def`. También puedes usar URLs cortas: `https://youtu.be/ABC123def`.

---

## Contacto y Soporte

Para dudas sobre la gestión de este directorio o la estructura de datos:

- **Delegación Diocesana de Juventud de Córdoba**
- **Email**: juventud@diocesisdecordoba.com
- **Web**: https://delejuventudcordoba.es

---

*Documentación actualizada: 16 de febrero de 2026*

*Versión del esquema de datos: 2.0*
