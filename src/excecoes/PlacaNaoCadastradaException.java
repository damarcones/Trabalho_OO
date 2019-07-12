package excecoes;

public class PlacaNaoCadastradaException extends Exception {
	
	public PlacaNaoCadastradaException() {
	}
	
	public PlacaNaoCadastradaException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Placa nao cadastrada!\n"
				+ "Por favor, digite uma placa valida";
	} 
}
