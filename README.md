# Taller 5 – Ordenación Básica en Java

Este repositorio contiene la implementación de tres algoritmos clásicos de ordenación: **Burbuja**, **Selección** e **Inserción**. El proyecto forma parte de la práctica de la asignatura Estructura de Datos y tiene como objetivo analizar, comparar y validar el comportamiento de los métodos de ordenación sobre distintos tipos de arreglos.



## 1. Objetivo de la práctica
Implementar y comparar tres algoritmos de ordenación **in-place** sobre arreglos pequeños, y validar su funcionamiento con **trazas** y **casos de prueba reproducibles**.

## 2. Equipos y herramientas utilizadas
- **JDK OpenJDK** (obligatorio).  
- **IDE:** IntelliJ IDEA Community o Visual Studio Code (Extension Pack for Java).  
- **Sistema de control de versiones:** Git + repositorio GitHub.  
- **EVA/Moodle institucional** para entrega de evidencias.  
- **Herramientas de documentación:** README 

---

##  3. Estructura del Proyecto


```
Burbuja_Seleccion_Inserccion/
├── .idea/
└── src/
    └── main/
        └── java.u2.sorting/
                        ├── BubbleSort.java
                        ├── InsertionSort.java
                        ├── Main.java
                        └── SelectionSort.java
```
## 4. Casos Borde y Pruebas (Validación)

Se validó el correcto funcionamiento de los algoritmos de ordenamiento probando los siguientes casos límite:

| Caso Borde | Dataset de Prueba | Situación | Manejo del Algoritmo |
| :--- | :--- | :--- | :--- |
| **Arreglo Vacío** | `F = {}` | No hay elementos para ordenar. | Los bucles `for` no se ejecutan porque las condiciones iniciales no se cumplen (longitud es 0). El programa no lanza errores. |
| **Arreglo de Tamaño 1** | `G = {1}` | Solo hay un elemento, por lo que ya está ordenado. | Los bucles no realizan iteraciones significativas ni comparaciones. El programa no realiza *swaps* ni movimientos. |
| **Arreglo Ya Ordenado** | `H = {1, 2, 3, 4, 5, 6}` | El arreglo está en orden ascendente. | Los algoritmos realizan las iteraciones necesarias para verificar el orden, pero **no ejecutan *swaps* ni movimientos** (condiciones de intercambio no se cumplen). |
| **Arreglo en Orden Inverso** | `I = {6, 5, 4, 3, 2, 1}` | Requiere el máximo número de operaciones para ordenarse (peor caso). | Los algoritmos realizan **todas las iteraciones y *swaps*** necesarios para ordenar el arreglo. |
| **Arreglo con Duplicados** | `D = {2, 2, 2, 2, 2}` / `J = {5, 4, 4, 3, 3, 2, 1}` | Los elementos duplicados no afectan el orden. | Los algoritmos no realizan *swaps* innecesarios cuando los elementos son iguales, ya que las condiciones de intercambio no se cumplen. |

---

## 5. Ejecucion y pruebas de consola

### 5.1 BubbleSort:
<img width="745" height="455" alt="image" src="https://github.com/user-attachments/assets/fcf678e5-f3ef-48a6-9a2d-9bdf7ba69c83" />

**Arreglo Inicial :** El arreglo que comienza la ordenación es **`[4, 3, 2, 1, 5]`**.

| Pasada | Iteración Actual (Estado del Arreglo) | Lógica de Bubble Sort |
| :---: | :--- | :--- |
| **Pasada 1** | `4 3 2 1 5` | El número **5** se mueve al final. El elemento más grande queda fijo en la última posición. |
| **Pasada 2** | `3 2 1 4 5` | El número **4** se mueve a la penúltima posición. Ahora `[4, 5]` está ordenado. |
| **Pasada 3** | `2 1 3 4 5` | El número **3** se mueve a su posición. Ahora `[3, 4, 5]` está ordenado. |
| **Pasada 4** | `1 2 3 4 5` | El número **2** se mueve a su posición. El arreglo ha quedado completamente ordenado. |
#### Total de iteraciones en Bubble Sort = `10`
#### Total de swaps en Bubble Sort = `10`

### 5.2 SelectionSort:
<img width="558" height="550" alt="image" src="https://github.com/user-attachments/assets/225b3527-9a50-4f7a-a304-0624496c2629" />


**Arreglo Inicial :** El arreglo que comienza la ordenación es **`[4, 3, 2, 1, 5]`**.

| Iteración | Buscando Mínimo desde | Estado Actual del Arreglo | Lógica de Selection Sort |
| :---: | :---: | :--- | :--- |
| **Iteración 1** | Posición 0 | `1 4 3 2 5` | El mínimo (1) se encuentra y se intercambia con la posición inicial (4). El 1 queda fijo. |
| **Iteración 2** | Posición 1 | `1 2 3 4 5` | El mínimo (2) se encuentra y se intercambia con la posición 1 (el 3). El 2 queda fijo. |
| **Iteración 3** | Posición 2 | `1 2 3 4 5` | El mínimo (3) ya está en la posición 2. No se realiza intercambio (*swap*). |
| **Iteración 4** | Posición 3 | `1 2 3 4 5` | El mínimo (4) ya está en la posición 3. No se realiza intercambio. |

#### Total de iteraciones en Selection Sort = `10`
#### Total de swaps en Selection Sort = `2`

### 5.3 InsertionSort
<img width="509" height="515" alt="image" src="https://github.com/user-attachments/assets/f7fc3acb-1961-44ae-85a2-3dbec4bf70a7" />

**Arreglo Inicial :** El arreglo que comienza la ordenación es **`[5, 4, 3, 2, 1]`** (asumiendo el peor caso, orden inverso).

| Iteración | Insertando | Estado Actual del Arreglo | Lógica de Insertion Sort |
| :---: | :---: | :--- | :--- |
| **Iteración 1** | 4 | `4 5 3 2 1` | Se toma el `4` y se inserta antes del `5`. El subarreglo ordenado es `[4, 5]`. |
| **Iteración 2** | 3 | `3 4 5 2 1` | Se toma el `3` y se inserta en su posición, desplazando los elementos mayores (`4`, `5`). |
| **Iteración 3** | 2 | `2 3 4 5 1` | Se toma el `2` y se inserta en la posición correcta, desplazando los elementos mayores. |
| **Iteración 4** | 1 | `1 2 3 4 5` | Se toma el `1` y se inserta al inicio. El arreglo queda completamente ordenado. |

#### Total de iteraciones en Insertion Sort = `10`

## 6. Comparación Cualitativa de Rendimiento

Esta sección resume el comportamiento observado de los algoritmos de ordenación en términos de intercambios (*swaps*) y movimientos de elementos, lo cual es relevante para la eficiencia.

| Algoritmo | Mejor Caso (Array Ordenado) | Peor Caso (Array Inverso) | Métrica Clave y Comportamiento |
| :--- | :--- | :--- | :--- |
| **Bubble Sort** | **Total de iteraciones = 10** | **Total de iteraciones = 10** | **Intercambios:** Realiza más *swaps* en casos desordenados. |
| **Selection Sort** | **Total de iteraciones = 10** | **Total de iteraciones = 10** | **Intercambios:** Diseñado para **minimizar *swaps*** (solo 2 *swaps* observados), sacrificando el tiempo de comparación. |
| **Insertion Sort** | **Total de iteraciones = 10** | **Total de iteraciones = 10** | **Movimientos:** Sumamente eficiente en casos **casi ordenados**. Realiza el **máximo de movimientos** en el caso inverso. |

---

> ### Conclusión de la Comparación
>
> Aunque los tres algoritmos tienen la misma complejidad en términos de comparaciones, la diferencia está en la **cantidad de trabajo interno** (movimientos o *swaps*):
>
> * **Selection Sort** es preferible cuando el costo de mover datos es muy alto, ya que **minimiza los intercambios**.
> * **Insertion Sort** es superior cuando el arreglo ya está casi ordenado (su mejor caso).
> * **Bubble Sort** es el menos eficiente en el peor caso, pero su **corte temprano** (optimización) lo mejora en el mejor caso.

---

## 7. Requisitos previos

Antes de ejecutar el proyecto, asegúrate de contar con el siguiente entorno:

| Componente | Versión recomendada | Descripción |
|-------------|---------------------|--------------|
| **Java JDK** | **24 (OpenJDK 24)** | Requerido para compilar y ejecutar el proyecto. Puede descargarse desde [Open JDK]([https://jdk.java.net/25/](https://openjdk.org/projects/jdk/24/)). |
| **Maven** | 3.9.x o superior | Maneja dependencias y estructura del proyecto. |
| **IDE recomendado** | [Visual Studio Code](https://code.visualstudio.com/) con extensión *Extension Pack for Java* | Permite editar, compilar y ejecutar fácilmente. También puedes usar IntelliJ IDEA o Eclipse. |
| **Sistema operativo** | Windows / Linux / macOS | Compatible con cualquier entorno que soporte JDK 25. |

>  **Nota:** Asegúrate de tener configurada la variable de entorno `JAVA_HOME` apuntando al directorio donde está instalado el JDK 25, y de incluir `%JAVA_HOME%\bin` en el `PATH`.

---

## 8. Guía de Ejecución

Sigue estos pasos para descargar, configurar y ejecutar el proyecto:

### 1. Clonar el Repositorio

Abre tu terminal (o la consola integrada de tu IDE) y ejecuta el siguiente comando para clonar el proyecto desde GitHub:

```bash
git clone [https://github.com/JuanCalopinoo/Ordenacion_en__Java.git](https://github.com/JuanCalopinoo/Ordenacion_en__Java.git)
cd Ordenacion_en__Java
```
---

### 8.1 Importar en el IDE

> Abre **IntelliJ IDEA** o **Visual Studio Code**.
>
> Importa el proyecto `Algoritmos_De_Ordenacion` como un proyecto existente (ya sea como proyecto Maven, Gradle, o simplemente una carpeta de código fuente Java).

---

### 8.2 Ejecutar la Clase Principal

El punto de entrada del programa, que inicializa los *datasets* y ejecuta las trazas de los tres algoritmos (`BubbleSort`, `SelectionSort`, `InsertionSort`), es la clase `Main.java`.

> * **Navega a la clase:** `src/main/java/ed.u2.sorting/Main.java`.
> * **Ejecuta el método main** directamente desde tu IDE (usualmente haciendo clic derecho o usando el botón de "Run").

---

### 8.3 Salida Esperada

> La consola mostrará las trazas detalladas para cada algoritmo (como se evidencia en las secciones anteriores), incluyendo el estado del arreglo por iteración y los recuentos totales de operaciones.

## **Autores:**
### [Juan Calopino](https://github.com/JuaaanCalopino)
### [Anthony Yaguana](https://github.com/Artyon-13)
      
