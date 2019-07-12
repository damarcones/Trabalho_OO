package registros;

import javax.swing.JOptionPane;
import excecoes.*;

import veiculo.Veiculo;

public class RegistrarAbastecimento extends Despesa {

	private int TipoCombustivel;
	private double ValorCombustivel;
	private int KmAtual, KmAnterior;
	private int TanqueCheio;

	Veiculo v;


    public RegistrarAbastecimento(Veiculo v) {

		this.v = v;
		this.KmAnterior = v.getKmDoUltimoAbastecimento();
		
	}

	public RegistrarAbastecimento() {

	}

	public int getTipoCombustivel() {
		return TipoCombustivel;
	}

	public void setTipoCombustivel(int TipoCombustivel) throws ValorInvalidoException, CombustivelInvalidoException {
		try {
			if (TipoCombustivel != 1 && TipoCombustivel != 2 && TipoCombustivel != 3) {
				throw new ValorInvalidoException();
			} else if (this.v.getCombustiveis() == 4) {
				if (TipoCombustivel == 3) {
					throw new CombustivelInvalidoException();
				} else if (TipoCombustivel == 1 || TipoCombustivel == 2) {
					this.TipoCombustivel = TipoCombustivel;
				}
			} else if (TipoCombustivel != this.v.getCombustiveis()) {
				throw new CombustivelInvalidoException();
			} else {
				this.TipoCombustivel = TipoCombustivel;
			}
		} catch (Exception e) {
			throw e;
		}
	}


    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) throws ValorInvalidoException {
        try{
            if(ValorCombustivel <= 0){
            	throw new ValorInvalidoException();
            }
            this.ValorCombustivel=ValorCombustivel;
           
        }catch(ValorInvalidoException e){
            throw e ;
        }
    }

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int KmAtual) throws ValorInvalidoException {
        try{
            if(this.KmAnterior >= KmAtual){
            	throw new ValorInvalidoException();
            }
            this.KmAtual=KmAtual; 
        }catch(ValorInvalidoException e){
            throw e;
        }
    }

    public int getTanqueCheio() {
        return TanqueCheio;
    }

    public void setTanqueCheio(int TanqueCheio) throws ValorInvalidoException  {
        try{
            if(TanqueCheio != 1 && TanqueCheio != -1){
            	throw new ValorInvalidoException();
            }
            this.TanqueCheio=TanqueCheio;
        }catch(ValorInvalidoException e){
            throw e;
        }
    }

 
    //VISUALIZAR ENTRADA DE ABASTECIMENTO
    public String toString() {
        return "\nABASTECIMENTO: "
        		+ "\nTipo do combustivel: " + TipoCombustivel
            	+ "\nValor do combustivel: " + ValorCombustivel
    			+ "\nQuilometragem atual: " + KmAtual
    			+ "\nTanque cheio? " + TanqueCheio;
    		}
    

	//ENTRADA DOS VALOES EM ABASTECIMENTO
	public static RegistrarAbastecimento init(Veiculo v) {
    	RegistrarAbastecimento abastecimento = null;
    	int tanque = 0, tipo;
    	double valorCombustivel, valorTanque, litros;
    	int kmAtual = 0;
    	while(true) {
    	try {
    		abastecimento = new RegistrarAbastecimento(v);
    		abastecimento.setNome("Abastecimento\n");
    		tipo = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Combustivel Abastecido\n"+
    																		"1) Gasolina\n"+
    																		"2) Alcool\n"+
    																		"3) Diesel\n"+
    																		"Digite um numero."));
    		abastecimento.setTipoCombustivel(tipo);
    		tanque = Integer.parseInt(JOptionPane.showInputDialog("Tanque cheio?\n 1 para sim, -1 para n�o"));
    		abastecimento.setTanqueCheio(tanque);
    		kmAtual = Integer.parseInt(JOptionPane.showInputDialog("Quilometragem atual"));
    		abastecimento.setKmAtual(kmAtual);
    		valorCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Valor do litro"));
    		abastecimento.setValorCombustivel(valorCombustivel);
    		valorTanque = Double.parseDouble(JOptionPane.showInputDialog("Valor total do abastecimento"));
    		abastecimento.setValorTotal(valorTanque);

    	}
	    catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null	,"Digite um valor válido!");
	    }
		catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
		}
    	if(abastecimento.getTipoCombustivel() != 0 && abastecimento.getKmAtual() != 0
    			&& abastecimento.getValorCombustivel() != 0 && abastecimento.getValorTotal() != 0
    			&& abastecimento.getTanqueCheio() != 0 )
    		break;
    }
    	v.setKmDoUltimoAbastecimento(kmAtual);
    	v.setTanqueDoUltimoAbastecimento(tanque);
    	return abastecimento;
    }
    

}
