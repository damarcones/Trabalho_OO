package excecoes;

public class CombustivelInvalidoException extends Exception {
private String mensagem;
	
	public CombustivelInvalidoException() {
	
	}

	public CombustivelInvalidoException(String mensagem) {
	super(mensagem);
	this.mensagem = mensagem;
	}
	
	public String toString() {
	return "Tipo de combustível inválido! Informe um combustível válido.";
	} 

}
