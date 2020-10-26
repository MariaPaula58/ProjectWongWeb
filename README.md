# ProjectWongWeb

**************CONSTRUIDO CON***********

Entorno de desarrollo: Intellij, Gherkin
Lenguaje:Java
Patrón de diseño: Screenplay 
-------------Encarpetado screenplay------
Main: Interactions, models,questions, task, userinterfaces
Test: Runner, stepdefinitions: Se creó un runner y un stepdefinition para la historia de usuario.
Herramientas utilizadas: Gradle, Serenity, Cucumber.

****************CLONADO****************************
Crear carpeta donde se va clonar el proyecto.
Ruta del repositorio:  https://github.com/MariaPaula58/ProjectWongWeb.git
Ejecutar comando:
git clone https://github.com/MariaPaula58/ProjectWongWeb.git
Agregar proyecto al entorno de desarrollo y descargar las dependencias que se encuentran en el archivo Build.gradle

*************EJECUCIÓN DE LAS PRUEBAS***************

Para la ejecución de las pruebas desde el realease se debe tener el agente encendido y se deben ejecutar los stages de las pruebas E2E.
Comandos para ejecutar las pruebas por consola: 

gradle clean build -x test
gradle test
