package excecao.personalizada2;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	private String nomeAt;
	
	public StringVaziaException(String nomeAt) {
		this.nomeAt = nomeAt;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está negativo.", nomeAt);
	}

}
