package classe.desafio;

public class Pessoa {

	// nome
	// peso double
	// metodo comer (objeto da comida)
	// ganhar o peso da comida na pessoa

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void Comer(Comida comida) {
		this.peso += comida.peso;
	}
	
//	void comer(Comida comida) {
//		if(comida != null) {
//			this.peso += comida.peso;
//		}
//	}
}
