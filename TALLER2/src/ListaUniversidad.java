
public class ListaUniversidad {

	private Universidad[] universidades;
	private int max_Universidades;
	private int cant_Universidades;
	
	public ListaUniversidad(int max_Universidades) {
		this.max_Universidades = 99;
		this.universidades = new Universidad[max_Universidades];
		this.cant_Universidades = 0;
	}

	public boolean inscribir_Universidad(String nombre) {
		Universidad nuevaUniversidad = new Universidad(nombre);
		for(int i = 0; i < max_Universidades; i++) {
			if(universidades[i] == null) {
				universidades[i] = nuevaUniversidad;
				cant_Universidades++;
				break;
			}
		}
		return true;
	}
	
	public boolean eliminar_Universidad(String universidad){
		for(int i = 0; i < cant_Universidades; i++) {
			if(universidades[i].getNombre().equals(universidad)) {
				for(int j = i; j < cant_Universidades - 1; j++) {
					universidades[j] = universidades[j+1];
				}
				cant_Universidades--;
				break;
			}
		}
		return true;
	}
	
	
	public void desplegar_Universidades_Participantes() {
		
	}
	
	/*public String desplegar_Universida_Mas_Alumnos_Becados() {
		
	}*/
	
	public void carreras_Mas_Alumnos_Becados(Alumno alumno, Carrera carrera) {
		
	}
	
	public Universidad[] getUniversidades() {
		return universidades;
	}

	public void setUniversidades(Universidad[] universidades) {
		this.universidades = universidades;
	}

	public int getMax_Universidades() {
		return max_Universidades;
	}

	public void setMax_Universidades(int max_Universidades) {
		this.max_Universidades = max_Universidades;
	}

	public int getCant_Universidades() {
		return cant_Universidades;
	}

	public void setCant_Universidades(int cant_Universidades) {
		this.cant_Universidades = cant_Universidades;
	}
	
	
}
