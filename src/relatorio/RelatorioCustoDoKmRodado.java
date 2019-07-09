package relatorio;
import registros.*;
import excecoes.DoisTanqueCheioVerdadeiroException;

public class RelatorioCustoDoKmRodado {
   //private Desempenho.Abastecimento
    private double KmLitro;
    private double CustoKm;
    private int KmAtual;
    private int KmAnterior;
    private double valor;
    
    public void MediaConsumo(RegistrarAbastecimento atual, RegistrarAbastecimento anterior) throws DoisTanqueCheioVerdadeiroException{
    	try {
    		if(atual.getTanqueCheio() && anterior.getTanqueCheio()){
	    		setKmAtual(atual.getKmAtual());
	    		setKmAnterior(anterior.getKmAtual());
	    		int kmRodados = this.KmAtual - this.KmAnterior;
	    		setCustoKm(kmRodados / atual.getValorTotal()); /* Custo de Km rodados é igual a KmRodados divido pelo valor total do abastecimento */
	    		setKmLitro(getCustoKm() / atual.getValorCombustivel()); /* Km por Litro é igual a Custo por Km, dividido pelo valor do ultimo abastecimento */
	    	}
    		else{
    			throw new DoisTanqueCheioVerdadeiroException();
    		}
    	}catch(DoisTanqueCheioVerdadeiroException e) {
    		throw e;
    	}
    	
    }

    public double getKmLitro() {
        return KmLitro;
    }

    public void setKmLitro(double KmLitro) {
        this.KmLitro = KmLitro;
    }

    public double getCustoKm() {
        return CustoKm;
    }

    public void setCustoKm(double CustoKm) {
        this.CustoKm = CustoKm;
    }

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int KmAtual) {
        this.KmAtual = KmAtual;
    }

    public int getKmAnterior() {
        return KmAnterior;
    }

    public void setKmAnterior(int KmAnterior) {
        this.KmAnterior = KmAnterior;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
