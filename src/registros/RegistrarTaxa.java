package registros;
import excecoes.*;

public class RegistrarTaxa extends Despesa{
    private String CategoriaTaxa;
    
    public void RegistroTaxa() throws DescricaoEmBrancoException{
        
    }

    public String getCategoriaTaxa() {
        return CategoriaTaxa;
    }

    public void setCategoriaTaxa(String CategoriaTaxa) throws DescricaoEmBrancoException {
    	try {
			if(CategoriaTaxa.trim().equalsIgnoreCase("")||CategoriaTaxa.isEmpty()||CategoriaTaxa == null) {
				throw new DescricaoEmBrancoException();
			}
			this.CategoriaTaxa = CategoriaTaxa.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
    }
    
    
}
