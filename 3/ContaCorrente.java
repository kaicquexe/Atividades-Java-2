
package atividade3l2;

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente (double saldo){
    super(saldo);
    }
    
    @Override
    public double calculaTributos(){
    return getSaldo() * 0.01;
    }
    
}
