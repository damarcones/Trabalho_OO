package registros;
import javax.swing.JOptionPane;

import excecoes.*;

public class RegistrarTaxa extends Despesa{
    private String CategoriaTaxa;
    
    public void RegistroTaxa() throws DescricaoEmBrancoException{
        
    }
    public RegistrarTaxa(Despesa d) {

    	try{
    		setData(d.getData());
    		setNome(d.getNome());
    		setValorTotal(d.getValorTotal());
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
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
		
		} catch(DescricaoEmBrancoException e) {
			throw e;
		}
    	
    }
    public static RegistrarTaxa init() {
		RegistrarTaxa taxa = null;
		
		try {
			taxa = new RegistrarTaxa(Despesa.init());
			taxa.setCategoriaTaxa(JOptionPane.showInputDialog("A despesa é imposto ou particular?: "));
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
		
		}return taxa;
	}

	public String toString() {
		return "RegistrarTaxa [Categoria da Taxa: " + CategoriaTaxa + ","
							+ "\ntoString()=" + super.toString() + "]";
	}
}
