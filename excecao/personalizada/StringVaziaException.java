package excecao.personalizada;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	private String nomeAt;
	
	public StringVaziaException(String nomeAt) {
		this.nomeAt = nomeAt;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está negativo.", nomeAt);
	}

}
