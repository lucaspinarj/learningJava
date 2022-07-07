package oo.herança.teste;

import oo.herança.Heroi;
import oo.herança.Jogador;
import oo.herança.Monstro;

public class Jogo {

		public static void main(String[] args) {
			
			Jogador monstro = new Monstro();
			monstro.x = 10;
			monstro.y = 10;
			
			Jogador heroi = new Heroi(10, 11);
			
			System.out.println("jogador 1(monstro): " + monstro.vida);
			System.out.println("jogador 2(heroi): " + heroi.vida);
			
			System.out.println();
			
			monstro.atacar(heroi);
			heroi.atacar(monstro);
			
			System.out.println("jogador 1(monstro): " + monstro.vida);
			System.out.println("jogador 2(heroi): " + heroi.vida);
			
			System.out.println();
			
			monstro.x = 11;
			
			heroi.atacar(monstro);
			
			System.out.println("jogador 1(monstro): " + monstro.vida);
			System.out.println("jogador 2(heroi): " + heroi.vida);
			
		}
}
