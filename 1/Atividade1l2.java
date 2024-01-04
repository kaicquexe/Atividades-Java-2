

package atividade1l2;


public class Atividade1l2 {

     public static void main(String[] args) {
        Normal ingressoNormal = new Normal(50.0);
        VIP ingressoVIP = new VIP(80.0, 30.0);
        CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 40.0, "Sala 2");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(120.0, 50.0, "Sala 5");
        
        
        ingressoNormal.imprimeValor();
        ingressoVIP.imprimeValor();
        camaroteInferior.imprimeCamaroteInferior();
        camaroteInferior.imprimeLocalizacao();
        camaroteSuperior.imprimeTeste();
        camaroteSuperior.localizacaoCamaroteSuperior();
        
    }
}
