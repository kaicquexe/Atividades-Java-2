

package atividade3l2;


public class Atividade3L2 {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        
        System.out.println("Tributos da conta corrente R$" + contaCorrente.calculaTributos());
        System.out.println("Tributos da conta poupanca R$" + contaPoupanca.calculaTributos());
        System.out.println("Tributos do seguro de vida R$" + seguroDeVida.calculaTributos());
    }
}
