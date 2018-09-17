
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
    public Jetski() {
    }

    public Jetski(boolean reboque) {
        this.reboque = reboque;
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
        
    }
}

