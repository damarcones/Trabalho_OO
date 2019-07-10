package registros;
import javax.swing.JOptionPane;
import excecoes.*;


import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {
    private int TipoCombustivel;
    private double ValorCombustivel;
    private int KmAtual;
    private int KmAnterior;
    private int TanqueCheio;
    private double Litros;
    Veiculo v;

    public int getKmAnterior() {
        return KmAnterior;
    }
    
    
    public RegistrarAbastecimento(){
   	 
	}


	public double getLitros() {
		return Litros;
	}


	public void setLitros(double litros) throws ValorInvalidoException{
		try{
            if(ValorCombustivel>0){
                this.Litros=litros;
            }
            throw new ValorInvalidoException();
           
        }catch(ValorInvalidoException e){
            throw e ;
        }
	}


	
    public int getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(int TipoCombustivel) throws ValorInvalidoException {
        try{
            if(TipoCombustivel != 1 || TipoCombustivel != 2 || TipoCombustivel != 3) {
				throw new ValorInvalidoException();
            }
            
        }catch(Exception e){
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

    public int getTanqueCheio() {
        return TanqueCheio;
    }

    public void setTanqueCheio(int TanqueCheio) throws ValorInvalidoException  {
        try{
            if(TanqueCheio == 0 || TanqueCheio == 0){//<<<<<========== MUdar ta errado
               this.TanqueCheio=TanqueCheio;
            }
            throw new ValorInvalidoException();
            
        }catch(ValorInvalidoException e){
            throw e;
        }
    }

    public String toString() {
    return "\nABASTECIMENTO: "
    		+ "\nTipo do combustivel: " + TipoCombustivel
        	+ "\nValor do combustivel: " + ValorCombustivel
			+ "\nQuilometragem atual: " + KmAtual
			+ "\nTanque cheio? " + TanqueCheio;
		}
    
    public static RegistrarAbastecimento init() {
    	RegistrarAbastecimento abastecimento = null;
    	int tanque, tipo;
    	double valorCombustivel, valorTanque, litros;
    	int kmAtual;
    	try {
    		abastecimento = new RegistrarAbastecimento();
    		abastecimento.setNome("Abastecimento\n");
    		tipo = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Combustivel Abastecido"+
    																		"1) Gasolina\n"+
    																		"2) Acool\n"+
    																		"3) Diesel\n"+
    																		"Digite um numero."));
    		abastecimento.setTipoCombustivel(tipo);
    		tanque = Integer.parseInt(JOptionPane.showInputDialog("Tanque cheio?"));
    		abastecimento.setTanqueCheio(tanque);
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
