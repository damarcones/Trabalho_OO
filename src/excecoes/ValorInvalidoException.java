package excecoes;

public class ValorInvalidoException extends Exception {
	private String mensagem;
	
	public ValorInvalidoException() {
		
	}
	
	public ValorInvalidoException(String mensagem) {
		this.mensagem = mensagem;

	}
	
	public String toString() {
		return "Valor informado � inv�lido! Digite um valor v�lido";
	} 
	
	
	

}
