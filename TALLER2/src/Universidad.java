
public class Universidad {
	
	private String nombre;
	private boolean inscripcion;
	private ListaCarrera listaCarreras;
	private ListaBeca listaBecas;
	private int cantCarreras;
	public Universidad(String nombre) {
		this.nombre = nombre;
		this.inscripcion = true;
		this.listaCarreras = new ListaCarrera(99);
		this.listaBecas = new ListaBeca(3);
		this.cantCarreras = 0;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isInscripcion() {
		return inscripcion;
	}
	public void setInscripcion(boolean inscripcion) {
		this.inscripcion = inscripcion;
	}
	public ListaCarrera getListaCarreras() {
		return listaCarreras;
	}
	public void setListaCarreras(ListaCarrera listaCarreras) {
		this.listaCarreras = listaCarreras;
	}
	public int getCantCarreras() {
		return cantCarreras;
	}
	public void setCantCarreras(int cantCarreras) {
		this.cantCarreras = cantCarreras;
	}
	public ListaBeca getListaBecas() {
		return listaBecas;
	}
	public void setListaBecas(ListaBeca listaBecas) {
		this.listaBecas = listaBecas;
	}
	
}
