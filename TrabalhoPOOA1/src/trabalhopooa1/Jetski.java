
package trabalhopooa1;

public class Jetski extends VeiculosMaritmosTipoCasco{
    boolean reboque;
    
    //setters
    public void setReboque(boolean reboque){
        this.reboque = reboque;
    }

    //getters
    public boolean getReboque(){
        return reboque;
    }
    
    //construtores
    public Jetski(String tipoCasco) {
        super(tipoCasco);
    }

    public Jetski(char tipo, String tipoCasco) {
        super(tipo, tipoCasco);
    }

    public Jetski(String tipoCasco, char tipo) {
        super(tipoCasco, tipo);
    }

    public Jetski() {
    }

    public Jetski(boolean reboque) {
        this.reboque = reboque;
    }

    public Jetski(boolean reboque, char tipo) {
        super(tipo);
        this.reboque = reboque;
    }

    public Jetski(boolean reboque, String tipoCasco) {
        super(tipoCasco);
        this.reboque = reboque;
    }

    public Jetski(boolean reboque, char tipo, String tipoCasco) {
        super(tipo, tipoCasco);
        this.reboque = reboque;
    }

    public Jetski(char tipo) {
        super(tipo);
    }
    
    
    
    public void cadastrar(char tipo, String tipoCasco, boolean reboque){
        super.cadastrar(tipo, tipoCasco);
        setReboque(reboque);
    }
    
    @Override
    public void entradaDados(){
        super.entradaDados();
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
    }
    
    public double valorDesconto(){
        return  preco * 0.85;
    }
}

