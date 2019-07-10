//RELATORIO QUE MOSTRA TODOS OS REGISTROS DE TAXAS, MANUTENCOES E ABASTECIMENTOS DE UM VEICULO
package relatorio;
import registros.*;
import veiculo.*;
import java.util.ArrayList;


public class RelatorioSimples extends Despesa{

/*********************PARA GERAR O RELATORIO DE TODOS OS ABASTECIMENTOS*********************/
	public static String  GerarRelatorioAbastecimento(ArrayList<RegistrarAbastecimento> abs){
            StringBuilder relatorio = new StringBuilder();
            	if(abs.size() == 0)
            		relatorio.append("Não há dados para gerar um relatório!");
            	else {
            		for(RegistrarAbastecimento a : abs) {
            			relatorio.append("\n"+ a.toString());
            		}
            	}
            	return relatorio.toString();
	}
	
/*********************PARA GERAR O RELATORIO DE TODOS AS MANUTENCOES*********************/
	public static String GerarRelatorioManutencao(ArrayList<RegistrarManutencao>ma){
		StringBuilder relatorio = new StringBuilder();
    	if(ma.size() == 0)
    		relatorio.append("Não há dados para gerar um relatório!");
    	else {
    		for(RegistrarManutencao a : ma) {
    			relatorio.append( "\n"+ a.toString());
    		}
    	}
    			return relatorio.toString();	
	}

/*********************PARA GERAR O RELATORIO DE TODOS AS TAXAS*********************/	
	public static String GerarRelatorioTaxa(ArrayList<RegistrarTaxa>tax){
			StringBuilder relatorio = new StringBuilder();
	    	if(tax.size() == 0)
	    		relatorio.append("Não há relatório");
	    	else {
	    		for(RegistrarTaxa a : tax) {
	    			relatorio.append( "\n"+ a.toString());
	    		}
	    	}
	    		return relatorio.toString();	
	}
}
