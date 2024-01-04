
package atividade3l2;

public class Conta {
    public double saldo;
   
  public Conta(double saldo) {
  this.saldo = saldo;
  }

    public double getSaldo() {
        return saldo;
    }
  public void sacar(double valor) {
  saldo -= valor;
  } 
  
  public void depositar(double valor) {
  saldo += valor;
  }
}
