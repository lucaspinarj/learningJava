package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	//Desafio construtor
	//construtor padrao
	//construtor dia/mes/ano
	// 1/1/1970 data padrao
	
	Data() {
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Desafio método
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	
}
