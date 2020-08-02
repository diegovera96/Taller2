
public class ListaBeca {
	private int max_Becas;
	private int cantidad_Becas;
	private Beca[] becas;
	public ListaBeca(int max_Becas) {
		this.max_Becas = 3;
		this.cantidad_Becas = 3;
		this.becas = new Beca[max_Becas];
	}
	
	public void nuevo_Monto() {
		
	}
	
	public void nuevo_Cupo() {
		
	}
	public int getMax_Becas() {
		return cantidad_Becas;
		
	}

	public int getCantidad_Becas() {
		return cantidad_Becas;
	}

	public void setCantidad_Becas(int cantidad_Becas) {
		this.cantidad_Becas = cantidad_Becas;
	}

	public Beca[] getBecas() {
		return becas;
	}

	public void setBecas(Beca[] becas) {
		this.becas = becas;
	}

	public void setMax_Becas(int max_Becas) {
		this.max_Becas = max_Becas;
	}
}
