package registros;
import excecoes.*;

public class RegistrarTaxa extends Despesa{
    private String CategoriaTaxa;
    
    public void RegistroTaxa() throws DescricaoEmBrancoException{
        
    }

    public String getCategoriaTaxa() {
        return CategoriaTaxa;
    }

    public void setCategoriaTaxa(String CategoriaTaxa) {
        this.CategoriaTaxa = CategoriaTaxa;
    }
    
    
}
