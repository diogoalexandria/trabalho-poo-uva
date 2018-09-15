
package trabalhopooa1;
import java.util.Scanner;

public class VeiculosMaritmosTipoCasco extends VeiculosMaritmos{
    Scanner t = new Scanner(System.in);
    char tipo;
    String tipoCasco;
    
    //setters
    public void setTipo(char tipo) {
            this.tipo = tipo;
    }

    public void setTipoCasco(String tipoCasco) {
            this.tipoCasco = tipoCasco;
    }

    //getters
    public char getTipo() {
            return tipo;
    }

    public String getTipoCasco() {
            return tipoCasco;
    }

    //contrutores
    public VeiculosMaritmosTipoCasco() {
    }

    public VeiculosMaritmosTipoCasco(char tipo) {
            this.tipo = tipo;
    }

    public VeiculosMaritmosTipoCasco(String tipoCasco) {
            this.tipoCasco = tipoCasco;
    }

    public VeiculosMaritmosTipoCasco(char tipo, String tipoCasco) {
            this.tipo = tipo;
            this.tipoCasco = tipoCasco;
    }

    public VeiculosMaritmosTipoCasco(String tipoCasco, char tipo) {
            this.tipoCasco = tipoCasco;
            this.tipo = tipo;
    }
    
    //cadastrar
    public void cadastrar(char tipo, String tipoCasco){
        setTipo(tipo);
        setTipoCasco(tipoCasco);
    }
    
    //imprimir
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Tipo Casco: " + getTipoCasco());
    }
    
    public void entradaDados(){
        System.out.println("Digite o tipo: ");
        tipo = t.nextLine().charAt(0);
        System.out.println("Digite o tipo casco: ");
        tipoCasco = t.nextLine();
    }
}	
