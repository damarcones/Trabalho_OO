package registros;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual;
    private int KmAnterior;
    private boolean TanqueCheio;
    private boolean TanqueCheioAnterior;
    private double totalLitros;
    private double kmLitro;
    private double custoKm;

    public RegistrarAbastecimento(Veiculo v) {
        this.KmAnterior = v.getKmDoUltimoAbastecimento();
        this.TanqueCheioAnterior = v.getTanqueDoUltimoAbastecimento();
    }

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        try {
			if(TipoCombustivel.trim().equalsIgnoreCase("")||TipoCombustivel.isEmpty()||TipoCombustivel == null) {
				throw new DescricaoEmBrancoException();
			}
			this.TipoCombustivel = TipoCombustivel.trijavm();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) {
        try {
			if(ValorCombustivel <= 0.0) {
				throw new ValorInvalidoException();
			}
			this.ValorCombustivel = ValorCombustivel;
		}
		catch(ValorInvalidoException f) {
			throw f;
		}
    }

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int KmAtual) {
        try {
			if(KmAtual <= KmAnterior) {
				throw new ValorInvalidoException();
			}
            this.KmAtual = KmAtual;
		}
		catch(ValorInvalidoException f) {
			throw f;
		}
    }

    public boolean getTanqueCheio() {
        return TanqueCheio;
    }

    public void setTanqueCheio(boolean TanqueCheio) {
        this.TanqueCheio = TanqueCheio;
    }

    public void CosumoMedio(){
        if(TanqueCheio && TanqueCheioAnterior){
            int kmRodados = this.KmAtual - this.KmAnterior;
            this.custoKm = kmRodados /* getValorTotal(); /* Eu não sei como chamar o valor total abastecido aqui*/
            this.kmLitro = custoKm / ValorCombustivel;
        }
    }

    public String toString() {
    return "\n\nABASTECIMENTO:"
    		+ "Tipo do combustivel: " + TipoCombustivel
        	+ "\nValor do combustivel: " + ValorCombustivel
			+ "\nQuilometragem atual: " + KmAtual
			+ "\nTanque cheio? " + TanqueCheio
			+ super.toString();
		}
}
