package trabalhopooa1;

import java.util.Scanner;

public class Iate extends VeiculosMaritmos{
    Scanner sc = new Scanner(System.in);
    int numerotripulantes, numerocabines;
    boolean piscina;
    Motor m2 = new Motor();

    //métodos setters    
    public void setNumeroTripulantes(int numerotripulantes) {
            this.numerotripulantes = numerotripulantes;
    }

    public void setNumeroCabines(int numerocabines){
        this.numerocabines = numerocabines;
    }

    public void setPiscina(boolean piscina){
        this.piscina = piscina;
    }
    
    public void setM2(Motor m2){
        this.m2 = m2;
    }
    
    
    // métodos getters
    
    public int getNumeroTripulantes(){
        return numerotripulantes;
    }

    public int getNumeroCabines(){
        return numerocabines;
    }
    
    public boolean getPiscina(){
        return piscina;        
    }
    
    public Motor getM2(){
        return m2;
    }

    public Iate(){
    
    }

    public Iate(String marca,String modelo){
    this.marca = marca;
    this.modelo = modelo;
    }

    public Iate(String marca, String modelo, double preco, String identificacao){ 

    }


    public Iate(String marca, String modelo, double preco, int numeropassageiros){
    }

    
    public Iate(String modelo, double preco, int numerocabines){ 

    }


    public Iate(double preco, String identificacao, int numeropassageiros){ 

    }


    public Iate(String marca, double preco, String identificacao){ 

    }

    public Iate(String identificacao, int numerocabines){ 

    }
    
    public Iate(double preco, int numerotripulantes){ 

    }

    
    public Iate(String modelo, int velocidademax, int numerotripulantes){ 

    }

    // cadastrar

    public void Cadastrar(String marca, String modelo, int numeropassageiros, 
                        int numerotripulantes, double preco, int velocidademax, 
                        String identificacao, int numerocabines, boolean piscina){
        super.cadastrar(marca, modelo, identificacao, numPassageiro, velocidademax, preco, motor1);
        setNumeroTripulantes(numerotripulantes);
        setNumeroCabines(numerocabines);
        setPiscina(piscina);
        setM2(m2);
    } 
    
    // imprimir 
    
    @Override
    void imprimir(){
        String resposta;
        super.imprimir();
        System.out.println("Numero Tripulantes" +numerotripulantes);
        System.out.println("Numero Cabines:" +numerocabines);
        System.out.println("identificacao"+identificacao);
        if ( piscina == true){
            resposta = "sim";
        }else{
            resposta = "não";
        }
        System.out.println("Piscina:" +resposta);
    }       
    //Entrada Dados
    @Override
    void entradaDados(){
        char condicao = 's';
        super.entradaDados();
        System.out.println("Numero Triupulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
        System.out.println("Numero Cabines");
        setNumeroCabines(Integer.parseInt(sc.nextLine()));
        System.out.println("Piscina");
        condicao = (sc.next().charAt(0));
        if(condicao == 's'){
            setPiscina(true);
        }else if(condicao == 'n'){
            setPiscina(false);
        }   
    }
    double valorDesconto(){
        return preco*0.92;
        
    }
    
    double pessoasPorCabine(){ 
        return numPassageiro/numerocabines;
    }
          
}



