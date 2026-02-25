
# Noticias


## Nueva estructura (desde 2026)

Las noticias están organizadas por año y mes, usando carpetas con el formato `AAAA/NN-mes/`, donde `NN` es el número del mes y `mes` su nombre en español. Dentro de cada mes:

```
noticias/
	2025/
		01-enero/
			images/
				(imágenes de enero 2025)
			noticia-1.json
			...
		02-febrero/
			images/
				(imágenes de febrero 2025)
			...
		...
	2026/
		01-enero/
			...
		02-febrero/
			images/
				convivencia-voluntarios.jpg
				coraje2020.jpg
				guadalupe-2025.jpg
				vigilia-inmaculada.jpg
			noticia-fatima-2026.json
			noticia-ejercicios-coraje-2026.json
			noticia-guadalupe-2026.json
			noticia-convivencia-voluntarios.json
			noticia-vigilia-inmaculada-2026.json
		...
```

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
