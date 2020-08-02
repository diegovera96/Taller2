
public class Beca {

	private String tipo;
	private int monto;
	private int cupos_Totales;
	public Beca(String tipo, int monto, int cupos_Totales) {
		this.tipo = tipo;
		this.monto = monto;
		this.cupos_Totales = cupos_Totales;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getCupos_Totales() {
		return cupos_Totales;
	}
	public void setCupos_Totales(int cupos_Totales) {
		this.cupos_Totales = cupos_Totales;
	}
}
