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
	return "Tipo de combust�vel inv�lido! Informe um combust�vel v�lido.";
	} 

}
