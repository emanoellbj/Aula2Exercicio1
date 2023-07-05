
public class Circulo extends Forma{
	private double raio;

	@Override
	public double calcularArea() {
		return Math.PI*(Math.pow(getRaio(),2));
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*getRaio();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
