package excecoes;

public class CombustivelInvalidoException extends Exception {

	public CombustivelInvalidoException() {
	}

	public CombustivelInvalidoException(String mensagem) {
		super(mensagem);
	}

	public String toString() {
		return "Tipo de combustivel invalido!\n" + "Informe um combustivel valido.";
	}
}