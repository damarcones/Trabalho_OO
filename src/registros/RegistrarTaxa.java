package registros;
import javax.swing.JOptionPane;

import excecoes.*;

public class RegistrarTaxa extends Despesa{
    private String CategoriaTaxa;
    private int kmAtual;
    
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
		int km;
		while(true) {
			try {
				taxa = new RegistrarTaxa(Despesa.init());
				taxa.setCategoriaTaxa(JOptionPane.showInputDialog("A despesa é imposto ou particular?: "));
				km = Integer.parseInt(JOptionPane.showInputDialog("Informe o Km atual"));
				taxa.setKmAtual(km);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null,e);
			}
			if(taxa.getCategoriaTaxa() != null)
				break;
		}
		return taxa;
	}

	public String toString() {
		return "TAXA: " + super.toString()
				+ "\nCategoria da Taxa: " + CategoriaTaxa + "\n";
				
	}
}
