import excecoes.*;
import registros.RegistrarManutencao;
import relatorio.RelatorioConsumoDoVeiculo;
import relatorio.RelatorioSimples;
import veiculo.Veiculo;
import javax.swing.*;
import java.util.*;
import registros.*;

public class Main {

	private final static String MENU_INICIAL = "MENU PRINCIPAL\n" + "1) Cadastrar Veiculo;\n"
			+ "2) Registrar Despesa;\n" + "3) Gerar Relatorio;\n" + "0) Sair.\n" + "Escolha uma opcao:\n";

	private final static String MENU_DESPESA = "REGISTRAR DESPESA\n" + "1) Abastecimento;\n" + "2) Manutencao;\n"
			+ "3) Taxas;\n" + "0) Voltar.\n" + "Escolha uma opcao:\n";

	private final static String GERAR_RELATORIO = "GERAR RELATORIO\n" + "1) Relatorio simples de abastecimentos;\n"
			+ "2) Relatorio simples de manutencoes;\n" + "3) Relatorio simples de taxas;\n"
			+ "4) Relatorio de desempenho: Consumo;\n" + "5) Relatorio de desempenho: Custo por Km;\n" + "0) Voltar.\n"
			+ "Escolha uma opcao:\n";

	static ArrayList<Veiculo> veiculos = new ArrayList<>(); // criando uma arraylist do tipo veiculo
	
/////////////////////////////////METODO PARA ACHAR O ENDERECO DO VEICULO A PARTIR DA PLACA//////////////////////////////
	public static int EnderecoDoCarro() {
		int endereco_do_carro = -1;
		try {
			String placabuscada = JOptionPane.showInputDialog("Digite a Placa do Veiculo");
			for(int i = 0; i < veiculos.size(); i++) {
				if(veiculos.get(i).getPlaca().equals(placabuscada)) {
					endereco_do_carro = i;
				}
			}
			if(endereco_do_carro == -1) {
				throw new PlacaNaoCadastradaException();
			}
			return endereco_do_carro;
		} catch (PlacaNaoCadastradaException e) {
			JOptionPane.showMessageDialog(null, e);
			return -1;
		}
	}
	
	public static void main(String[] args) throws Exception {

		int opcaoMenu = -1;

		do {
			try {
				opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(MENU_INICIAL));

				switch (opcaoMenu) {
				case 0:
					break;
				case 1: // REGISTRAR CARROS
					while (true) {
						int maisUmCarro = 1;
//					1 == nao     0==sim      -1 == fechar


						Veiculo carros = new Veiculo();
						try {
							maisUmCarro = JOptionPane.showConfirmDialog(null, "Quer adicionar mais um carro?",
									"Adicionar Veiculo", JOptionPane.YES_NO_OPTION);

						} catch (Exception e) {
							e.printStackTrace();
						}

						if (maisUmCarro == 1 || maisUmCarro == -1)
							break;
						try {
							veiculos.add(Veiculo.init()); //metodo init declarado dentro da classe veiculo

							//JOptionPane.showMessageDialog(null, veiculos.get(veiculos.size() - 1).toString());  //testando salvamento de veiculo

						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Digite um numero valido!");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, e);
						}
					}

					break;
				case 2: // REGISTRAR DESPESAS
					int i = EnderecoDoCarro();
					if(i == -1) /* Para certeza de que o endereço não vai passar caso não encontre a placa do carro*/
						break;
					JOptionPane.showMessageDialog(null, "O veiculo de placa " + veiculos.get(i).getPlaca() + "cadastrado");
					int opcaoDespesa = -1;
					do {
						try {
							opcaoDespesa = Integer.parseInt(JOptionPane.showInputDialog(MENU_DESPESA));

							switch (opcaoDespesa) { //opcoes do menu despesa
							case 0:
								break;
							case 1: //REGISTRAR ABASTECIMENTO
								
								try {
									veiculos.get(i)
											.addAbs(RegistrarAbastecimento.init(veiculos.get(i))); //adicionar uma despesa no arraylist de despesas

									//JOptionPane.showMessageDialog(null, veiculos.get(veiculos.size() - 1).toString()); //testando a leitura de despesas
								} catch (Exception e) {
									throw e;
								}
								break;

							case 2: //REGISTRAR MANUTENCAO
		
								try {
									veiculos.get(i)
											.addMA(RegistrarManutencao.init(veiculos.get(i))); //adiciona uma manutencao no arraylist de manutencao

									//JOptionPane.showMessageDialog(null, veiculos.get(veiculos.size() - 1).toString()); //testando leitura de manutencao
								} catch (Exception e) {
									throw e;
								}
								break;

							case 3: //REGISTAR TAXA(IMPOSTO, SEGURO, ETC)

								veiculos.get(i).addtax(RegistrarTaxa.init());  //adicionar taxa no arraylist de taxa
								//JOptionPane.showMessageDialog(null, veiculos.get(veiculos.size() - 1).toString()); //testando leitura de taxa

								break;

							default:
								JOptionPane.showMessageDialog(null, " Digite um numero valido!");

							}
						}

						catch (NumberFormatException f) {
							JOptionPane.showMessageDialog(null, "Digite um valor!");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Digite um valor valido!");
							opcaoDespesa = Integer.parseInt(JOptionPane.showInputDialog(MENU_DESPESA));
						}

					} while (opcaoDespesa != 0);

					break;

				case 3: // MOSTRAR RELATORIOS
					i = EnderecoDoCarro();
					if(i == -1) /* Para certeza de que o endereço não vai passar caso não encontre a placa do carro*/
						break;
					int opcaoRelatorio = -1;
					do {
						try {
							opcaoRelatorio = Integer.parseInt(JOptionPane.showInputDialog(GERAR_RELATORIO));

							switch (opcaoRelatorio) {
							case 0:
								break;

							case 1: // gerar relatorio simples de abastecimento
								JOptionPane.showMessageDialog(null, RelatorioSimples
										.GerarRelatorioAbastecimento(veiculos.get(i).getAbs()));
								break;

							case 2: // gerar relatorio simples de manutencao
								JOptionPane.showMessageDialog(null, RelatorioSimples.GerarRelatorioManutencao(veiculos.get(i).getMA()));
								break;

							case 3: // gerar relatorio simples de taxa
								JOptionPane.showMessageDialog(null, RelatorioSimples
										.GerarRelatorioTaxa(veiculos.get(i).getTAX()));
								break;

							case 4: // gerar relatorio de desempenho: consumo do veiculo
								 JOptionPane.showMessageDialog(null, RelatorioConsumoDoVeiculo
										.GerarRelatorioConsumoDoVeiculo(veiculos.get(i).getAbs()));
								break;

							case 5: // gerar relatorio de desempenho: custo do km rodado
								JOptionPane.showMessageDialog(null, "Custo por Km Rodado\n"+veiculos.get(i).valorRelTotal()/veiculos.get(i).maiorKm());
							//	JOptionPane.showMessageDialog(null,veiculos.get(i).maiorKm());

								break;

							default:
								JOptionPane.showMessageDialog(null, " Digite um numero valido!");
							}
						}

						catch (NumberFormatException f) {
							JOptionPane.showMessageDialog(null, "Digite um valor valido!");

						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Digite um valor!");
							opcaoRelatorio = Integer.parseInt(JOptionPane.showInputDialog(GERAR_RELATORIO));
						}

					} while (opcaoRelatorio != 0);
					break;

				default:
					JOptionPane.showMessageDialog(null, " Digite um numero valido!");
					break;

				}
			}

			catch (NumberFormatException f) {
				JOptionPane.showMessageDialog(null, "Digite um valor valido!");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Digite um valor!");

			}

		} while (opcaoMenu != 0);
//		Fim do switch


		JOptionPane.showMessageDialog(null, "Programa Finalizado com Sucesso!\n");
	}

}
