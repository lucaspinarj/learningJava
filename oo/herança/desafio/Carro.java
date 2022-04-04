package oo.herança.desafio;

public class Carro {

	protected final double VEL_MAX;
	public double velAtual;
	private double delta = 5;

	
	protected Carro(double velMax) {
		VEL_MAX = velMax;
	}

	public void acelerar() {
		if (velAtual + getDelta() > VEL_MAX) {
			velAtual = VEL_MAX;
		} else {
			velAtual += getDelta();
		}
	}

	public void freiar() {
		if (velAtual >= 5) {
			velAtual -= 5;
		} else {
			velAtual = 0;
		}
	}

	
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	

}
