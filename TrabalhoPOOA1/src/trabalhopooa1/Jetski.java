
package trabalhopooa1;

public class Jetski extends VeiculosMaritmosTipoCasco{
    boolean reboque;
    
    //setters
    public void setReboque(){
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
    
    @Override
    public void entradaDados(){
        super.entradaDados();
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
    }
}

