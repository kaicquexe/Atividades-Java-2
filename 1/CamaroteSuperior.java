
package atividade1l2;


public class CamaroteSuperior extends VIP {
    private String localizacao1;
    public CamaroteSuperior(double valor, double valorAdicional, String localizacao1) {
    super(valor, valorAdicional);
    this.localizacao1 = localizacao1;
    }

    public String getLocalizacao1() {
        return localizacao1;
    }

    public void setLocalizacao1(String localizacao1) {
        this.localizacao1 = localizacao1;
    }
    
    public void imprimeTeste(){
        System.out.println("Valor do Ingresso no Camarote Superior é de: R$" + valor);
    }    
    public void localizacaoCamaroteSuperior(){
        System.out.println("A Localizacao Do Camarote Superior é " + getLocalizacao1());
    }
}
