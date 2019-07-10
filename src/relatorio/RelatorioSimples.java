//RELATORIO QUE MOSTRA TODOS OS REGISTROS DE TAXAS, MANUTENCOES E ABASTECIMENTOS DE UM VEICULO
package relatorio;
import excecoes.DescricaoEmBrancoException;
import javax.swing.JOptionPane;
import registros.*;
import veiculo.*;
import java.util.ArrayList;


<<<<<<< HEAD
public class RelatorioSimples {
=======
public class RelatorioSimples  extends Despesa{
	public String abastecimentos;
		
	
	
	public void GerarRelatorioAbastecimento() throws DescricaoEmBrancoException{
            //RegistrarAbastecimento ga = new RegistrarAbastecimento() ;
            //ga.toString();
>>>>>>> a90d1141c973ca04ce7e9c3739bb59e2dcf6534c

/*********************PARA GERAR O RELATORIO DE TODOS OS ABASTECIMENTOS*********************/
	//RelatorioSimples.GerarRelatorioAbastecimento(abs);
	public static String  GerarRelatorioAbastecimento(ArrayList<RegistrarAbastecimento> abs){
            StringBuilder relatorio = new StringBuilder();
            	if(abs.size() == 0)
            		relatorio.append("Não há dados para gerar um relatório!");
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
//    		relatorio.append("Não há relatório");
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
//	    		relatorio.append("Não há relatório");
//	    	else {
//	    		for(RegistrarAbastecimento a : abs) {
//	    			relatorio.append( "\n"+ a.toString());
//	    		}
//	    	}
//	    
//	    return relatorio.toString();	
	}

}
