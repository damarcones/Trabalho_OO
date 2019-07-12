package excecoes;

public class PlacaNaoCadastradaException extends Exception {
	
	public PlacaNaoCadastradaException() {
	}
	
	public PlacaNaoCadastradaException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Placa n�o cadastrada!\n"
				+ "Por favor, digite uma placa v�lida";
	} 
}
