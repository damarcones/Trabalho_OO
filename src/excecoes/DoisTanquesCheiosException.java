package excecoes;

public class DoisTanquesCheiosException extends Exception {
	public DoisTanquesCheiosException() {
	}
	
	public DoisTanquesCheiosException(String mensagem) {
		super(mensagem);
	}
	
	public String toString() {
		return 	"Tipo de relatorio indisponivel!\n"
				+ "So � possivel gerar este calculo\n"
				+ "quando h� dois abastecimentos\n"
				+ "completos (tanque cheio)";
	} 
}