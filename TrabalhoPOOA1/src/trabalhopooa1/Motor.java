
package trabalhopooa1;
import java.util.Scanner;
public class Motor {
    Scanner sc = new Scanner(System.in);
    String marca, modelo, tipoCombustivel;
    int potencia, rpmMax, rpm, numCilindros;
    
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
    
    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel=tipoCombustivel;
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    
    public void setPotencia(int potencia){
        this.potencia=potencia;
    }
    public int getPotencia(){
        return potencia;
    }
    
    public void setRpmMax(int rpmMax){
        this.rpmMax=rpmMax;
    }
    public int getRpmMax(){
        return rpmMax;
    }
    
    public void setRpm(int rpm){
        this.rpm=rpm;
    }
    public int getRpm(){
        return rpm;
    }
    
    public void setNumCilindros(int numCilindros){
        this.numCilindros=numCilindros;
    }
    public int getNumCilindros(){
        return numCilindros;
    }
    
    //Construtores
    public Motor(){}
    public Motor(String marca){
        this.marca=marca;}
    
    public Motor(String marca, String modelo){
        this.modelo=modelo;
        this.marca=marca;}
    
    public Motor(String marca,String modelo,String tipoCombustivel){
        this.marca=modelo;
        this.modelo=modelo;
        this.tipoCombustivel=tipoCombustivel;}
    
    public Motor(int potencia){
        this.potencia=potencia;}
    
    public Motor(int potencia, int rpmMax){
        this.potencia=potencia;
        this.rpmMax=rpmMax;}
    
    public Motor(int potencia, int rpmMax, int rpm){
        this.potencia=potencia;
        this.rpmMax=rpmMax;
        this.rpm=rpm;}
    
    public Motor(int potencia, int rpmMax, int rpm, int numCilindros){
        this.potencia=potencia;
        this.rpmMax=rpmMax;
        this.rpm=rpm;
        this.numCilindros=numCilindros;}
    
    public Motor(String marca,int potencia){
        this.marca=marca;
        this.potencia=potencia;}
    
    public Motor (String tipoCombustivel,int potencia, int rpmMax){
        this.potencia=potencia;
        this.rpmMax=rpmMax;
        this.tipoCombustivel=tipoCombustivel;
    }
    
    void cadastrar(String marca,String modelo,String tipoCombustivel,
                    int potencia, int rpmMax, int rpm, int numCilindros){
        setMarca(marca);
        setModelo(modelo);
        setTipoCombustivel(tipoCombustivel);
        setPotencia(potencia);
        setRpm(rpm);
        setRpmMax(rpmMax);
        setNumCilindros(numCilindros);
    }
    
    void entradaDados(){
        System.out.println("Digite a marca do Motor: ");
        marca=(sc.nextLine());
        System.out.println("Digite o modelo do Motor: ");
        modelo=(sc.nextLine());
        System.out.println("Digite o tipo de combustivel do Motor: ");
        tipoCombustivel=(sc.nextLine());
        System.out.println("Digite a potencia do Motor: ");
        potencia=(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite rpm do Motor: ");
        rpm=(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite rpm Maxima do Motor: ");
        rpmMax=(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o numero de cilindradas do Motor: ");
        numCilindros=(Integer.parseInt(sc.nextLine()));
    }
    
    void imprimir(){
        System.out.println("Marca do Motor: "+ getMarca());
        System.out.println("Modelo do Motor: "+getModelo());
        System.out.println("Tipo de combustivel do Motor: "+getTipoCombustivel());
        System.out.println("Potencia do Motor: "+getPotencia());
        System.out.println("Rpm do Motor: "+getRpm());
        System.out.println("Rpm Maxima do Motor: "+getRpmMax());
        System.out.println("Numero de cilindradas do Motor: "+getNumCilindros());   
    }
    
    void acelerar(){
        rpm = getRpm()+ 100;
        System.out.println("Rpm do Motor apos acelerar: " +(getRpm()));
    }
    
    void desacelerar(){
        rpm = getRpm() - 100;
        System.out.println("Rpm do Motor apos desacelerar: "+(getRpm()));
    }
    
}    
