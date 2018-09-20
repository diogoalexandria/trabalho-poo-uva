
package trabalhopooa1;

import java.util.Scanner;

public class Lancha extends VeiculosMaritmosTipoCasco {
    Scanner t = new Scanner(System.in);
    boolean banheiro;

    //setters
    public void setBanheiro(boolean banheiro) {
            this.banheiro = banheiro;
    }

    //getters
    public boolean getBanheiro() {
            return banheiro;
    }

    //construtores
    public Lancha() {
    }

    public Lancha(boolean banheiro) {
        this.banheiro = banheiro;
    }
    
    public Lancha(String marca,String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Lancha(int numeropassageiros,double preco, boolean banheiro){
        numPassageiro = numeropassageiros;
        this.preco = preco;
        this.banheiro = banheiro;
    }
    
    public Lancha(String marca,int velMax, boolean banheiro){
        this.marca = marca;
        velocidadeMax=velMax;
        this.banheiro = banheiro;
    }
    
    public Lancha(String modelo,double preco){
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public Lancha(String marca, String identificacao, double preco){
        this.marca = marca;
        this.identificacao = identificacao;
        this.preco = preco;
    }
    
    public Lancha(double preco, String marca, boolean banheiro){
        this.preco = preco;
        this.marca = marca;
        this.banheiro = banheiro;
    }
    
    public Lancha (int v, double p, boolean b, String m){
        banheiro = b;
        preco = p;
        velocidadeMax=v;
        marca = m;
        
    }
    
    public Lancha(int numeropassageiros, boolean banheiro){
        numPassageiro = numeropassageiros;
        this.banheiro = banheiro;
    }
    //cadastrar
    
    void cadastrar(String marca, String modelo, int numPassageiro, double preco, int velocidadeMax, String identificacao, Motor motor1, boolean banheiro){
    super.cadastrar(marca,modelo, identificacao,numPassageiro, velocidadeMax, preco, motor1);
    setBanheiro(banheiro);
    }
    
    //imprimir
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tem banheiro: " +getBanheiro());
    }
    
    @Override
    public void entradaDados(){
        char condicao;
        super.entradaDados();
        System.out.println("Banheiro: ");
        condicao=(t.nextLine().charAt(0));
        if (condicao=='s') 
            banheiro=true;
        else if(condicao=='n')
            setBanheiro(false);    
    }
    
    double valorDesconto(){ 
        return preco*0.9;
    }
          
}
