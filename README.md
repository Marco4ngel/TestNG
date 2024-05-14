# TestNG

TestNG es un framework de pruebas unitarias, para Java, es una alternativa a `JUnit5` ya que es más flexible y
soluciona muchas de sus carencias:

- Flexibilidad en las anotaciones:
- Permite agrupar las pruebas:
- Ejecuta pruebas en paralelo:
- Generación de informes detallados:
- Definir el contexto de la prueba:
- Integración con otras herramientas

## Instrucciones (IntelliJ)

- Paso 1: Crear un nuevo projecto y entrar al apartado de `plugins`
- Paso 2: Buscar e instalar `TestNG` (puede estar instalado por defecto)
- Paso 3: Buscar la librería de `TestNG` en [maven repository](https://mvnrepository.com/artifact/org.testng/testng)
- Paso 4: Descarga la última versión y copia el texto

<div align="left">
  <img src="img/mvn_repo.png" alt="Descarga la librería" width="450">
</div>

- Paso 5: Agrega la librería al proyecto

<div align="left">
  <img src="img/testNG_libreria.png" alt="Importar la librería" width="500">
</div>

- Paso 6: Crea una clase para realizar los test
- Paso 7: Una vez creada la clase con sus métodos genera tests

<div align="left">
  <img src="img/clase_calculadora.png" alt="Clase calculadora" width="400">
</div>

<div align="left">
  <img src="img/generar_test.png" alt="Generar un test" width="350">
  <img src="img/generar_test2.png" alt = "Generar un test">
</div>

- Paso 8: Una vez generados los test, introduce los métodos correspondientes 
<div align="left">
  <img src="img/clase_test.png" alt = "Generar un test">
  <img src="img/tests.png" alt = "distintos tests" width="300">
</div>

- Paso 9: Ejecuta los test y comprueba que su comportamiento es correcto