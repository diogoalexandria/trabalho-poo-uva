
package trabalhopooa1;
import java.util.Scanner;
public class VeiculosMaritmos { 
    Scanner sc = new Scanner(System.in);
    String marca, modelo, identificacao;
    int numPassageiro, velocidadeMax;
    double preco;
    Motor motor1=new Motor();
    
    //Métodos Setter e Getters
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setIdentificacao(String identificacao){
        this.identificacao=identificacao;
    }
    public String getIdentificacao(){
        return identificacao;
    }
    
    public void setNumPassageiro(int numPassageiro){
        this.numPassageiro=numPassageiro;
    }
    public int getNumPassageiro(){
        return numPassageiro;
    }

    public void setVelocidadeMax(int velocidadeMax){
        this.velocidadeMax=velocidadeMax;
    }
    public int getVelocidadeMax(){
        return velocidadeMax;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setMotor1(Motor motor1){
        this.motor1=motor1;
    }
    public Motor getMotor1(){
        return motor1;
    }
    
    //construtores
    public VeiculosMaritmos(){}

    public VeiculosMaritmos(String marca) {
        this.marca = marca;
    }

    public VeiculosMaritmos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public VeiculosMaritmos(String marca, String modelo, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
    }

    public VeiculosMaritmos(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

    public VeiculosMaritmos(int numPassageiro, int velocidadeMax) {
        this.numPassageiro = numPassageiro;
        this.velocidadeMax = velocidadeMax;
    }

    public VeiculosMaritmos(double preco) {
        this.preco = preco;
    }

    public VeiculosMaritmos(String marca, int numPassageiro) {
        this.marca = marca;
        this.numPassageiro = numPassageiro;
    }

    public VeiculosMaritmos(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }
    
    public VeiculosMaritmos(Motor motor1){
        this.motor1=motor1;
    }
    
    void cadastrar(String marca,String modelo, String identificacao, 
                    int numPassageiro,int velocidadeMax, double preco,
                    Motor motor1){
        setMarca(marca);
        setModelo(modelo);
        setIdentificacao(identificacao);
        setNumPassageiro(numPassageiro);
        setVelocidadeMax(velocidadeMax);
        setPreco(preco);
        setMotor1(motor1);
    }
    
    void entradaDados(){
        System.out.println("Digite a marca: ");
        marca=(sc.nextLine());
        System.out.println("Digite o modelo: ");
        modelo=(sc.nextLine());
        System.out.println("Digite a identificacao: ");
        identificacao=(sc.nextLine());
        System.out.println("Digite a qtd de passagerios: ");
        numPassageiro=(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a velocidade max: ");
        velocidadeMax=(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o preco: ");
        preco=(Integer.parseInt(sc.nextLine()));
        motor1.entradaDados();
    }
    
    void imprimir(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Identificacao: "+getIdentificacao());
        System.out.println("Qtd de passagerios: "+getNumPassageiro());
        System.out.println("Velocidade max: "+getVelocidadeMax());
        System.out.println("Preco: "+getPreco());
        motor1.imprimir();
    } 
}
