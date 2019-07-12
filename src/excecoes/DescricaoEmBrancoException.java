package excecoes;

public class DescricaoEmBrancoException extends Exception {
	public DescricaoEmBrancoException() {	
	}
	
	public DescricaoEmBrancoException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Descricao em branco!\n"
				+ "Digite um valor.";
	} 
}