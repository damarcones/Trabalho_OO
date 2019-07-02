import excecoes.*;
import veiculo.Veiculo;
import javax.swing.*;
import javax.swing.*;

public class Main {
	
	private final static String MENU_INICIAL = "Menu de Opções\n"+ 
			"1) Cadastrar Veiculo:\n"+
			"2) Registrar Despesa:\n"+
			"3) Gerar Relatório:\n"+
			"0) Sair\n"+
			"Escolha uma opção\n";
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Veiculo carro = new Veiculo();
		//double tanque;
		int opcao=-1;
		
		
		
	
		/*
		carro.setModelo(JOptionPane.showInputDialog("Modelo"));
		carro.setAnoFabricacao(JOptionPane.showInputDialog("Ano de Fabricação"));
		carro.setAnoModelo(JOptionPane.showInputDialog("Ano modelo"));
		carro.setMotorizacao(JOptionPane.showInputDialog("Motorização"));
		carro.setCombustiveis(JOptionPane.showInputDialog("Combustiveis aceitos"));
		carro.setCor(JOptionPane.showInputDialog("Cor "));
		carro.setPlaca(JOptionPane.showInputDialog("Placa "));
		tanque = Double.parseDouble(JOptionPane.showInputDialog("Capacidade do tanque"));
		carro.setCapacidadeTanque(tanque);
		*/
		do {
		try {
		opcao = Integer.parseInt(JOptionPane.showInputDialog(MENU_INICIAL));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null	,"Digite um valor válido");
			opcao = Integer.parseInt(JOptionPane.showInputDialog(MENU_INICIAL));
		}
		
		switch(opcao) {
		case 0:
			break;
			case 1:
				try {
					carro.setMarca(JOptionPane.showInputDialog("Marca do carro"));	
					//testar leitura vazia ou só com espaços
					carro.setModelo(JOptionPane.showInputDialog("Marca do Modelo"));	
				}
				catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
				
				}

			break;
			
			default:
				JOptionPane.showMessageDialog(null," Digite um numero válido");
				
			}
//		if(opcao == 0 )
//			break;
		
		}while(opcao != 0);
		JOptionPane.showMessageDialog(null,"Finalizado com Sucesso!!!\n");
		
//		finally{
//		System.out.println(carro.getMarca());
//		//JOptionPane.showMessageDialog(null	,carro.getMarca());
//		}
//
			}

}


