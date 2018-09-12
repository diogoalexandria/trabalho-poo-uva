
public class VeiculosMaritmosTipoCasco extends VeiculosMaritmos{
	char tipo;
	String tipoCasco;
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public String getTipoCasco() {
		return tipoCasco;
	}
	
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
}	
	
	
