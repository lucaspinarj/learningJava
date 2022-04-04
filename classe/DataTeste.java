package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(21, 9, 2000);
//		d1.dia = 21;
//		d1.mes = 9;
//		d1.ano = 2000;
		
		
		var d2 = new Data();
//		d2.dia = 25;
//		d2.mes = 12;
//		d2.ano = 2021;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println();
		System.out.println(d2.obterDataFormatada());
		
		
		
		
	}
}
