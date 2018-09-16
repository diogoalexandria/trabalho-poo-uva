package trabalhopooa1;

import java.util.Scanner;


public class Iate extends VeiculosMaritimos{
    int numerotripulantes, numerocabines;
    boolean piscina;
    Motor m2 = new motor2;

    //métodos setters
    
    
    public void setNumeroTripulantes(int numerotripulantes) {
            this.numerotripulantes = numerotripulantes;
    }

    public void setNumeroCabines(int numerocabines){
        this.numerocabines = numerocabines;
    }

    public boolean setPiscina(boolean piscina){
        this.piscina = piscina;
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

    public void Cadastrar(String marca, String modelo, int numeropassageiros, int numerotripulantes, double preco, int velocidademax, String identificacao, int numerocabines, boolean piscina){
    setMarca(marca);
    setModelo(modelo);
    setNumeroPassageiros(numeropassageiros);
    setNumeroTripulantes(numerotripulantes);
    setNumeroCabines(numerocabines);
    setVelocidadeMaxima(velocidademax);
    setIdentificacao(identificacao);
    setPiscina(piscina);
    } 
    
    // imprimir 
    
    void imprimir(){
        String resposta;
    
        System.out.println("Marca:" + marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Numero Passageiros" +numeropassageiros);
        System.out.println("Numero Tripulantes" +numerotripulantes);
        System.out.println("Numero Cabines:" +numerocabines);
        System.out.println("Velocidade Maxima" +velocidademax);
        System.out.println("identificacao"+identificacao);
        if ( piscina == true){
            resposta = "sim";
        }else{
            resposta = "não";
        }
        System.out.println("Piscina:" +resposta);
    }       
    //Entrada Dados
    void EntradaDados(){
        Scanner sc = new Scanner(System.in);
        char condicao = 's';
        System.out.println("Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Numero Passageiros");
        setNumeroPassageiros(sc.nextLine());
        System.out.println("Numero Triupulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
        System.out.println("Numero Cabines");
        setNumeroCabines(Integer.parseInt(sc.nextLine()));
        System.out.println("Velocidade Maxima:");
        setVelocidadeMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Identificação");
        setIdentificacao(sc.nextLine());
        System.out.println("Piscina");
        condicao = (sc.next().charAt(0));
        if(condicao == 's'){
            setPiscina(true);
        }else if(condicao == 'n'){
            setPiscina(false);
        }   
    }
    double ValorDesconto(){
        return preco*0.92;
        
    }
    
    double PessoasPorCabine(){ 
        return numeropassageiros/numerodecabines;
    }
          
}



