
package atividade1l2;


public class CamaroteInferior extends VIP{
    private String localizacao;
    
    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
    super(valor, valorAdicional);
    this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void imprimeLocalizacao() {
    System.out.println("Localizacao do Camarote Inferior" + localizacao);
    }
    public void imprimeCamaroteInferior(){
        System.out.println("O Valor Do Camarote Inferior é: R$" + valor);
    }
}
