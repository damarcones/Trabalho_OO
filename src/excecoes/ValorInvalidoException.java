package excecoes;

public class ValorInvalidoException extends Exception {
	
	public ValorInvalidoException() {
	}
	
	public ValorInvalidoException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Valor informado � invalido!\n"
				+ "Digite um valor valido";
	} 
}