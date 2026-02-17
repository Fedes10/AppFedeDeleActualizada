# Pantalla Inicio (Home)

## Archivo
- `home.json` - Configuración de la pantalla principal

## Cómo editar

### Cambiar saludos
```json
"saludo": {
  "buenos_dias": "¡Tu saludo matutino!",
  "titulo": "Bienvenido a Tu App"
}
```

### Añadir frases del día
```json
"frases": [
  "\"Tu frase 1\"",
  "\"Tu frase 2\""
]
```

### Configurar accesos rápidos
```json
{
  "id": "mi_seccion",
  "nombre": "Mi Sección",
  "icono": "ic_star",
  "color": "#FF5722",
  "destino": "mi_destino"
}
```

**Colores:** Usa códigos hexadecimales (#RRGGBB)

**Iconos disponibles:**
- `ic_music_note` - Música
- `ic_hiking` - Peregrinación
- `ic_article` - Noticias
- `ic_contact_phone` - Contacto
- `ic_calendar_month` - Calendario
- `ic_church` - Iglesia
- `ic_star` - Estrella

### Carrusel Iglesia Joven
```json
"iglesia_joven": {
  "mostrar_carrusel": true,
  "intervalo_segundos": 5,
  "usar_imagenes_noticias": true
}
```
Las imágenes se toman automáticamente de las noticias.
