package registros;
import excecoes.*;
import veiculo.Veiculo;

public class RegistrarManutencao extends Despesa{
    private int kmAtual;

    public RegistrarManutencao() throws DescricaoEmBrancoException {
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
    	
    
}
