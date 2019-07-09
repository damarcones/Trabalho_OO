package registros;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
<<<<<<< HEAD
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

=======
    private int KmAtual,KmAnterior;
    private boolean TanqueCheio;
    

public RegistrarAbastecimento(Veiculo v){
   // KmAnterior = v.get;
    TipoCombustivel = v.getCombustiveis();
}
 

>>>>>>> 074087f715f6d23a480a0c4a3b0ffb3beb004270
    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

<<<<<<< HEAD
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
=======
    public void setTipoCombustivel(String TipoCombustivel) throws CombustivelInvalidoException, DescricaoEmBrancoException {
        try{
            if(TipoCombustivel.trim().equalsIgnoreCase("")||TipoCombustivel.isEmpty()||TipoCombustivel == null) {
				throw new DescricaoEmBrancoException();
		}
            if(TipoCombustivel.equalsIgnoreCase(TipoCombustivel)){
                this.TipoCombustivel=TipoCombustivel;
            }
            throw new CombustivelInvalidoException();
           
        }
        catch(CombustivelInvalidoException e){
            throw e;
        }
>>>>>>> 074087f715f6d23a480a0c4a3b0ffb3beb004270
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

<<<<<<< HEAD
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
=======
    public void setValorCombustivel(double ValorCombustivel) throws ValorInvalidoException {
        try{
            if(ValorCombustivel>0){
                this.ValorCombustivel=ValorCombustivel;
            }
            throw new ValorInvalidoException();
           
        }catch(ValorInvalidoException e){
            throw e ;
        }
>>>>>>> 074087f715f6d23a480a0c4a3b0ffb3beb004270
    }

    public int getKmAtual() {
        return KmAtual;
    }

<<<<<<< HEAD
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
=======
    public void setKmAtual(int KmAtual) throws ValorInvalidoException {
        try{
            if(KmAtual>KmAnterior){//<<<<<========== MUdar ta errado
               this.KmAtual=KmAtual; 
            }
            throw new ValorInvalidoException();
            
        }catch(ValorInvalidoException e){
            throw e;
        }
>>>>>>> 074087f715f6d23a480a0c4a3b0ffb3beb004270
    }

    public boolean getTanqueCheio() {
        return TanqueCheio;
    }

    public void setTanqueCheio(boolean TanqueCheio) {
        try{
            if(TanqueCheio==true || TanqueCheio==false){//<<<<<========== MUdar ta errado
               this.TanqueCheio=TanqueCheio;
            }
            throw new ValorInvalidoException();
            
        }catch(ValorInvalidoException e){
         //   throw e;
        }
    }

<<<<<<< HEAD
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
=======
    public String toString() {
    return "RegistrarAbastecimento [Tipo do combustivel: " + TipoCombustivel + ","
        	+ "\nValor do combustivel: " + ValorCombustivel + ","
			+ "\nQuilometragem atual: " + KmAtual + ","
			+ "\nTanque cheio? " + TanqueCheio + "]";
>>>>>>> 074087f715f6d23a480a0c4a3b0ffb3beb004270
		}
}
