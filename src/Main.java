import excecoes.*;
import veiculo.Veiculo;

import java.awt.HeadlessException;

import javax.swing.*;
public class Main {

	public static void main(String[] args) throws HeadlessException, Exception {
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
		}
		catch(DescricaEmBrancoException e) {	
			throw new DescricaEmBrancoException(e.getMessage());
		}
			
		finally{
		System.out.println(carro.getMarca());
		//JOptionPane.showMessageDialog(null,carro.getMarca());
		}

			}
}
