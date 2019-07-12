
package registros;
import javax.swing.JOptionPane;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarManutencao extends Despesa{
    private int kmAtual;

    public RegistrarManutencao() throws DescricaoEmBrancoException {
    	
    }

    public RegistrarManutencao(Despesa d) {
    
    	try{
    		setData(d.getData());
    		setNome(d.getNome());
    		setValorTotal(d.getValorTotal());
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    
    }
    	public int getKmAtual() {
    		return kmAtual;
    	}
    	public void setKmAtual(int kmAtual) throws DescricaoEmBrancoException {
    		try {
    			if(kmAtual == 0) {
    				throw new DescricaoEmBrancoException();
			}
			this.kmAtual = kmAtual;
    		}
    		catch(DescricaoEmBrancoException e) {
    			throw e;
    		}
    	}
    	
    	public static RegistrarManutencao init(Veiculo v) {
    		RegistrarManutencao manutencao = null;
    		int km;
    		while(true) {
	    		try {
	    			manutencao = new RegistrarManutencao(Despesa.init());
	    			km = Integer.parseInt(JOptionPane.showInputDialog("Informe a quilometragem atual"));
	    			manutencao.setKmAtual(km);
	    		}
	    		catch(Exception e) {
	    			JOptionPane.showMessageDialog(null,e);
	    		}
	    		if(manutencao.getKmAtual() != 0)
	    			break;
    		}
    		return manutencao;
    	}

		public String toString() {
		return "MANUTENCAO:"
				+ super.toString()
				+ "\nQuilometragem atual: " + kmAtual + "\n";
		} 
}
