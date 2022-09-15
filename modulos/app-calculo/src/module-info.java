module app.calculo {

	requires transitive app.logging;

	exports br.com.lucas.app.calculo;

	exports br.com.lucas.app.calculo.interno to app.financeiro;
	
	opens br.com.lucas.app.calculo to app.financeiro;

}