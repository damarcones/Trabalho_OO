package excecoes;

public class DescricaoEmBrancoException extends Exception {
private String mensagem;
	
	public DescricaoEmBrancoException() {
		
	}
	
	public DescricaoEmBrancoException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;

	}
	public String toString() {
		return "Descri��o em branco! Digite um valor v�lido.";
	} 

}