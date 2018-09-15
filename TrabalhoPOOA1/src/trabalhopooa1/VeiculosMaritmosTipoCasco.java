
package trabalhopooa1;


public class VeiculosMaritmosTipoCasco extends VeiculosMaritmos{
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
    
    //cadastrar
    public void cadastrar(char tipo, String tipoCasco){
        setTipo(tipo);
        setTipoCasco(tipoCasco);
    }
    
}	
	
	
