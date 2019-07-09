package registros;
import excecoes.*;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual;
    private boolean TanqueCheio;


public void Abaster(String TC, double VC, int KA, boolean TQ) {
       try{
           if(TC=="G"){
               if(TQ==true){
                   this.KmAtual=KA;
                   this.TanqueCheio=TQ;
                   this.TipoCombustivel=TC;
                   this.ValorCombustivel=VC;
               }else{
               this.KmAtual=KA;
               this.TanqueCheio=TQ;
               this.TipoCombustivel=TC;
               this.ValorCombustivel=VC;    
               
               }
               
           }else{
               
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
			return "\nABASTECIMENTO:"
					+ "\nTipo do combustivel: " + TipoCombustivel
					+ "\nValor do combustivel: " + ValorCombustivel
					+ "\nQuilometragem atual: " + KmAtual
					+ "\nTanque cheio? " + TanqueCheio
					+ "\n-------------------------------------";
		}
}
