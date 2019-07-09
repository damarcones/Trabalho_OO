package excecoes;

public class CombustivelInvalidoException extends Exception {
	
	public CombustivelInvalidoException() {
	}

	public CombustivelInvalidoException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Tipo de combust�vel inv�lido!\n"
			+ "Informe um combust�vel v�lido.";
	} 
}