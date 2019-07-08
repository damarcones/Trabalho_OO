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
    	
    	public static RegistrarManutencao init() {
    		RegistrarManutencao manutencao = null;
    		int km;
    		try {
    			manutencao = new RegistrarManutencao(Despesa.init());
    			km = Integer.parseInt(JOptionPane.showInputDialog("Informe o Km atual"));
    			manutencao.setKmAtual(km);
    		}
    		catch(Exception e) {
    			JOptionPane.showMessageDialog(null,e);
    		}
    		
    		return manutencao;
    	}

		public String toString() {
		return "RegistrarManutencao [Quilometragem atual: " + kmAtual + ","
									+ "toString()=" + super.toString() + "]";
		} 
}
