package excecoes;

public class ValorInvalidoException extends Exception {
	
	public ValorInvalidoException() {
	}
	
	public ValorInvalidoException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Valor informado � inv�lido!\n"
				+ "Digite um valor v�lido";
	} 
}