
# Noticias



## Estructura de carpetas y funcionamiento

Las noticias están organizadas por año y mes, usando carpetas con el formato `AAAA/NN-mes/`, donde `NN` es el número del mes y `mes` su nombre en español. Dentro de cada mes:

```
noticias/
  2026/
    01-enero/
      images/
      ...
    02-febrero/
      images/
      noticia-fatima-2026.json
      noticia-ejercicios-coraje-2026.json
      ...
    ...
    index.json
  2027/
    01-enero/
    ...
    index.json
```

Cada año tiene un archivo `index.json` que contiene la lista de rutas relativas a cada noticia de ese año. Ejemplo de `noticias/2026/index.json`:

```json
{
  "noticias": [
    "02-febrero/noticia-fatima-2026.json",
    "02-febrero/noticia-ejercicios-coraje-2026.json",
    "02-febrero/noticia-guadalupe-2026.json",
    "02-febrero/noticia-convivencia-voluntarios.json",
    "02-febrero/noticia-vigilia-inmaculada-2026.json"
  ]
}
```

## ¿Cómo añadir o actualizar una noticia?

1. Crea el archivo JSON de la noticia en la carpeta del mes correspondiente (por ejemplo, `2026/02-febrero/`).
2. Añade las imágenes asociadas en la subcarpeta `images` de ese mes.
3. Añade la ruta relativa del archivo de la noticia al `index.json` del año correspondiente (por ejemplo, `2026/index.json`).
4. ¡Listo! La app detectará automáticamente la noticia al leer el index del año.

## ¿Qué hacer cuando cambie de año?

1. Duplica la estructura de carpetas del año anterior (por ejemplo, copia `2026` a `2027`).
2. Borra las noticias antiguas y deja solo las carpetas de meses vacías y sus subcarpetas `images`.
3. Crea un nuevo archivo `2027/index.json` vacío o con las rutas de las nuevas noticias que vayas añadiendo.
4. Cada vez que añadas una noticia nueva, solo tienes que añadir su ruta al `index.json` de ese año.

## ¿La app se adapta automáticamente?

Sí. La app busca todos los archivos listados en el `index.json` de cada año. Si creas un nuevo año y su index.json, la app mostrará automáticamente las noticias de ese año sin necesidad de modificar el código.

---

**Resumen:**
- Añade/borra noticias solo editando el `index.json` del año.
- No es necesario modificar la app ni el código para nuevos años.
- Mantén la estructura de carpetas y el index.json actualizado para que todo funcione.

## ¿Cómo funciona?

1. **Cada noticia** es un archivo JSON independiente dentro de la carpeta del mes y año de publicación.
2. **Las imágenes** asociadas a cada noticia se encuentran en la subcarpeta `images` correspondiente al mes y año.
3. **El archivo `noticias.json`** ya no se utiliza para nuevas noticias, pero se mantiene para compatibilidad histórica.
4. **Para mostrar todas las noticias**, la app debe recorrer todas las carpetas de años y meses, y leer todos los archivos `.json` de cada mes.
5. **Para añadir una noticia**, crea un archivo JSON en la carpeta del mes y año correspondiente, y coloca las imágenes en la subcarpeta `images` de ese mes.

## Ejemplo de archivo de noticia

```json
{
	"id": "noticia-fatima-2026",
	"titulo": "¡Inscripciones abiertas para Fátima 2026!",
	"descripcion": "Ya puedes inscribirte en la peregrinación a Fátima del 20 al 22 de febrero",
	"contenido": "- Peregrinación a Fátima del 20 al 22 de febrero de 2026\n- Inscripciones abiertas hasta el 13 de febrero\n- Precio: 150€ (todo incluido)",
	"imagen": "noticias/2026/02-febrero/images/convivencia-voluntarios.jpg",
	"categoria": "Peregrinaciones",
	"fecha": "2026-02-10",
	"autor": "Delegación de Juventud"
}
```

## Notas

- Para añadir una noticia, crea un archivo JSON en la carpeta del mes y año correspondiente.
- Para añadir imágenes, colócalas en la subcarpeta `images` del mes y año correspondiente.
- La app debe buscar y leer todos los archivos `.json` de cada carpeta de mes para mostrar todas las noticias.

## ¿Cómo funciona?

- Cada noticia es un archivo JSON independiente dentro de la carpeta del mes y año de publicación.
- Las imágenes asociadas a cada noticia se encuentran en la subcarpeta `images` correspondiente al mes y año.
- El archivo `noticias.json` ya no se utiliza para nuevas noticias, pero se mantiene para compatibilidad histórica.

## Ejemplo de archivo de noticia

```json
{
	"id": "noticia-fatima-2026",
	"titulo": "¡Inscripciones abiertas para Fátima 2026!",
	"descripcion": "Ya puedes inscribirte en la peregrinación a Fátima del 20 al 22 de febrero",
	"contenido": "- Peregrinación a Fátima del 20 al 22 de febrero de 2026\n- Inscripciones abiertas hasta el 13 de febrero\n- Precio: 150€ (todo incluido)",
	"imagen": "peregrinaciones/images/fatima-2025-portada.jpg",
	"categoria": "Peregrinaciones",
	"fecha": "2026-02-10",
	"autor": "Delegación de Juventud"
}
```

## Notas

- Para añadir una noticia, crea un archivo JSON en la carpeta del mes y año correspondiente.
- Para añadir imágenes, colócalas en la subcarpeta `images` del mes y año correspondiente.
