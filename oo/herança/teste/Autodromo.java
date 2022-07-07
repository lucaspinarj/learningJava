package oo.herança.teste;

import oo.herança.desafio.Carro;
import oo.herança.desafio.Civic;
import oo.herança.desafio.Ferrari;

public class Autodromo {

	public static void main(String[] args) {

		Ferrari f = new Ferrari();
		Carro c = new Civic();
		
		f.velAtual = 0;
		c.velAtual = 0;
		
		System.out.println(f.velAtual + "km/h");
		System.out.println(c.velAtual + "km/h");
		System.out.println();
		
		f.turbo = false;
		f.ar = true;
		
		
		f.acelerar();
		f.acelerar();
		f.acelerar();
		f.acelerar();
		f.acelerar();
		f.acelerar();
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(f.velAtual + "km/h");
		System.out.println(c.velAtual + "km/h");
		System.out.println();
		
		f.freiar();
		f.freiar();
		f.freiar();
		
		c.freiar();
		c.freiar();
		c.freiar();
		
		System.out.println(f.velAtual + "km/h");
		System.out.println(c.velAtual + "km/h");
		
		
	}

}
