import excecoes.*;
import veiculo.Veiculo;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo carro = new Veiculo();
		double tanque;
	
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
		try {
			carro.setMarca(JOptionPane.showInputDialog("Marca do carro"));
			carro.setModelo(JOptionPane.showInputDialog("Modelo"));
			throw new DescricaEmBrancoException();
			
		}
		catch(DescricaEmBrancoException e) {			
			JOptionPane.showMessageDialog(null,e + "\nCampo obrigatorio");
			carro.setMarca(JOptionPane.showInputDialog("Marca do carro"));
		}
			
		finally{
		System.out.println(carro.getMarca());
		
		}

			

	
			}
}
