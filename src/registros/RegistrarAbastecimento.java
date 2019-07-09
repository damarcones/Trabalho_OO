package registros;
import javax.swing.JOptionPane;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {
    private String TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual,KmAnterior;
    private boolean TanqueCheio;
    private double litros;
    

	public double getLitros() {
		return litros;
	}


	public void setLitros(double litros) throws ValorInvalidoException{
		try{
            if(ValorCombustivel>0){
                this.litros=litros;
            }
            throw new ValorInvalidoException();
           
        }catch(ValorInvalidoException e){
            throw e ;
        }
	}


	public RegistrarAbastecimento()throws DescricaoEmBrancoException{
	 
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

    public void setTanqueCheio(boolean TanqueCheio) throws ValorInvalidoException  {
        try{
            if(TanqueCheio==true || TanqueCheio==false){//<<<<<========== MUdar ta errado
               this.TanqueCheio=TanqueCheio;
            }
            throw new ValorInvalidoException();
            
        }catch(ValorInvalidoException e){
            throw e;
        }
    }

    public String toString() {
    return "RegistrarAbastecimento [Tipo do combustivel: " + TipoCombustivel + ","
        	+ "\nValor do combustivel: " + ValorCombustivel + ","
			+ "\nQuilometragem atual: " + KmAtual + ","
			+ "\nTanque cheio? " + TanqueCheio + "]";
		}
    
    public static RegistrarAbastecimento init() {
    	RegistrarAbastecimento abastecimento = null;
    	boolean bool;
    	double tanque, valorCombustivel, valorTanque, litros;
    	int kmAtual;
    	try {
    		abastecimento = new RegistrarAbastecimento();
    		abastecimento.setNome("Abastecimento\n");
    		abastecimento.setTipoCombustivel(JOptionPane.showInputDialog("Combustivel Abastecido"));
    		bool = Boolean.parseBoolean(JOptionPane.showInputDialog("Tanque cheio?"));
    		abastecimento.setTanqueCheio(bool);
    		kmAtual = Integer.parseInt(JOptionPane.showInputDialog("Quilometragem atual"));
    		abastecimento.setKmAtual(kmAtual);
    		valorCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Valor do litro"));
    		abastecimento.setValorCombustivel(valorCombustivel);
    		valorTanque = Double.parseDouble(JOptionPane.showInputDialog("Valor total do abastecimento"));
    		abastecimento.setValorCombustivel(valorTanque);
    		litros = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de litros"));
    		abastecimento.setLitros(litros);
    		
    	}
	    catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null	,"Digite um valor válido!");
	    }
		
		catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
		}
    	return abastecimento;
    }
}
