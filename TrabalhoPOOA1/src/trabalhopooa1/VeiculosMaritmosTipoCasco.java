
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

    public VeiculosMaritmosTipoCasco(String marca, String modelo) {
        super(marca, modelo);
    }

    public VeiculosMaritmosTipoCasco(String marca, String modelo, String identificacao) {
        super(marca, modelo, identificacao);
    }

    public VeiculosMaritmosTipoCasco(int numPassageiro) {
        super(numPassageiro);
    }

    public VeiculosMaritmosTipoCasco(int numPassageiro, int velocidadeMax) {
        super(numPassageiro, velocidadeMax);
    }

    public VeiculosMaritmosTipoCasco(double preco) {
        super(preco);
    }

    public VeiculosMaritmosTipoCasco(String marca, int numPassageiro) {
        super(marca, numPassageiro);
    }
    
    
    
    //cadastrar
    public void cadastrar(char tipo, String tipoCasco, String marca,String modelo, String identificacao, 
                    int numPassageiro,int velocidadeMax, double preco,
                    Motor motor1){
        super.cadastrar(marca, modelo, identificacao, numPassageiro, velocidadeMax, preco, motor1);
        setTipo(tipo);
        setTipoCasco(tipoCasco);
    }
    
    //imprimir
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Tipo Casco: " + getTipoCasco());
    }
    
    @Override
    public void entradaDados(){
        super.entradaDados();
        System.out.println("Digite o tipo: ");
        tipo = t.nextLine().charAt(0);
        System.out.println("Digite o tipo casco: ");
        tipoCasco = t.nextLine();
    }
}	
