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
	

	public Veiculo() throws DescricaoEmBrancoException{
		//CONSTRUINDO ARRAYLIST PARA LIGAR DESPESAS AO CARRO
		despesas = new ArrayList();
	}
	
///////////////////////////////////MARCA//////////////////////////////////////
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) throws DescricaoEmBrancoException{
		
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

	public void setAnoFabricacao(String anoFabricacao) throws DescricaoEmBrancoException{
		
		try {
			if(anoFabricacao.trim().equalsIgnoreCase("")||anoFabricacao.isEmpty()||anoFabricacao == null) {
				throw new DescricaoEmBrancoException();
			}
			this.anoFabricacao = anoFabricacao.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////ANO DO MODELO//////////////////////////////////////
	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo)  throws DescricaoEmBrancoException {
		
		try {
			if(anoModelo.trim().equalsIgnoreCase("")||anoModelo.isEmpty()||anoModelo == null) {
				throw new DescricaoEmBrancoException();
			}
			this.anoModelo = anoModelo.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////MOTORIZACAO//////////////////////////////////////
	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) throws DescricaoEmBrancoException{
		
		try {
			if(motorizacao.trim().equalsIgnoreCase("")||motorizacao.isEmpty()||motorizacao == null) {
				throw new DescricaoEmBrancoException();
			}
			this.motorizacao = motorizacao.trim();
		
		}
		catch(DescricaoEmBrancoException f) {
			throw f;
		}
	}

///////////////////////////////////COMBUSTIVEIS//////////////////////////////////////
	public String getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(String combustiveis) throws DescricaoEmBrancoException {
		
		try {
			if(combustiveis.trim().equalsIgnoreCase("")||combustiveis.isEmpty()||combustiveis == null) {
				throw new DescricaoEmBrancoException();
			}
			this.combustiveis = combustiveis.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////COR//////////////////////////////////////
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) throws DescricaoEmBrancoException {
		
		try {
			if(cor.trim().equalsIgnoreCase("")||cor.isEmpty()||cor == null) {
				throw new DescricaoEmBrancoException();
			}
			this.cor = cor.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////PLACA//////////////////////////////////////
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) throws DescricaoEmBrancoException {
		
		try {
			if(placa.trim().equalsIgnoreCase("")||placa.isEmpty()||placa == null) {
				throw new DescricaoEmBrancoException();
			}
			this.placa = placa.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////RENAVAM//////////////////////////////////////
	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) throws DescricaoEmBrancoException {
		
		try {
			if(renavam.trim().equalsIgnoreCase("")||renavam.isEmpty()||renavam == null) {
				throw new DescricaoEmBrancoException();
			}
			this.renavam = renavam.trim();
		
		}
		catch(DescricaoEmBrancoException e) {
			throw e;
		}
	}

///////////////////////////////////CAPACIDADE DO TANQUE//////////////////////////////////////
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque)  throws DescricaoEmBrancoException, ValorInvalidoException{
		
		try {
			if(capacidadeTanque <= 0.0) {
				throw new ValorInvalidoException();
			}
			this.capacidadeTanque = capacidadeTanque;
		
		}
		catch(ValorInvalidoException f) {
			throw f;
		}
		
	}

//*******************************************************************
	public void addDespesa(Despesa d) {
		this.despesas.add(d);
	}	
}
