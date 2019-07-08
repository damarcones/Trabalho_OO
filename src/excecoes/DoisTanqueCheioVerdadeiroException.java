package excecoes;

public class DoisTanqueCheioVerdadeiroException extends Exception {
	public DoisTanqueCheioVerdadeiroException() {
	}
	
	public DoisTanqueCheioVerdadeiroException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return "Impossivel checar o desempenho do caro\n"+
				"Por favor, faca dois abastecimento completo";
	} 
}