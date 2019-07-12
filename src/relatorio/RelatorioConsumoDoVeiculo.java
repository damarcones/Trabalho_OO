//RELATORIO QUE INFORMA O CONSUMO MEDIO DO VEICULO: KM RODADOS/LITROS ABASTECIDOS
//PRA CADA ABASTECIMENTO DO TIPO COMPLETO (TANQUE CHEIO)
package relatorio;

import registros.*;
import veiculo.*;
import java.util.ArrayList;

public class RelatorioConsumoDoVeiculo extends Despesa {
    public static String GerarRelatorioConsumoDoVeiculo(ArrayList<RegistrarAbastecimento> abs) {
		StringBuilder relatorio = new StringBuilder();
		if (abs.size() == 0)
			relatorio.append("N�o h� dados para gerar um relat�rio!");
		else {
			for (RegistrarAbastecimento a : abs) {
				relatorio.append("\n" + a.toString2());
			}
		}
		return relatorio.toString();
	}
}
