import excecoes.*;
import veiculo.Veiculo;
import javax.swing.*;
import java.util.*;

public class Main  {
	
	private final static String MENU_INICIAL = "MENU DE OPCOES\n"+ 
			"1) Cadastrar Veiculo;\n"+
			"2) Registrar Despesa;\n"+
			"3) Gerar Relatorio;\n"+
			"0) Sair.\n"+
			"Escolha uma opcao:\n";
	
	private final static String MENU_DESPESA = "REGISTRAR DESPESA\n"+
			"1) Abastecimento;\n"+
			"2) Manutencao;\n"+
			"3) Taxas;\n"+
			"0) Sair.\n"+
			"Escolha uma opcao:\n";
	private final static String GERAR_RELATORIO = "GERAR RELATORIO\n"+
			"1) Desempenho;\n"+
			"2) Consumo;\n"+
			"0) Sair.\n"+
			"Escolha uma opcao:\n";
	

	
	
	public static void main(String[] args) throws Exception {
		
		Set<Veiculo> carro =  new HashSet<Veiculo>();
		
		Veiculo carros = new Veiculo();
		
		int opcaoMenu = -1;
		
		do {
		try {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(MENU_INICIAL));
			
			switch(opcaoMenu) {
			case 0:
				break;
			case 1: // REGISTRAR CARROS
				try {
					double tanque;
					
					carros.setMarca(JOptionPane.showInputDialog("Marca do carro"));	
					//testar leitura vazia ou só com espaços
					carros.setModelo(JOptionPane.showInputDialog("Modelo"));
					carros.setAnoFabricacao(JOptionPane.showInputDialog("Ano de Fabricação"));
					carros.setAnoModelo(JOptionPane.showInputDialog("Ano modelo"));
					carros.setMotorizacao(JOptionPane.showInputDialog("Motorização"));
					carros.setCombustiveis(JOptionPane.showInputDialog("Combustiveis aceitos"));
					carros.setCor(JOptionPane.showInputDialog("Cor "));
					carros.setPlaca(JOptionPane.showInputDialog("Placa "));
					tanque = Double.parseDouble(JOptionPane.showInputDialog("Capacidade do tanque"));
					carros.setCapacidadeTanque(tanque);
					carro.addAll(carro);
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null	,"Digite um valor válido!");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
				
				
			break;
			case 2: //REGISTRAR DESPESAS
				int opcaoDespesa = -1;
				do {
					try {
						opcaoDespesa = Integer.parseInt(JOptionPane.showInputDialog(MENU_DESPESA));
						
						switch(opcaoDespesa) {
						case 0:
							break;
						case 1:
							//REGISTRAR ABASTECIMENTO
						break;
						
						case 2:
							//REGISTRAR MANUTENÇÃO
						break;
						
						case 3:
							//REGISTAR TAXA(IMPOSTO, SEGURO, ETC)
						break;
						
						default:
							JOptionPane.showMessageDialog(null," Digite um n�mero válido!");
						
						}
					}
					
					catch( NumberFormatException f) {
						JOptionPane.showMessageDialog(null	,"Digite um valor");
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(null	,"Digite um valor válido");
						opcaoDespesa= Integer.parseInt(JOptionPane.showInputDialog(MENU_DESPESA));
					}
					
				}while(opcaoDespesa != 0);
				
			break;
			
			case 3: // MOSTRAR RELATORIOS
				int opcaoRelatorio = -1;
				do {
					try {
						opcaoRelatorio = Integer.parseInt(JOptionPane.showInputDialog(GERAR_RELATORIO));
						
						switch(opcaoRelatorio) {
						case 0:
							break;
						case 1:
							//RELATORIO DE DESEMPENHO
						break;
						
						case 2:
							//RELATORIO DE CONSUMO
						break;
						

						
						default:
							JOptionPane.showMessageDialog(null," Digite um numero válido!");
						
						}
	}
					
					catch( NumberFormatException f) {
						JOptionPane.showMessageDialog(null	,"Digite um valor");
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(null	,"Digite um valor válido!");
						opcaoRelatorio= Integer.parseInt(JOptionPane.showInputDialog(GERAR_RELATORIO));
					}
					
				}while(opcaoRelatorio != 0);
				break;
				
				default:
					JOptionPane.showMessageDialog(null," Digite um numero válido!");
				break;
					
				}
		}
		
		catch( NumberFormatException f) {
			JOptionPane.showMessageDialog(null	,"Digite um valor");
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null	,"Digite um valor válido");
			
		}
		

		}while(opcaoMenu != 0);
		//JOptionPane.showMessageDialog(null,carro);
		JOptionPane.showMessageDialog(null,"Programa Finalizado com Sucesso!\n");
		
	

}


}
