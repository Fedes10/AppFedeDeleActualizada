# Resumen de estructuras y campos de datos de AppFede

---

## De la carpeta: noticias/README.md
Ruta: noticias/

**Estructura de carpetas:**
```
noticias/
  AAAA/                # Año (ej: 2026)
    NN-mes/            # Mes (ej: 02-febrero)
      images/          # Imágenes de las noticias de ese mes
      noticia-*.json   # Archivos individuales de cada noticia
    index.json         # Índice anual de noticias
  index.json           # Índice global de años disponibles
```

**Ejemplo de index.json anual:**
```json
{
  "noticias": [
    "02-febrero/noticia-fatima-2026.json",
    "02-febrero/noticia-ejercicios-coraje-2026.json"
  ]
}
```
**Ejemplo de noticia individual:**
```json
{
  "id": "noticia-fatima-2026",
  "titulo": "¡Inscripciones abiertas para Fátima 2026!",
  "descripcion": "Ya puedes inscribirte en la peregrinación...",
  "contenido": "Texto completo...",
  "imagen": "noticias/2026/02-febrero/images/fatima-2025-portada.jpg",
  "categoria": "Peregrinaciones",
  "fecha": "2026-02-10",
  "autor": "Delegación de Juventud"
}
```

---

## De la carpeta: eventos/README.md
Ruta: eventos/

**Archivo principal:** eventos.json

**Campos de cada evento:**
- id
- titulo
- descripcion
- fecha_inicio
- fecha_fin
- hora_inicio
- hora_fin
- ubicacion
- tipo
- color
- imagen (opcional)
- enlace_noticia (opcional)
- recordatorio

**Ejemplo:**
```json
{
  "id": "evento-fatima-2025",
  "titulo": "Peregrinación a Fátima",
  "descripcion": "Viaje a Fátima...",
  "fecha_inicio": "2025-02-20",
  "fecha_fin": "2025-02-22",
  "hora_inicio": "08:00",
  "hora_fin": "20:00",
  "ubicacion": "Fátima, Portugal",
  "tipo": "peregrinacion",
  "color": "#1565C0",
  "imagen": "eventos/images/fatima.jpg",
  "enlace_noticia": "noticia-fatima-2025",
  "recordatorio": true
}
```

---

## De la carpeta: oraciones/README.md
Ruta: oraciones/

**Archivo principal:** oraciones.json

**Estructura de oraciones:**
- id
- titulo
- categoria
- contenido
- autor
- duracion
- favorito

**Ejemplo:**
```json
{
  "id": "oracion-mananera-1",
  "titulo": "Oración de la mañana",
  "categoria": "mananera",
  "contenido": "Texto de la oración...",
  "autor": "Autor",
  "duracion": "2 min",
  "favorito": false
}
```

---

## De la carpeta: home/README.md
Ruta: home/

**Archivo principal:** home.json

**Campos principales:**
- saludo
- frases
- accesos_rapidos

**Ejemplo de saludo:**
```json
"saludo": {
  "buenos_dias": "¡Tu saludo matutino!",
  "titulo": "Bienvenido a Tu App"
}
```
**Ejemplo de acceso rápido:**
```json
{
  "id": "mi_seccion",
  "nombre": "Mi Sección",
  "icono": "ic_star",
  "color": "#FF5722",
  "destino": "mi_destino"
}
```

---

## De la carpeta: peregrinaciones/README.md
Ruta: peregrinaciones/

**Estructura de carpetas:**
```
peregrinaciones/
  README.md
  index.json
  fatima/
    fatima.json
    anios/
      2025/
        fatima2025.json
      2026/
        fatima2026.json
    images/
  guadalupe/
    guadalupe.json
    anios/
      2025/
        guadalupe2025.json
      2026/
        guadalupe2026.json
    images/
  inmaculada/
    inmaculada.json
    anios/
      2025/
        inmaculada2025.json
      2026/
        inmaculada2026.json
    images/
```
**Ejemplo de peregrinación (fatima.json):**
```json
{
  "id": "fatima-2026",
  "titulo": "Peregrinación a Fátima 2026",
  "descripcion": "Viaje a Fátima...",
  "fecha": "2026-02-20",
  "imagen": "peregrinaciones/fatima/images/fatima-2026.jpg",
  "inscripcion": "https://...",
  "precio": "150€",
  "organizador": "Delegación de Juventud"
}
```

---

## De la carpeta: contacto/README.md
Ruta: contacto/

**Archivo principal:** contacto.json

**Campos principales:**
- direccion
- telefono
- email
- redes

**Ejemplo de dirección:**
```json
"direccion": {
  "calle": "Tu calle",
  "ciudad": "Tu ciudad",
  "codigo_postal": "Código",
  "maps_query": "Dirección para Google Maps"
}
```
**Ejemplo de red social:**
```json
{
  "id": "tiktok",
  "nombre": "TikTok",
  "url": "https://tiktok.com/@tu_cuenta"
}
```

---

## De la carpeta: calendario/README.md
Ruta: calendario/

**Archivo principal:** calendario.json

**Campos de cada evento:**
- id
- titulo
- fecha
- hora
- ubicacion
- categoria
- color
- descripcion
- peregrinacion_id (opcional)

**Ejemplo:**
```json
{
  "id": "evento-adoracion-2026",
  "titulo": "Adoración Eucarística",
  "fecha": "2026-03-15",
  "hora": "Todo el día",
  "ubicacion": "Catedral de Córdoba",
  "categoria": "vigilia",
  "color": "#9C27B0",
  "descripcion": "Jornada de adoración...",
  "peregrinacion_id": "fatima-2026"
}
```

---

## De la carpeta: canciones/README.md
Ruta: canciones/

**Archivo principal:** canciones.json

**Campos de cada canción:**
- id
- titulo
- artista
- categoria
- letra
- audio
- duracion

**Ejemplo:**
```json
{
  "id": "hakuna-huracan",
  "titulo": "Huracán",
  "artista": "Hakuna",
  "categoria": "Hakuna",
  "letra": "Letra completa...",
  "audio": "canciones/audio/huracan.mp3",
  "duracion": 210
}
```

---

## De la carpeta: about/README.md y acerca_de/README.md
Ruta: about/ y acerca_de/

**Archivo principal:** delegacion.json

**Campos principales:**
- header
- obispo
- personas
- web

**Ejemplo de header:**
```json
"header": {
  "titulo": "Tu título",
  "subtitulo": "Tu subtítulo",
  "imagen": "about/acerca_de_delegados.png",
  "lema": "Tu lema"
}
```
**Ejemplo de persona:**
```json
{
  "id": "delegado-3",
  "cargo": "Delegado",
  "nombre": "Nombre Completo"
}
```

---
