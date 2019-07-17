package edu.educacionit;

public class CalculadorCuota {
	
	private Amortizable estrategia;

	public CalculadorCuota(Amortizable estrategia) {
		super();
		this.estrategia = estrategia;
	}
	
	public void calcular(int x) {
		estrategia.amortizar(x);
	}
}
