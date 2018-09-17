
package trabalhopooa1;

public class Lancha extends VeiculosMaritmosTipoCasco {
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
    
    //cadastrar
    
    
    //imprimir
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tem banheiro: " + getBanheiro());
    }
    
    @Override
    public void entradaDados(){
        super.entradaDados();
    }
}
