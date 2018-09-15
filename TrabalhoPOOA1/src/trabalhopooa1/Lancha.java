
package trabalhopooa1;

public class Lancha extends VeiculosMaritmosTipoCasco {
    boolean banheiro;

    public void setBanheiro(boolean banheiro) {
            this.banheiro = banheiro;
    }

    public boolean getBanheiro() {
            return banheiro;
    }

    public Lancha() {
    }

    public Lancha(boolean banheiro) {
            this.banheiro = banheiro;
    }
}
