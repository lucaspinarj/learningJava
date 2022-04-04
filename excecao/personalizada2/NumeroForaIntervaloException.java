package excecao.personalizada2;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeAt;
	
	public NumeroForaIntervaloException(String nomeAt) {
		this.nomeAt = nomeAt;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", nomeAt);
	}

}
