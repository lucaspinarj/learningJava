module app.financeiro {
	
	requires java.base; // por padrão
//	requires app.calculo;
	requires app.api;
	uses br.com.lucas.app.Calculadora;
}