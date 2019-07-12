//RELATORIO QUE INFORMA TODAS AS DESPESAS DO VEICULO, DIVIDIDO PELO TOTAL DE KM RODADOS
package relatorio;
import javax.swing.JOptionPane;
import registros.*;
import veiculo.Veiculo;
import excecoes.*;
import java.util.ArrayList;

public class RelatorioCustoDoKmRodado {
	// private Desempenho.Abastecimento
	private double KmLitro;
	private double CustoKm;
	private int KmAtual;
	private int KmAnterior;
	private double valor;
	
	Veiculo v;
	RegistrarAbastecimento ra;
	RegistrarManutencao rm;
    RegistrarTaxa rt;


	public void MediaConsumo() throws DoisTanquesCheiosException {

	}

	public double getKmLitro() {
		return KmLitro;
	}

	public void setKmLitro(double KmLitro) {
		this.KmLitro = KmLitro;
	}

	public double getCustoKm() {

		return CustoKm;
	}

	public void setCustoKm(double CustoKm) {
		this.CustoKm = CustoKm;
	}

	public int getKmAtual() {
		return KmAtual;
	}

	public void setKmAtual(int KmAtual) {
		this.KmAtual = ra.getKmAtual();
	}

	public int getKmAnterior() {
		return KmAnterior;
	}

//    public void setKmAnterior(int KmAnterior) {
//        this.KmAnterior = ra.KmAnterior();
//    }

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

//	public String toString() {
//        return "\nABASTECIMENTO2: "
//        		+ "\nCusto por Km: "+(ra.getValorTotal()+rm.getValorTotal()+rt.getValorTotal())
//                /(ra.getKmAtual()-ra.getKmAnterior()) ;
//    		}

	}


