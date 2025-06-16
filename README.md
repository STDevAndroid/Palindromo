# Palindromo

Aplicación Android sencilla que verifica si una palabra escrita por el usuario es un palíndromo. El proyecto sirve como ejercicio básico para familiarizarse con el ciclo de vida de una aplicación Android y la creación de interfaces simples.

📱 Proyecto hecho con:
- Java
- Android Studio Electric Eel
- Arquitectura básica MVC

🔧 Funcionalidades:
- Verificación de palíndromos desde un input
- Validaciones simples
- UI básica con `MainActivity`

📦 Estructura del proyecto:
Actualizado a Android Studio Electric Eel y librerías AndroidX.

## Despliegue en Google Play

Para publicar la aplicación en la Play Store se requiere:

1. Configurar una *keystore* para firmar el APK o AAB de lanzamiento.
2. Ejecutar `./gradlew assembleRelease` (o `bundleRelease`) para generar el archivo firmado.
3. Crear un registro de aplicación en [Google Play Console](https://play.google.com/console) y subir el artefacto generado.
4. Completar los datos de ficha, capturas de pantalla y políticas que solicita Google.
5. Enviar la primera versión para revisión.
