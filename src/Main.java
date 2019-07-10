import excecoes.*;
import registros.RegistrarManutencao;
import relatorio.RelatorioSimples;
import veiculo.Veiculo;
import javax.swing.*;
import java.util.*;
import registros.*;

public class Main {
	
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
	
	private final static String REGISTRAR_TAXA = "REGISTRAR TAXA\n"+
			"Exemplos de taxas: DPVAT/Seguro/\n"+
			"Licenciamento/IPVA/Financiamento\n";

	
	public static void main(String[] args) throws Exception {
		
	//	arrayList<Veiculo> carro =  new arrayList<Veiculo>();
		
		ArrayList<Veiculo> veiculos= new ArrayList<>();
		int opcaoMenu = -1;
		
			
	

		do{
		try {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(MENU_INICIAL));
			
			switch(opcaoMenu) {
			case 0:
				break;
			case 1: // REGISTRAR CARROS
				while(true)		
				{
					int maisUmCarro = 1;
//					1 == não
//					0 == sim
//					-1 == fechar
					
					Veiculo carros= new Veiculo();
					try 		
					{
						maisUmCarro = JOptionPane.showConfirmDialog(null, "Você quer adicionar mais carro?", "Adicionar Veiculo",JOptionPane.YES_NO_OPTION);
						
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					if(maisUmCarro == 1|| maisUmCarro == -1)
						break;
				try {
				//	veiculos.add(Veiculo.init());
						veiculos.add(Veiculo.init());
					
					JOptionPane.showMessageDialog(null,veiculos.get(veiculos.size() -1).toString());

				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null	,"Digite um valor válido!");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
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
							try {
							veiculos.get(veiculos.size() -1).addDespesa(RegistrarAbastecimento.init());
							
							
							JOptionPane.showMessageDialog(null,veiculos.get(veiculos.size() -1).toString());
							}
							catch(Exception e) {
								throw e;
							}
						break;
						
						case 2:
							//REGISTRAR MANUTENÇÃO
							veiculos.get(veiculos.size() -1).addDespesa(RegistrarManutencao.init());

							JOptionPane.showMessageDialog(null,veiculos.get(veiculos.size() -1).toString());
						break;
		
						case 3:
							//REGISTAR TAXA(IMPOSTO, SEGURO, ETC)
							//JOptionPane.showMessageDialog(null,REGISTRAR_TAXA);
							veiculos.get(veiculos.size() -1).addDespesa(RegistrarTaxa.init());
							JOptionPane.showMessageDialog(null,veiculos.get(veiculos.size() -1).toString());
							
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
							
						case 1: //gerar relatorio simples de abastecimento
							JOptionPane.showMessageDialog(null,RelatorioSimples.GerarRelatorioAbastecimento(veiculos.get(veiculos.size() -1).getAbs()));
								break;
						
						case 2: //gerar relatorio simples de manutencao
							
								break;
								
						case 3: //gerar relatorio simples de taxa
							
								break;
								
						case 4: //gerar relatorio de desempenho: consumo do veiculo
							
								break;
								
						case 5: //gerar relatorio de desempenho: custo do km rodado

								break;
						
						default:
							JOptionPane.showMessageDialog(null," Digite um numero válido!");
						}
					}
					
					catch( NumberFormatException f) {
						JOptionPane.showMessageDialog(null	,"Digite um valor valido");
					
					}catch(Exception e){
						JOptionPane.showMessageDialog(null	,"Digite um valor");
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
			JOptionPane.showMessageDialog(null	,"Digite um valor valido");
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null	,"Digite um valor");
			
		}
		
		}while(opcaoMenu != 0);
//		Fim do switch
		
		//JOptionPane.showMessageDialog(null,carro);
		JOptionPane.showMessageDialog(null,"Programa Finalizado com Sucesso!\n");
	}


}
