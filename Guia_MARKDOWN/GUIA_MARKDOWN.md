# 📝 Guía de Markdown Personalizado - La Dele

Sistema de formateo de texto para la app de La Dele. Este markdown personalizado permite dar formato al texto en los JSON de la app.

---

## 📋 Índice

1. [Formato de Texto Básico](#formato-de-texto-básico)
2. [Colores de Texto](#colores-de-texto)
3. [Iconos](#iconos)
4. [Etiquetas y Badges](#etiquetas-y-badges)
5. [Listas y Viñetas](#listas-y-viñetas)
6. [Enlaces](#enlaces)
7. [Bloques Especiales](#bloques-especiales)
8. [Sistema de Colores por Peregrinación](#sistema-de-colores-por-peregrinación)
9. [Ejemplos Completos](#ejemplos-completos)

---

## 1. Formato de Texto Básico

| Sintaxis | Resultado | Descripción |
|----------|-----------|-------------|
| `**texto**` | **texto** | Negrita |
| `*texto*` | *texto* | Cursiva |
| `__texto__` | <u>texto</u> | Subrayado |
| `~~texto~~` | ~~texto~~ | Tachado |
| `***texto***` | ***texto*** | Negrita + Cursiva |
| `\n` | Nueva línea | Salto de línea |

### Ejemplos:
```json
{
  "texto": "Esto es **importante** y esto es *destacado*"
}
```
→ Esto es **importante** y esto es *destacado*

---

## 2. Colores de Texto

Usa la sintaxis `{{color:NOMBRE_COLOR}}texto{{/color}}` para colorear texto.

### Colores Disponibles

#### Colores Primarios
| Código | Color | Hex | Uso recomendado |
|--------|-------|-----|-----------------|
| `primary` | 🟠 Naranja Dele | `#FF6B35` | Color principal de la app |
| `secondary` | 🔵 Azul | `#2196F3` | Información, enlaces |
| `accent` | 🟣 Morado | `#9C27B0` | Destacados especiales |

#### Colores Semánticos
| Código | Color | Hex | Uso recomendado |
|--------|-------|-----|-----------------|
| `success` | 🟢 Verde | `#4CAF50` | Éxito, confirmaciones, disponible |
| `warning` | 🟡 Amarillo | `#FF9800` | Avisos, atención |
| `error` | 🔴 Rojo | `#F44336` | Errores, importante, cerrado |
| `info` | 🔵 Azul claro | `#03A9F4` | Información neutral |

#### Colores de Peregrinación
| Código | Color | Hex | Peregrinación |
|--------|-------|-----|---------------|
| `fatima` | 🔵 Azul María | `#2196F3` | Fátima |
| `guadalupe` | 🟢 Verde Esperanza | `#4CAF50` | Guadalupe |
| `inmaculada` | 🟣 Morado Inmaculada | `#9C27B0` | Inmaculada |

#### Colores Neutros
| Código | Color | Hex | Uso recomendado |
|--------|-------|-----|-----------------|
| `muted` | ⚫ Gris | `#757575` | Texto secundario |
| `dark` | ⬛ Negro | `#212121` | Texto principal |
| `light` | ⬜ Blanco | `#FFFFFF` | Sobre fondos oscuros |

### Sintaxis de Colores

```json
{
  "texto": "El plazo está {{color:error}}CERRADO{{/color}}"
}
```
→ El plazo está <span style="color:red">CERRADO</span>

```json
{
  "texto": "{{color:success}}¡Inscripciones abiertas!{{/color}}"
}
```
→ <span style="color:green">¡Inscripciones abiertas!</span>

### Combinando con formato

```json
{
  "texto": "**{{color:warning}}⚠️ Atención:{{/color}}** Traer almuerzo"
}
```
→ **<span style="color:orange">⚠️ Atención:</span>** Traer almuerzo

---

## 3. Iconos

Usa la sintaxis `{{icon:NOMBRE_ICONO}}` para insertar iconos de Material Design.

### Iconos Disponibles

#### Transporte
| Código | Icono | Descripción |
|--------|-------|-------------|
| `{{icon:bus}}` | 🚌 | Autobús |
| `{{icon:walk}}` | 🚶 | Caminar |
| `{{icon:directions}}` | 📍 | Direcciones |

#### Lugares
| Código | Icono | Descripción |
|--------|-------|-------------|
| `{{icon:church}}` | ⛪ | Iglesia/Capilla |
| `{{icon:hotel}}` | 🏨 | Alojamiento |
| `{{icon:restaurant}}` | 🍽️ | Comida |
| `{{icon:location}}` | 📍 | Ubicación |

#### Tiempo
| Código | Icono | Descripción |
|--------|-------|-------------|
| `{{icon:time}}` | ⏰ | Hora |
| `{{icon:calendar}}` | 📅 | Fecha |
| `{{icon:schedule}}` | 📋 | Horario |

#### Acciones
| Código | Icono | Descripción |
|--------|-------|-------------|
| `{{icon:check}}` | ✅ | Confirmado/Incluido |
| `{{icon:close}}` | ❌ | No incluido |
| `{{icon:warning}}` | ⚠️ | Atención |
| `{{icon:info}}` | ℹ️ | Información |
| `{{icon:phone}}` | 📞 | Teléfono |
| `{{icon:email}}` | 📧 | Email |

#### Objetos
| Código | Icono | Descripción |
|--------|-------|-------------|
| `{{icon:backpack}}` | 🎒 | Mochila/Equipaje |
| `{{icon:document}}` | 📄 | Documento |
| `{{icon:medical}}` | 💊 | Medicación |
| `{{icon:money}}` | 💰 | Dinero/Precio |

### Ejemplo:
```json
{
  "texto": "{{icon:check}} Incluido en el precio\n{{icon:close}} No incluido"
}
```

---

## 4. Etiquetas y Badges

Usa `{{badge:TIPO}}texto{{/badge}}` para crear etiquetas destacadas.

### Tipos de Badge

| Tipo | Estilo | Uso |
|------|--------|-----|
| `success` | Verde con fondo | Abierto, disponible |
| `error` | Rojo con fondo | Cerrado, agotado |
| `warning` | Naranja con fondo | Próximamente, últimas plazas |
| `info` | Azul con fondo | Información |
| `primary` | Naranja Dele | Destacado general |

### Ejemplo:
```json
{
  "texto": "{{badge:success}}ABIERTAS{{/badge}} Las inscripciones ya están disponibles"
}
```

---

## 5. Listas y Viñetas

### Lista Simple (con emojis)
```json
{
  "texto": "• Primer elemento\n• Segundo elemento\n• Tercer elemento"
}
```

### Lista con Iconos Check
```json
{
  "texto": "{{icon:check}} Transporte incluido\n{{icon:check}} Alojamiento incluido\n{{icon:close}} Comidas no incluidas"
}
```

### Lista Numerada
```json
{
  "texto": "1. Primer paso\n2. Segundo paso\n3. Tercer paso"
}
```

---

## 6. Enlaces

Usa `{{link:URL}}texto{{/link}}` para crear enlaces clicables.

```json
{
  "texto": "{{link:https://ejemplo.com}}Haz clic aquí{{/link}}"
}
```

### Enlace con icono
```json
{
  "texto": "{{icon:phone}} {{link:tel:957479879}}Llamar{{/link}}"
}
```

---

## 7. Bloques Especiales

### Bloque de Aviso
```json
{
  "texto": "{{block:warning}}\n**Importante:**\nRecuerda traer el almuerzo del viernes.\n{{/block}}"
}
```

### Bloque de Información
```json
{
  "texto": "{{block:info}}\nEl albergue incluye sábanas y toallas.\n{{/block}}"
}
```

### Bloque de Éxito
```json
{
  "texto": "{{block:success}}\n¡Ya estás inscrito!\n{{/block}}"
}
```

### Bloque de Error
```json
{
  "texto": "{{block:error}}\nEl plazo de inscripción ha finalizado.\n{{/block}}"
}
```

---

## 8. Sistema de Colores por Peregrinación

Cada peregrinación puede definir su propia paleta de colores en el JSON.

### Estructura de Colores

```json
{
  "colores": {
    "primario": "#2196F3",
    "primario_claro": "#64B5F6",
    "primario_oscuro": "#1976D2",
    "secundario": "#FFC107",
    "acento": "#FF5722",
    "fondo": "#E3F2FD",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#2196F3",
    "gradiente_fin": "#1565C0"
  }
}
```

### Paletas Predefinidas

#### Fátima (Azul María)
```json
{
  "colores": {
    "primario": "#2196F3",
    "primario_claro": "#64B5F6",
    "primario_oscuro": "#1976D2",
    "secundario": "#FFC107",
    "acento": "#FF5722",
    "fondo": "#E3F2FD",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#2196F3",
    "gradiente_fin": "#1565C0"
  }
}
```

#### Guadalupe (Verde Esperanza)
```json
{
  "colores": {
    "primario": "#4CAF50",
    "primario_claro": "#81C784",
    "primario_oscuro": "#388E3C",
    "secundario": "#795548",
    "acento": "#FF9800",
    "fondo": "#E8F5E9",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#4CAF50",
    "gradiente_fin": "#2E7D32"
  }
}
```

#### Inmaculada (Morado/Blanco)
```json
{
  "colores": {
    "primario": "#9C27B0",
    "primario_claro": "#CE93D8",
    "primario_oscuro": "#7B1FA2",
    "secundario": "#FFD700",
    "acento": "#E91E63",
    "fondo": "#F3E5F5",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#9C27B0",
    "gradiente_fin": "#6A1B9A"
  }
}
```

#### Otras opciones de paletas

##### Tierra Santa (Dorado/Arena)
```json
{
  "colores": {
    "primario": "#D4A574",
    "primario_claro": "#E8C9A0",
    "primario_oscuro": "#A67C52",
    "secundario": "#8B4513",
    "acento": "#FFD700",
    "fondo": "#FFF8E7",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#3E2723",
    "gradiente_inicio": "#D4A574",
    "gradiente_fin": "#A67C52"
  }
}
```

##### Roma (Rojo Vaticano)
```json
{
  "colores": {
    "primario": "#B71C1C",
    "primario_claro": "#E57373",
    "primario_oscuro": "#7F0000",
    "secundario": "#FFD700",
    "acento": "#FFC107",
    "fondo": "#FFEBEE",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#B71C1C",
    "gradiente_fin": "#7F0000"
  }
}
```

##### Lourdes (Azul Cielo)
```json
{
  "colores": {
    "primario": "#03A9F4",
    "primario_claro": "#4FC3F7",
    "primario_oscuro": "#0288D1",
    "secundario": "#FFFFFF",
    "acento": "#FFC107",
    "fondo": "#E1F5FE",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#03A9F4",
    "gradiente_fin": "#0277BD"
  }
}
```

##### Santiago (Rojo Peregrino)
```json
{
  "colores": {
    "primario": "#C62828",
    "primario_claro": "#EF5350",
    "primario_oscuro": "#8E0000",
    "secundario": "#FFD700",
    "acento": "#FF6F00",
    "fondo": "#FFEBEE",
    "fondo_card": "#FFFFFF",
    "texto_sobre_primario": "#FFFFFF",
    "gradiente_inicio": "#C62828",
    "gradiente_fin": "#8E0000"
  }
}
```

### Descripción de cada color

| Campo | Uso |
|-------|-----|
| `primario` | Color principal de la peregrinación (headers, botones) |
| `primario_claro` | Versión clara para hovers, bordes suaves |
| `primario_oscuro` | Versión oscura para sombras, acentos |
| `secundario` | Color complementario para badges, detalles |
| `acento` | Color de llamada a la acción (CTAs) |
| `fondo` | Color de fondo de la pantalla |
| `fondo_card` | Color de fondo de las tarjetas |
| `texto_sobre_primario` | Color del texto sobre el color primario |
| `gradiente_inicio` | Color inicial del gradiente del header |
| `gradiente_fin` | Color final del gradiente del header |

---

## 9. Ejemplos Completos

### Información Adicional de Fátima
```json
{
  "informacion_adicional": "{{block:warning}}\n**{{color:error}}Importante:{{/color}}**\n{{icon:check}} El albergue incluye sábanas y toallas\n{{icon:check}} Duchas individuales disponibles\n{{icon:bus}} Viajamos en autobús, no es caminando\n{{icon:medical}} Si usas medicación, avisa a la organización\n{{/block}}"
}
```

### Precio con Detalles
```json
{
  "precio": "185€",
  "precio_detalle": "**{{color:success}}Incluido:{{/color}}**\n{{icon:check}} Transporte en autobús\n{{icon:check}} Alojamiento completo\n{{icon:check}} Todas las comidas (excepto almuerzo viernes)\n\n**{{color:error}}No incluido:{{/color}}**\n{{icon:close}} Almuerzo del viernes\n{{icon:close}} Gastos personales"
}
```

### Estado de Inscripción
```json
{
  "inscripcion_estado": "{{badge:error}}CERRADAS{{/badge}}",
  "inscripcion_mensaje": "El plazo finalizó el {{color:muted}}viernes 13 de febrero{{/color}}"
}
```

---

## 10. Referencia Rápida

### Formato Básico
```
**negrita**  *cursiva*  __subrayado__  ~~tachado~~
```

### Colores
```
{{color:NOMBRE}}texto{{/color}}
Nombres: primary, secondary, accent, success, warning, error, info, muted, dark, light, fatima, guadalupe, inmaculada
```

### Iconos
```
{{icon:NOMBRE}}
Nombres: bus, walk, church, hotel, restaurant, time, calendar, check, close, warning, info, phone, email, backpack, document, medical, money
```

### Badges
```
{{badge:TIPO}}texto{{/badge}}
Tipos: success, error, warning, info, primary
```

### Bloques
```
{{block:TIPO}}
contenido
{{/block}}
Tipos: warning, info, success, error
```

### Enlaces
```
{{link:URL}}texto{{/link}}
```

---

## 💡 Consejos de Uso

1. **Combina formatos**: Puedes usar colores dentro de negritas: `**{{color:error}}IMPORTANTE{{/color}}**`

2. **Usa emojis**: Los emojis nativos funcionan: `🎒 Mochila`

3. **Mantén consistencia**: Usa los mismos colores para los mismos significados en toda la app

4. **No abuses**: El markdown es para destacar, no para todo el texto

5. **Prueba en la app**: Algunos formatos pueden verse diferentes en modo oscuro

---

## 🔧 Soporte Técnico

Si algún formato no se renderiza correctamente, contacta con el desarrollador.

**Versión del sistema de markdown**: 1.0
**Última actualización**: Febrero 2026
