# vPRG1

Abierta a discusión.

## Paso 000 - Puesta a punto del entorno de desarrollo

|Descripción|Archivo de avance|
|-|-|
Inicio del proceso y puesta a punto del entorno de desarrollo|Clase []() en la carpeta [/vPRG1](/)

## Paso 001 - Primera aproximación

El primer paso en la construcción de este código implica la creación de una representación del mundo propuesto en el problema, utilizando una matriz de enteros. Esta matriz simboliza diferentes niveles de suciedad en el suelo, donde los números varían desde 0, indicando un suelo limpio, hasta 5, representando un suelo altamente sucio. Además, se asigna al método `renderWorld` la tarea de visualizar esta representación. Inicialmente, este método se encarga de imprimir el estado del mundo exactamente como se encuentra definido en la matriz.

```
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 3 3 3 3 3 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 2 2 2 2 2 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 2 1 1 1 2 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 2 2 2 2 2 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 3 3 3 3 3 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
```

## Paso 002 - Renderizado "real"

Una vez definida e impresa la matriz, el siguiente paso consiste en mejorar la forma en que se visualizan los elementos. Este proceso implica "traducir" cada valor numérico que representa diferentes niveles de suciedad en el suelo a un conjunto de caracteres específicos. Estos caracteres se seleccionan cuidadosamente para proporcionar una representación gráfica más intuitiva y visualmente accesible de la suciedad en cada baldosa. Este enfoque mejora significativamente la claridad y la comprensión del estado del suelo en la matriz.

Para llevar a cabo esta mejora, se hace uso del método `renderWorld`, el cual ahora colabora estrechamente con `showTile`. El método `showTile` juega un papel crucial en esta transformación: al recibir un valor numérico de la matriz, devuelve una representación gráfica correspondiente a la baldosa, permitiendo así una visualización más detallada y comprensible del entorno simulado.

```
 .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  . OOOOOOOOOOOOOOO .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  . ooooooooooooooo .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  . ooo.........ooo .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  . ooooooooooooooo .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  . OOOOOOOOOOOOOOO .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . 
 .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . 
```
