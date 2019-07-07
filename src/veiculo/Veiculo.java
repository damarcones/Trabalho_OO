package veiculo;
import excecoes.*;
import registros.*;
import java.util.*;

public class Veiculo extends DescricaoEmBrancoException  {
	
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String anoModelo;
	private String motorizacao;
	private double capacidadeTanque;
	private String combustiveis;
	private String cor;
	private String placa;
	private String renavam;
	private ArrayList <Despesa> despesas;
	

	public Veiculo() throws DescricaoEmBrancoException {
		//CONSTRUINDO ARRAYLIST PARA LIGAR DESPESAS AO CARRO
		despesas = new ArrayList();
	}
///////////////////////////////////MARCA//////////////////////////////////////
	public String getMarca() {
	
		return marca;
	}

	public void setMarca(String marca) throws DescricaoEmBrancoException{                //trim().equalsIgnoreCase= remove espaço
		
		try {
			if(marca.trim().equalsIgnoreCase("")||marca.isEmpty()||marca == null) {
				throw new DescricaoEmBrancoException();
			}
			this.marca = marca.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////MODELO//////////////////////////////////////
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo)throws DescricaoEmBrancoException {
		try {
			if(modelo.trim().equalsIgnoreCase("")||modelo.isEmpty()||modelo == null) {
				throw new DescricaoEmBrancoException();
			}
			this.modelo = modelo.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////ANO DE FABRICACAO//////////////////////////////////////
	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

///////////////////////////////////ANO DO MODELO//////////////////////////////////////
	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

///////////////////////////////////MOTORIZACAO//////////////////////////////////////
	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}

///////////////////////////////////COMBUSTIVEIS//////////////////////////////////////
	public String getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(String cobustiveis) {
		this.combustiveis = cobustiveis;
	}

///////////////////////////////////COR//////////////////////////////////////
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

///////////////////////////////////PLACA//////////////////////////////////////
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

///////////////////////////////////RENAVAM//////////////////////////////////////
	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

///////////////////////////////////CAPACIDADE DO TANQUE//////////////////////////////////////
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

///////////////////////////////////MARCA//////////////////////////////////////
	public void addDespesa(Despesa d) {
		this.despesas.add(d);
	}
	
	
}
