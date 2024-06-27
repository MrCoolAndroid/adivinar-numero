package juego;

public class Numeracion 
{
	// Atributos
	private int numero;
	private String rango;
	private int intentos;
	
	// Constructor
	public Numeracion(int numero, String rango, int intentos) 
	{
		this.numero = numero;
		this.rango = rango;
		this.intentos = intentos;
	}
	
	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
}
