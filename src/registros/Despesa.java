package registros;
import javax.swing.JOptionPane;

import excecoes.*;

public class Despesa {
    
	private String nome;
    private String data;
    private double valorTotal;
    
    public void Despesas() throws DescricaoEmBrancoException{
        
    }

    	public String getNome() {
    		return nome;
    	}

    	public void setNome(String nome) throws DescricaoEmBrancoException {
    		try {
    			if(nome.trim().equalsIgnoreCase("")||nome.isEmpty()||nome == null) {
    				throw new DescricaoEmBrancoException();
    			}
    			this.nome = nome.trim();
    		
    		}
    		catch(DescricaoEmBrancoException e) {
    			throw e;
    		}
    	}

    	public String getData() {
    		return data;
    	}

    	public void setData(String data) throws DescricaoEmBrancoException {
    		try {
    			if(data.trim().equalsIgnoreCase("")||data.isEmpty()||data == null) {
    				throw new DescricaoEmBrancoException();
    			}
    			this.data = data.trim();
    		
    		}
    		catch(DescricaoEmBrancoException e) {
    			throw e;
    		}
    	}

    	public double getValorTotal() {
    		return valorTotal;
    	}

    	public void setValorTotal(double valorTotal) throws ValorInvalidoException {
    		try {
    			if(valorTotal <= 0.0) {
    				throw new ValorInvalidoException();
    			}
    			this.valorTotal = valorTotal;
 	
    		}
    		catch(ValorInvalidoException f) {
    			throw f;
    		}
    	} 
public static Despesa init() {
    		Despesa despesas = null;
    		
    		try {}
    		
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null	,"Digite um valor válido!");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
			}
    	}
}
