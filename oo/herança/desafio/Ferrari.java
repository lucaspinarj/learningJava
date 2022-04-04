package oo.herança.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	public boolean turbo = false;
	public boolean ar = false;
	
	public Ferrari() {
		this(300);
	}

	public Ferrari(int VEL_MAX) {
		super(VEL_MAX);
		setDelta(15);
	}

//	@Override
//	public void acelerar() {
//		velAtual += 15;
//	}

	public boolean Turbo() {

		if (turbo == true) {
			return true;
		} else
			return false;

	}

	
	public boolean Ar() {

		if (ar == true) {
			return true;
		} else
			return false;

	}

	@Override
	public double getDelta() {
		if (Turbo() == true && Ar() == false) {
			return 35;
		} else if (Turbo() == true && Ar() == true) {
			return 30;
		} else if (Turbo() == false && Ar() == false) {
			return 20;
		} else
			return 15;
	}
}
