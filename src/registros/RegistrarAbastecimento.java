package registros;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual,KmAnterior;
    private boolean TanqueCheio;
    

public RegistrarAbastecimento(Veiculo v){
   // KmAnterior = v.get   ;
    TipoCombustivel = v.getCombustiveis();
}
 

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

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
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) throws ValorInvalidoException {
        try{
            if(ValorCombustivel>0){
                this.ValorCombustivel=ValorCombustivel;
            }
            throw new ValorInvalidoException();
           
        }catch(ValorInvalidoException e){
            throw e ;
        }
    }

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int KmAtual) throws ValorInvalidoException {
        try{
            if(KmAtual>KmAnterior){//<<<<<========== MUdar ta errado
               this.KmAtual=KmAtual; 
            }
            throw new ValorInvalidoException();
            
        }catch(ValorInvalidoException e){
            throw e;
        }
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

    public String toString() {
    return "RegistrarAbastecimento [Tipo do combustivel: " + TipoCombustivel + ","
        	+ "\nValor do combustivel: " + ValorCombustivel + ","
			+ "\nQuilometragem atual: " + KmAtual + ","
			+ "\nTanque cheio? " + TanqueCheio + "]";
		}
}
