# Sección Contacto

## Archivo
- `contacto.json` - Toda la información de contacto

## Cómo editar

### Cambiar dirección
```json
"direccion": {
  "calle": "Tu calle",
  "ciudad": "Tu ciudad",
  "codigo_postal": "Código",
  "maps_query": "Dirección para Google Maps"
}
```

### Cambiar teléfono
```json
"telefono": {
  "numero": "123456789",
  "tipo": "WhatsApp"
}
```

### Cambiar email
```json
"email": {
  "direccion": "tu@email.com",
  "asunto_default": "Asunto predeterminado"
}
```

### Añadir red social
Añade al array `redes`:
```json
{
  "id": "tiktok",
  "nombre": "TikTok",
  "url": "https://tiktok.com/@tu_cuenta",
  "icono": "ic_tiktok"
}
```

Iconos disponibles: `ic_instagram`, `ic_facebook`, `ic_youtube`, `ic_tiktok`, `ic_twitter`
