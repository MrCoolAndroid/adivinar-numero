package juego;

import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	private static Scanner scanner;
	
	public static void main(String[] args) throws IOException
	{
		scanner = new Scanner(System.in);
		boolean terminarPrograma = false;
		boolean estado = false;
		String entrada;
		System.out.println("¡Bienvenido al juego de adivinar el numero!");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Usted tendrá 5 intentos para adivinar el numero, si los falla todos ¡perderá!");
		System.out.println("");
		System.out.println("Presione cualquier tecla para empezar ¡Buena suerte!");
		System.out.println("");
		System.in.read();
		estado = Adivinar();
		while (!terminarPrograma)
		{
			if (estado)
			{
				System.out.println("¡Juego terminado! ¿Desea continuar? (Y/N)");
				entrada = scanner.next().toLowerCase();
				if (entrada.equals("y") || entrada.equals("yes"))
				{
					estado = Adivinar();
				}
				else if (entrada.equals("n") || entrada.equals("no"))
				{
					System.out.println("¡Adios! Cerrando programa...");
					terminarPrograma = true;
				}
				else 
				{
					System.out.println("No entendí... Intentalo de nuevo");
				}
			}
			else 
			{
				estado = Adivinar();
			}
		}
		scanner.close();
	}
	
	private static boolean Adivinar()
	{
		System.out.println("");
		Arbitro arbitro = new Arbitro();
		boolean puedeContinuar = true;
		System.out.println("¿Cual es el numero? Escribelo y presiona Enter (" + arbitro.getRango() + ")");
		scanner.nextLine();
        try 
        {
        	while (puedeContinuar)
        	{
        		String entrada = scanner.next();
                int numero = Integer.parseInt(entrada);
                try 
                {
                    if (arbitro.AdivinarNumero(numero))
                    {
                    	System.out.println("");
                    	System.out.println("¡Enhorabuena! Has adivinado el numero");
                    	System.out.println("");
                    	return true;
                    }
                    else 
                    {
                    	System.out.println("");
                    	if (arbitro.getIntentos() >= 2)
                    	{
                    		System.out.println("¡Incorrecto! Te quedan " + arbitro.getIntentos() + " intentos");
                    	}
                    	else if (arbitro.getIntentos() == 1)
                    	{
                    		System.out.println("¡Incorrecto! ¡Ultimo intento!");
                    	}
                    	if (arbitro.CalcularProximidad(numero) >= 3)
                    	{
                    		System.out.println("¡Estas lejos! Intenta otro numero mas cercano");
                    		System.out.println("");
                    	}
                    	else 
                    	{
                    		System.out.println("¡Estas cerca! Intenta otro numero mas cercano");
                    		System.out.println("");
                    	}
                    }
                }
                catch (Exception e)
                {
                	System.out.println("");
                	System.out.println("¡Incorrecto! ¡Ya no quedan mas intentos!");
                	puedeContinuar = false;
                }
        	}
        	return true;
        } 
        catch (NumberFormatException e) 
        {
            System.err.println("¡No has ingresado un numero! Intentalo de nuevo");
            return false;
        }
		
	}

}
