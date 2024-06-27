package juego;

import java.util.Random;

public class Arbitro 
{
	// Atributos
	private Numeracion numeracion;
	private Random random;
	
	// Constructor
	public Arbitro()
	{
		this.random = new Random();
		
		int numero = random.nextInt((20 - 1) + 1) + 1;
		String rango = "Entre 1 y 20";
		int intentos = 5;
		
		this.numeracion = new Numeracion(numero, rango, intentos);
	}
	
	// Metodos para definir un numero a adivinar, el rango, etc.
	public boolean AdivinarNumero(int numero) throws Exception 
	{
		numeracion.setIntentos(numeracion.getIntentos() - 1);
		if (numeracion.getIntentos() >= 1)
		{
			if (numero == this.numeracion.getNumero())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			throw new Exception();
		}
	}
	
	public int CalcularProximidad(int numero)
	{
		return Math.abs(this.numeracion.getNumero() - numero);
	}
	
	public int getIntentos()
	{
		return numeracion.getIntentos();
	}
	
	public String getRango()
	{
		return numeracion.getRango();
	}

}
