
package atividade3l2;

public class ContaPoupanca extends Conta implements Tributavel{
    public ContaPoupanca(double saldo){
    super(saldo);
    }
    
    @Override
    public double calculaTributos(){
return 0.0;    
 }   
}
