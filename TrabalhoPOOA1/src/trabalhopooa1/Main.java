
package trabalhopooa1;

public class Main {
     public static void main(String[] args) {
        Iate iate1 = new Iate();
        iate1.entradaDados();
        iate1.imprimir();
        iate1.ValorDesconto();
         
        Iate iate2 = new Iate("Marinha", "JKPOO");
        iate2.imprimir();
        
        Iate iate3 = new Iate("Luxo", 1);
        iate3.imprimir();
        
        Iate iate4 = new Iate(300000, 10);
        iate4.imprimir();
        
        Iate iate5 = new Iate(450000, "Deluxe", 20);
        iate5.imprimir();
        
        Iate iate6 = new Iate("Ferretti", "830", 17000000, 20);
        iate6.imprimir();
        
        Jetski jet1 = new Jetski();
        jet1.entradaDados();
        jet1.imprimir();
        //jet1.ValorDesconto();
        
        Jetski jet2 = new Jetski();
        jet2.imprimir();
        
        Jetski jet3 = new Jetski();
        jet3.imprimir();
        
        Jetski jet4 = new Jetski();
        jet4.imprimir();
        
        Jetski jet5 = new Jetski();
        jet5.imprimir();
        
        Jetski jet6 = new Jetski();
        jet6.imprimir();
        
        Lancha lancha1 = new Lancha();
        lancha1.entradaDados();
        lancha1.imprimir();
        //lancha1.ValorDesconto();
        
        Lancha lancha2 = new Lancha();
        lancha2.imprimir();
        
        Lancha lancha3 = new Lancha();
        lancha3.imprimir();
        
        Lancha lancha4 = new Lancha();
        lancha4.imprimir();
        
        Lancha lancha5 = new Lancha();
        lancha5.imprimir();
        
        Lancha lancha6 = new Lancha();
        lancha6.imprimir();
    }
}
