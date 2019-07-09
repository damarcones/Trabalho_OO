package excecoes;

public class DescricaoEmBrancoException extends Exception {
	
	public DescricaoEmBrancoException() {	
	}
	
	public DescricaoEmBrancoException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Descrição em branco!\n"
				+ "Digite um valor.";
	} 
}