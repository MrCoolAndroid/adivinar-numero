Juego de Adivinar el Número
===========================

Este es un juego simple de consola en Java donde el jugador intenta adivinar un número generado aleatoriamente dentro de un rango especificado.

Funcionalidad del Juego
-----------------------

El juego funciona de la siguiente manera:

1.  **Inicio del Juego:**
    
    *   Al iniciar el programa, se muestra un mensaje de bienvenida y las instrucciones básicas del juego.
    *   El jugador tiene 5 intentos para adivinar el número correctamente.
2.  **Jugando el Juego:**
    
    *   El programa genera un número aleatorio dentro de un rango específico (configurable).
    *   El jugador introduce un número y el programa indica si es correcto o no.
    *   El programa además indica si el número que introdujo esta cerca o lejos del numero a adivinar.
    *   Si el jugador no adivina el número en 5 intentos, el juego termina.
3.  **Continuación del Juego:**
    
    *   Después de cada juego completado (ya sea adivinando el número o agotando los intentos), se pregunta al jugador si desea jugar nuevamente.
    *   El jugador puede elegir continuar o salir del juego.

Capturas de Pantalla
--------------------
_Pantalla principal_

![image](https://github.com/MrCoolAndroid/adivinar-numero/assets/63800330/1d57a771-3eb8-41bd-a1ce-ed5b8011fd0f)


_Pantalla general del juego_

![image](https://github.com/MrCoolAndroid/adivinar-numero/assets/63800330/c8fb8cc6-7d06-4538-86e4-863dbc0ccbf3)


_Numero adivinado_

![image](https://github.com/MrCoolAndroid/adivinar-numero/assets/63800330/fbf489bb-58fe-4861-8e01-ed5e86335660)



Analisis Tecnico
----------------
Este proyecto hace uso extensivo de bucles (while) para controlar el flujo de juego, permitiendo al jugador intentar adivinar el número objetivo dentro de un número limitado de intentos.
Utiliza el paradigma de programación orientada a objetos (POO) de Java, con clases como `Main` y `Arbitro` para encapsular la lógica del juego y mantener el estado del mismo.
Además utiliza `try-catch` para metodos donde pueden ocurrir errores y asi evitarlos.
