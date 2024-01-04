
package atividade1l2;


public class VIP extends Ingresso{
    private double valorAd;
    
    public VIP(double valor, double valorAdd) {
    super(valor);
    this.valorAd = valorAd;
    } 
    
    public double getValorVIP() {
    return valor + valorAd;
    }
    @Override
    public void imprimeValor() {
    System.out.println("Valor do Ingresso VIP é: R$" + getValorVIP());
    }
}
