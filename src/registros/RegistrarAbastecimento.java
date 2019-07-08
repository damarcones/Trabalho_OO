package registros;
import excecoes.*;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual;
    private boolean TanqueCheio;


    public void Abastecimento() {
        
    }

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) {
        this.ValorCombustivel = ValorCombustivel;
    }

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int KmAtual) {
        this.KmAtual = KmAtual;
    }

    public boolean getTanqueCheio() {
        return TanqueCheio;
    }

    public void setTanqueCheio(boolean TanqueCheio) {
        this.TanqueCheio = TanqueCheio;
    }

	@Override
	public String toString() {
		return "RegistrarAbastecimento [TipoCombustivel=" + TipoCombustivel + ", ValorCombustivel=" + ValorCombustivel
				+ ", KmAtual=" + KmAtual + ", TanqueCheio=" + TanqueCheio + "]";
	}
    
	public 
}
