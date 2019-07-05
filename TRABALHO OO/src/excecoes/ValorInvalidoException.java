package excecoes;

public class ValorInvalidoException extends Exception {
	private String mensagem;
	
	public ValorInvalidoException() {
		
	}
	
	public ValorInvalidoException(String m) {
		this.mensagem = m;

	}
	
	public String toString() {
		return "ValorInvalidoException" + mensagem;
	} 
	
	
	

}
