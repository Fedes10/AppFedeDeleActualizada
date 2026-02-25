# Sección Acerca De

## Archivos

- `delegacion.json` - Información de la delegación
- `acerca_de_delegados.png` - Imagen de cabecera (sube aquí tu imagen)

## Cómo editar

### Cambiar header
```json
"header": {
  "titulo": "Tu título",
  "subtitulo": "Tu subtítulo", 
  "imagen": "about/acerca_de_delegados.png",
  "lema": "Tu lema"
}
```

### Cambiar obispo
```json
"obispo": {
  "cargo": "Obispo de Córdoba",
  "nombre": "Nombre del Obispo"
}
```

### Añadir/editar delegados
Añade objetos al array `personas`:
```json
{
  "id": "delegado-3",
  "cargo": "Delegado",
  "nombre": "Nombre Completo"
}
```

### Cambiar web
```json
"web": "https://tu-web.com/"
```

## Imagen
Sube `acerca_de_delegados.png` a esta carpeta para cambiar la imagen de cabecera.
