package excecoes;

public class ValorInvalidoException extends Exception {
	private String mensagem;
	
	public ValorInvalidoException() {
		
	}
	
	public ValorInvalidoException(String m) {
		this.mensagem = m;

	}
	
	public String toString() {
		return "Valor informado � inv�lido! Digite um valor v�lido";
	} 
	
	
	

}
