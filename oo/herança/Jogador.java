package oo.herança;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;

	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador oponente) {
		int X = Math.abs(x - oponente.x);
		int Y = Math.abs(y - oponente.y);

		if (X == 0 && Y == 1) {
			oponente.vida -= 10;
			return true;
		} else if (X == 1 && Y == 0) {
			oponente.vida -= 10;
			return true;
		} else
			return false;
	}

	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y--;
			break;
		case OESTE:
			x--;
		}
		return true;
	}
}
