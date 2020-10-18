package DigiCont;

public class CadastroAgua {

	private int consumo;
	private int totalPagar;
	private int mesConta;
	private float valorAgua;
	private float valorEsgoto;
	
	
	// Construtores
	
	public CadastroAgua(int consumo, int totalPagar, int mesConta, float valorAgua, float valorEsgoto) {
		super();
		this.consumo = consumo;
		this.totalPagar = totalPagar;
		this.mesConta = mesConta;
		this.valorAgua = valorAgua;
		this.valorEsgoto = valorEsgoto;
		
	}
		
	public int getConsumo() {
		return consumo;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public float getValorAgua() {
		return valorAgua;
	}
	
	public void setValorAgua(float valorAgua) {
		this.valorAgua = valorAgua;
	}
	
	public int getMesConta() {
		return mesConta;
	}
	
	public void setMesConta(int mesConta) {
		this.mesConta = mesConta;
	}
	
	public float getValorEsgoto() {
		return valorEsgoto;
	}
	
	public void setValorEsgoto(float valorEsgoto) {
		this.valorEsgoto = valorEsgoto;
	}

	public int getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(int totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	
}
