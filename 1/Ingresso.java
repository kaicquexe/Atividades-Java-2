package atividade1l2;

import java.util.Scanner;

public class Ingresso {
    public double valor;
    
    public Ingresso(double valor) {
    this.valor = valor;
    }
    
    public void imprimeValor() {
    System.out.println("Valor do Ingresso Normal: R$" + valor);
    }
    
}
