package registros;
import javax.swing.JOptionPane;
import excecoes.*;

public class Despesa {
    
	private String nome;
    private String data;
    private double valorTotal;
    
    public void Despesas() throws DescricaoEmBrancoException { 
    }
    
///////////////////////NOME DA DESPESA/////////////////////////
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

///////////////////////DATA DA DESPESA/////////////////////////
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

///////////////////////VALOR TOTAL/////////////////////////
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
    	
///////////////////////INIT/////////////////////////	
	//// ENTRDA DOS DADOS
    	public static Despesa init() {
    		Despesa despesas = null;
    		double valor;
    		
    		while(true) {
	    		try {
	    			despesas = new Despesa();
	    			despesas.setNome(JOptionPane.showInputDialog("Informe o nome da despesa:"));
	    			despesas.setData(JOptionPane.showInputDialog("Informe a Data:"));
	    			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
	    			despesas.setValorTotal(valor);
	    		}
	
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
	    		if(despesas.getNome() != null && despesas.getData() != null && despesas.getValorTotal() != 0)
	    			break;
    		}
			return despesas;
    	}

	//METODO PARA IMPRIMIR OS DADOS COLOCADOS
    	public String toString() {
    		return "\nNome: " + nome
    				+ "\nData: " + data
    				+ "\nValor total: " + valorTotal;
    	}
}
