package excecoes;

public class DescricaEmBrancoException extends Exception {
private String mensagem;
	
	public DescricaEmBrancoException() {
		
	}
	
	public DescricaEmBrancoException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;

	}
	public String toString() {
		return "Descricao Em Branco Exception!";
	} 

}
