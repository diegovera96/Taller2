import ucn.*;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {

		ListaUniversidad listaUniversidades = new ListaUniversidad(99);
		ListaCarrera listaCarreras = new ListaCarrera(99);

		Beca basica = new Beca("basica", 32000, 30);
		Beca normal = new Beca("normal", 40000, 20);
		Beca alta = new Beca("alta", 50000, 10);

		int opc1 = 0;
		while(opc1 != 5) {
			opc1 = 0;
			do {
				try {
					StdOut.println("[1] Ingresar.");
					StdOut.println("[2] Eliminar.");
					StdOut.println("[3] Modificar.");
					StdOut.println("[4] Estadisticas.");
					StdOut.println("[5] Salir.");
					
					StdOut.println("Ingrese una opcion.");
					String opc_I1 = StdIn.readLine();
					opc1 = Integer.parseInt(opc_I1);
					if(opc1 < 0 || opc1 > 5) {
						StdOut.println("Opcion no valida.");
					}
				}catch(NumberFormatException exc)
				{
					StdOut.println("Se ha ingresado una opcion no valida");
				}
			}while(opc1 == 0);
			
			switch(opc1) {
			case 1://ingresar
				int opc2 = 0;
				while(opc2 != 3) {
					do {
						try {
							StdOut.println("[1] Universidad.");
							StdOut.println("[2] Alumno.");
							StdOut.println("[3] Volver.");
							
							StdOut.println("Ingrese una opcion.");
							String opc_I2 = StdIn.readLine();
							opc2 = Integer.parseInt(opc_I2);
							if(opc2 < 0 || opc2 > 3) {
								StdOut.println("Opcion no valida.");
							}
						}catch(NumberFormatException exc)
						{
							StdOut.println("Se ha ingresado una opcion no valida");
						}
					}while(opc2 == 0);
					
					switch(opc2) {
					case 1://ingresar universidad
						StdOut.println("Ingrese el nombre de la universidad.");
						String nueva_U = StdIn.readLine();
						listaUniversidades.inscribir_Universidad(nueva_U);
						for(int i = 0; i < listaUniversidades.getCant_Universidades(); i++) {
							if(listaUniversidades.getUniversidades()[i].getNombre().equals(nueva_U)) {
								listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[0] = basica;
								listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[1] = normal;
								listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[2] = alta;
								break;
							}
						}
						break;
					case 2://ingresar alumno
						break;
					case 3://volver
						break;
					}
				}
				break;
			case 2://eliminar
				int opc3 = 0;
				while(opc3 != 3) {
					do {
						try {
							StdOut.println("[1] Universidad.");
							StdOut.println("[2] Alumno.");
							StdOut.println("[3] Volver.");
							
							StdOut.println("Ingrese una opcion.");
							String opc_I3 = StdIn.readLine();
							opc3 = Integer.parseInt(opc_I3);
							if(opc3 < 0 || opc3 > 3) {
								StdOut.println("Opcion no valida.");
							}
						}catch(NumberFormatException exc)
						{
							StdOut.println("Se ha ingresado una opcion no valida");
						}
					}while(opc3 == 0);
					switch(opc3) {
					case 1://eliminar universidad
						int opc4 = 0;
						do {
							if(listaUniversidades.getCant_Universidades() > 0){
								StdOut.println("Ingrese la opcion de la universidad que desea eliminar");
								for(int i = 0; i < listaUniversidades.getCant_Universidades(); i++) {
									StdOut.println("[" + i +"] " + listaUniversidades.getUniversidades()[i].getNombre());
								}
								try {
									String opc_I4 = StdIn.readLine();
									opc4 = Integer.parseInt(opc_I4);
									if(opc4 < 0 || opc4 >= listaUniversidades.getCant_Universidades()) {
										StdOut.println("Opcion no valida.");
										opc4 = -1;
									}
								}catch(NumberFormatException exc)
								{
									StdOut.println("Se ha ingresado una opcion no valida");
									opc4 = -1;
								}
								for(int j = 0; j < listaCarreras.getCant_Carreras(); j++) {
									if(listaCarreras.getCarreras()[j].getUniversidad().equals(listaUniversidades.getUniversidades()[opc4].getNombre())) {
										listaCarreras.eliminar_Carrera(listaUniversidades.getUniversidades()[opc4].getNombre(), listaCarreras.getCarreras()[j].getNombre());
									}
								}
								listaUniversidades.eliminar_Universidad(listaUniversidades.getUniversidades()[opc4].getNombre());
							}else {
								StdOut.println("No hay universidades registradas.");
								break;
							}
						}while(opc4 == -1);
						
						break;
					case 2://eliminar alumno
						break;
					case 3://volver
						break;
					}
				}
				break;
			case 3://modificar
				int opc4 = 0;
				while(opc4 != 4) {
					do {
						try {
							StdOut.println("[1] Universidad.");
							StdOut.println("[2] Alumno.");
							StdOut.println("[3] Beca.");
							StdOut.println("[4] Volver.");
							
							StdOut.println("Ingrese una opcion.");
							String opc_I4 = StdIn.readLine();
							opc4 = Integer.parseInt(opc_I4);
							if(opc4 < 0 || opc4 > 4) {
								StdOut.println("Opcion no valida.");
							}
						}catch(NumberFormatException exc)
						{
							StdOut.println("Se ha ingresado una opcion no valida");
						}
					}while(opc4 == 0);
					switch(opc4) {
					case 1://modificar universidad
						int opc5 = 0;
						while(opc5 != 3) {
							do {
								try {
									StdOut.println("[1] Inscribir carrera.");
									StdOut.println("[2] Eliminar carrera.");
									StdOut.println("[3] Volver.");
									
									StdOut.println("Ingrese una opcion.");
									String opc_I5 = StdIn.readLine();
									opc5 = Integer.parseInt(opc_I5);
									if(opc5 < 0 || opc5 > 3) {
										StdOut.println("Opcion no valida.");
									}
								}catch(NumberFormatException exc)
								{
									StdOut.println("Se ha ingresado una opcion no valida");
								}
							}while(opc5 == 0);
							switch(opc5) {
							case 1://inscribir carrera
								int opc6 = 0;
								String nuevaCarrera = "";
								if(listaUniversidades.getCant_Universidades() > 0){
									StdOut.println("Ingrese la opcion de la universidad que desea inscribir una carrera");
									for(int i = 0; i < listaUniversidades.getCant_Universidades(); i++) {
										StdOut.println("[" + i +"] " + listaUniversidades.getUniversidades()[i].getNombre());
									}
									try {
										String opc_I6 = StdIn.readLine();
										opc6 = Integer.parseInt(opc_I6);
										StdOut.println("Ingrese el nombre de la carrera");
										nuevaCarrera = StdIn.readLine();
										if(opc6 < 0 || opc6 >= listaUniversidades.getCant_Universidades()) {
											StdOut.println("Opcion no valida.");
										}
									}catch(NumberFormatException exc)
									{
										StdOut.println("Se ha ingresado una opcion no valida");
									}
									
									Carrera nCarrera = listaCarreras.inscribir_Carrera(nuevaCarrera, listaUniversidades.getUniversidades()[opc6].getNombre());
									StdOut.println(listaUniversidades.getUniversidades()[opc6].getCantCarreras());
									for(int j = 0; j < listaUniversidades.getUniversidades()[opc6].getListaCarreras().getMax_Carreras(); j++) {
										if(listaUniversidades.getUniversidades()[opc6].getListaCarreras().getCarreras()[j] == null) {
											listaUniversidades.getUniversidades()[opc6].getListaCarreras().getCarreras()[j] = nCarrera;
											listaUniversidades.getUniversidades()[opc6].setCantCarreras(listaUniversidades.getUniversidades()[opc6].getCantCarreras()+1);
											StdOut.println(listaUniversidades.getUniversidades()[opc6].getCantCarreras());
											break;
										}
									}
								}else {
									StdOut.println("No hay universidades registradas.");
									break;
								}
								break;
							case 2://eliminar carrera
								int opc7_1 = 0;
								int opc7_2 = 0;
								
								do {
									if(listaUniversidades.getCant_Universidades() > 0) {
										StdOut.println("Ingrese la opcion de la universidad que desea eliminar");
										for(int i = 0; i < listaUniversidades.getCant_Universidades(); i++) {
											StdOut.println("[" + i +"] " + listaUniversidades.getUniversidades()[i].getNombre());
										}
										try {
											String opc_I7_1 = StdIn.readLine();
											opc7_1 = Integer.parseInt(opc_I7_1);
											if(opc7_1 < 0 || opc7_1 >= listaUniversidades.getCant_Universidades()) {
												StdOut.println("Opcion no valida.");
												opc7_1 = -1;
											}
										}catch(NumberFormatException exc)
										{
											StdOut.println("Se ha ingresado una opcion no valida");
											opc7_1 = -1;
										}
									}else {
										StdOut.println("No hay universidades registradas.");
										break;
									}
								}while(opc7_1 == -1);
								
								do {
									if(listaUniversidades.getUniversidades()[opc7_1].getCantCarreras()>0) {
										StdOut.println("Ingrese la opcion de la carrera que desea eliminar");
										for(int j = 0; j <= listaUniversidades.getUniversidades()[opc7_1].getListaCarreras().getCant_Carreras(); j++) {
											StdOut.println("[" + j +"] " + listaUniversidades.getUniversidades()[opc7_1].getListaCarreras().getCarreras()[j].getNombre());
										}
										try {	
											String opc_I7_2 = StdIn.readLine();
											opc7_2 = Integer.parseInt(opc_I7_2);
											if(opc7_2 < 0 || opc7_2 >= listaCarreras.getCant_Carreras()) {
												StdOut.println("Opcion no valida.");
												opc7_2 = -1;
											}
										}catch(NumberFormatException exc)
										{
											StdOut.println("Se ha ingresado una opcion no valida");
											opc7_2 = -1;
										}
									}else {
										StdOut.println("No hay carreras registradas.");
										break;
									}
								}while(opc7_2 == -1);
								
								if(listaUniversidades.getUniversidades()[opc7_1].getCantCarreras()>0) {
									listaCarreras.eliminar_Carrera(listaUniversidades.getUniversidades()[opc7_1].getNombre(), listaCarreras.getCarreras()[opc7_2].getNombre());
									listaUniversidades.getUniversidades()[opc7_1].setCantCarreras(listaUniversidades.getUniversidades()[opc7_1].getCantCarreras()-1);
								}
								break;
							case 3://volver
								break;
							}
						}
						break;
					case 2://modificar alumno
						break;
					case 3://modificiar beca
						int opc8_1 = 0;
						int opc8_2 = 0;
						while(opc8_1 != 3) {
							do {
								try {
									StdOut.println("[1] Monto.");
									StdOut.println("[2] Cupos e universidad.");
									StdOut.println("[3] Volver.");
									
									String opc_I8_1 = StdIn.readLine();
									opc8_1 = Integer.parseInt(opc_I8_1);
									if(opc8_1 < 0 || opc8_1 > 3) {
										StdOut.println("Opcion no valida.");
										opc8_1 = -1;
									}
								}catch(NumberFormatException exc)
								{
									StdOut.println("Se ha ingresado una opcion no valida");
									opc8_1 = -1;
								}
							}while(opc8_1 == -1);
							
							if(opc8_1 != 3) {
								do {
									try {
										StdOut.println("[0] Basica.");
										StdOut.println("[1] Normal.");
										StdOut.println("[2] Alta.");
										
										String opc_I8_2 = StdIn.readLine();
										opc8_2 = Integer.parseInt(opc_I8_2);
										if(opc8_2 < 0 || opc8_2 > 2) {
											StdOut.println("Opcion no valida.");
											opc8_2 = -1;
										}
									}catch(NumberFormatException exc)
									{
										StdOut.println("Se ha ingresado una opcion no valida");
										opc8_2 = -1;
									}
								}while(opc8_2 == -1);
							}
							switch(opc8_1) {
							case 1:
								int ex = 0;
								int nuevoMonto = 0;
								do {
									ex = 0;
									try {
										StdOut.println("Ingrese el nuevo monto.");
										String monto = StdIn.readLine();
										nuevoMonto = Integer.parseInt(monto);
										if(nuevoMonto < 0) {
											StdOut.println("Valor no valida.");
											ex = -1;
										}
										
									}catch(NumberFormatException exc) {
										StdOut.println("Se ha ingresado una opcion no valida");
										ex = -1;
									}
								}while(ex == -1);
								int i = 0;
								for(i = 0; i < listaUniversidades.getCant_Universidades(); i++) {
									if(listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[opc8_2].getTipo().equals("basica")) {
										listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[opc8_2].setMonto(nuevoMonto);
									}else {
										if(listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[opc8_2].getTipo().equals("normal")) {
											listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[opc8_2].setMonto(nuevoMonto);
										}else {
											if(listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[opc8_2].getTipo().equals("alta")) {
												listaUniversidades.getUniversidades()[i].getListaBecas().getBecas()[opc8_2].setMonto(nuevoMonto);
											}
										}
									}
								}
								StdOut.println(listaUniversidades.getUniversidades()[0].getListaBecas().getBecas()[opc8_2].getMonto());
								break;
							case 2:
								break;
							case 3:
								break;
							}
						}
						break;
					case 4://volver
						break;
					}
				}
				break;
			case 4://estadisticas
				break;
			case 5://salir
				break;
			}
		}
	}
}
