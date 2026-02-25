@echo off
setlocal
:: Configura aquí tu URL
set REPO_URL=https://github.com/Fedes10/AppFedeDeleActualizada.git

echo === Iniciando subida forzada a GitHub ===

:: 1. Inicializar si no existe .git
if not exist .git (
    echo [1/5] Inicializando repositorio Git...
    git init
    git remote add origin %REPO_URL%
)

:: 2. Asegurarse de que estamos en la rama 'main' (esto evita el detached HEAD)
echo [2/5] Configurando rama main...
git checkout -B main

:: 3. Anadir todos los archivos
echo [3/5] Anadiendo archivos...
git add .

:: 4. Hacer el commit con marca de tiempo
set dt=%date% %time%
echo [4/5] Creando commit: "Actualizacion forzada - %dt%"
git commit -m "Actualizacion forzada - %dt%"

:: 5. Empujar al servidor SOBREESCRIBIENDO TODO
echo [5/5] Subiendo cambios (FORZADO)...
git push -u origin main --force

echo.
echo === PROCESO COMPLETADO ===
echo La ventana se cerrara en 3 segundos...
timeout /t 3 /nobreak > nul
exit