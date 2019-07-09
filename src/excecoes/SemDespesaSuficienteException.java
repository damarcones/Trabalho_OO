package excecoes;

public class SemDespesaSuficienteException extends Exception {
	public SemDespesaSuficienteException() {
	}
	
	public SemDespesaSuficienteException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Nao ha despesa de abastecimento suficiente\n"+
				"Por favor, faca dois abastecimento para calcular o desempenho";
	} 
}
