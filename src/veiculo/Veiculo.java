package veiculo;
import excecoes.*;
import registros.*;
import java.util.*;

public class Veiculo extends DescricaEmBrancoException  {
	
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String anoModelo;
	private String motorizacao;
	private String combustiveis;
	private String cor;
	private String placa;
	private String renavam;
	private double capacidadeTanque;
	private ArrayList <Despesa> despesas;
	

	public Veiculo() throws DescricaEmBrancoException {
		//CONSTRUINDO ARRAYLIST PARA LIGAR DESPESAS AO CARRO
		despesas = new ArrayList();
	}

	public String getMarca() {
	
		return marca;
	}

	public void setMarca(String marca) throws DescricaEmBrancoException{
		
		try {
			if(marca.trim().equalsIgnoreCase("")||marca.isEmpty()||marca == null) {
				throw new DescricaEmBrancoException();
			}
			this.marca = marca.trim();
		
		}
		catch(DescricaEmBrancoException e) {
			throw e;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(String cobustiveis) {
		this.combustiveis = cobustiveis;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public void addDespesa(Despesa d) {
		this.despesas.add(d);
	}
	
	
}
