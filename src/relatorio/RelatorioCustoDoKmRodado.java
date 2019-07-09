//RELATORIO QUE INFORMA TODAS AS DESPESAS DO VEICULO, DIVIDIDO PELO TOTAL DE KM RODADOS
package relatorio;
import registros.*;
import excecoes.*;
public class RelatorioCustoDoKmRodado {
   //private Desempenho.Abastecimento
    private double KmLitro;
    private double CustoKm;
    private int KmAtual;
    private int KmAnterior;
    private double valor;
    
    public void MediaConsumo( ) throws DoisTanquesCheiosException{
    
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
        this.KmAtual = KmAtual;
    }

    public int getKmAnterior() {
        return KmAnterior;
    }

    public void setKmAnterior(int KmAnterior) {
        this.KmAnterior = KmAnterior;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
