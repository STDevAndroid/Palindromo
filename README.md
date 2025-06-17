# Palindromo

Aplicación Android sencilla que verifica si una palabra escrita por el usuario es un palíndromo. El proyecto sirve como ejercicio básico para familiarizarse con el ciclo de vida de una aplicación Android y la creación de interfaces simples.

📱 Proyecto hecho con:
- Java
- Android Studio Iguana
- Gradle 8.14.2 y Android Gradle Plugin 8.5.2
- Arquitectura básica MVC

🔧 Funcionalidades:
- Verificación de palíndromos desde un input
- Validaciones simples
- UI básica con `MainActivity`

📦 Estructura del proyecto:
Actualizado a Android Studio Iguana y librerías AndroidX.

## Algoritmo de validación

1. Se eliminan los espacios en blanco.
2. Se normalizan las vocales acentuadas manteniendo la letra ñ.
3. Se descartan números y caracteres que no sean letras.
4. Si el texto procesado tiene al menos dos letras, se invierte y se compara con el original.
   - Si son iguales se considera palíndromo.
   - De lo contrario no lo es y se informa al usuario.

## Despliegue en Google Play

Para publicar la aplicación en la Play Store se requiere:

1. Configurar una *keystore* para firmar el APK o AAB de lanzamiento.
2. Ejecutar `./gradlew assembleRelease` (o `bundleRelease`) para generar el archivo firmado.
3. Crear un registro de aplicación en [Google Play Console](https://play.google.com/console) y subir el artefacto generado.
4. Completar los datos de ficha, capturas de pantalla y políticas que solicita Google.
5. Enviar la primera versión para revisión.
