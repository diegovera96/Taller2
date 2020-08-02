
public class ListaCarrera {

	private Carrera[] carreras;
	private int max_Carreras;
	private int cant_Carreras;
	public ListaCarrera(int max_Carreras) {
		this.max_Carreras = 99;
		this.carreras = new Carrera[max_Carreras];
		this.cant_Carreras = 0;
	}
	
	public Carrera inscribir_Carrera(String nombre, String universidad){
		Carrera nuevaCarrera = new Carrera(nombre, universidad);
		for(int i = 0; i < max_Carreras; i++) {
			if(carreras[i] == null) {
				carreras[i] = nuevaCarrera;
				cant_Carreras++;
				break;
			}
		}
		return nuevaCarrera;
	}
	
	public boolean eliminar_Carrera(String universidad, String carrera){
		for(int i = 0; i < cant_Carreras; i++) {
			if(carreras[i].getNombre().equals(carrera)) {
				for(int j = i; j < cant_Carreras - 1; j++) {
					carreras[j] = carreras[j+1];
				}
				cant_Carreras--;
				break;
			}
		}
		return true;
	}
	
	public Carrera[] getCarreras() {
		return carreras;
	}
	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	public int getMax_Carreras() {
		return max_Carreras;
	}
	public void setMax_Carreras(int max_Carreras) {
		this.max_Carreras = max_Carreras;
	}
	public int getCant_Carreras() {
		return cant_Carreras;
	}
	public void setCant_Carreras(int cant_Carreras) {
		this.cant_Carreras = cant_Carreras;
	}
	
}
