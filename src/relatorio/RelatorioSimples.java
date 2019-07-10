//RELATORIO QUE MOSTRA TODOS OS REGISTROS DE TAXAS, MANUTENCOES E ABASTECIMENTOS DE UM VEICULO
package relatorio;
import excecoes.DescricaoEmBrancoException;
import javax.swing.JOptionPane;
import registros.*;
import veiculo.*;
import java.util.ArrayList;


public class RelatorioSimples {

/*********************PARA GERAR O RELATORIO DE TODOS OS ABASTECIMENTOS*********************/
	//RelatorioSimples.GerarRelatorioAbastecimento(abs);
	public static String  GerarRelatorioAbastecimento(ArrayList<RegistrarAbastecimento> abs){
            StringBuilder relatorio = new StringBuilder();
            	if(abs.size() == 0)
            		relatorio.append("N�o h� dados para gerar um relat�rio!");
            	else {
            		for(RegistrarAbastecimento a : abs) {
            			relatorio.append( "\n"+ a.toString());
            		}
            	}
            
            return relatorio.toString();
	}
	
/*********************PARA GERAR O RELATORIO DE TODOS OS ABASTECIMENTOS*********************/
	public void GerarRelatorioTaxa() throws DescricaoEmBrancoException {
//		StringBuilder relatorio = new StringBuilder();
//    	if(abs.size() == 0)
//    		relatorio.append("N�o h� relat�rio");
//    	else {
//    		for(RegistrarAbastecimento a : abs) {
//    			relatorio.append( "\n"+ a.toString());
//    		}
//    	}
//    
//    return relatorio.toString();	
	}

/*********************PARA GERAR O RELATORIO DE TODOS AS MANUTENCOES*********************/	
	public void GerarRelatorioManutencao() throws DescricaoEmBrancoException {
//		public void GerarRelatorioTaxa() throws DescricaoEmBrancoException {
//			StringBuilder relatorio = new StringBuilder();
//	    	if(abs.size() == 0)
//	    		relatorio.append("N�o h� relat�rio");
//	    	else {
//	    		for(RegistrarAbastecimento a : abs) {
//	    			relatorio.append( "\n"+ a.toString());
//	    		}
//	    	}
//	    
//	    return relatorio.toString();	
	}

}
