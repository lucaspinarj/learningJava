package excecao.personalizada;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	
	private String nomeAt;
	
	public NumeroForaIntervaloException(String nomeAt) {
		this.nomeAt = nomeAt;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", nomeAt);
	}

}
