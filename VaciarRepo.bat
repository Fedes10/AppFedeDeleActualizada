@echo off
setlocal
set REPO_URL=https://github.com/Fedes10/AppFedeDeleActualizada.git
set TEMP_DIR=limpieza_total_act

echo === VACIADO ABSOLUTO (BORRANDO README Y TODO) ===
pause

if exist %TEMP_DIR% rd /s /q %TEMP_DIR%
mkdir %TEMP_DIR%
cd %TEMP_DIR%

git init
git commit --allow-empty -m "Limpieza inicial"
git branch -M main
git remote add origin %REPO_URL%

echo [!] Borrando archivos remotos (incluido README)...
git push origin main --force

cd ..
rd /s /q %TEMP_DIR%

echo === REPO ACTUALIZADA VACIADO ===
timeout /t 5
exit