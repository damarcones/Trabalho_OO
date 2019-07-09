package registros;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual;
    private boolean TanqueCheio;
    private double totalLitros;

    Despesa dep =new Despesa();
    Veiculo ve;

public void Abaster(String TC, double ValComb, int KA, boolean TQ,double ValorT) {
       try{
           if(TC==ve.getCombustiveis()){
               if(ValorT!=0){
                   if(KA>this.getKmAtual()){
                       this.setKmAtual(KA);
                       this.setValorCombustivel(ValComb);
                       dep.setValorTotal(ValorT);
                                     
                                          
                   }else{
                       System.out.println("Valor da Km errado");
                   }
               }else{
                   System.out.println("Valor nao pode ser zero");               
               }
               
           }else{
               System.out.println("Tipo de combustivel incopativel");
           }
       }
       catch(Exception e){
        
    }
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

    
    public String toString() {
    return "\n\nABASTECIMENTO:"
    		+ "Tipo do combustivel: " + TipoCombustivel
        	+ "\nValor do combustivel: " + ValorCombustivel
			+ "\nQuilometragem atual: " + KmAtual
			+ "\nTanque cheio? " + TanqueCheio
			+ super.toString();

		}
}
