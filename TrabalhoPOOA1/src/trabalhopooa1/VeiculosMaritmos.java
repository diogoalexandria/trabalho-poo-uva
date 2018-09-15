
package trabalhopooa1;

public class VeiculosMaritmos {
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
        
    }
    
    void imprimir(){
    }
    
    
}
