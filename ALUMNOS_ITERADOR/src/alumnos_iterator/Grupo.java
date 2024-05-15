package alumnos_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno> {

	private ArrayList<Alumno> alumnos;
	/**
	 * @param nombre
	 */
	public Grupo(String nombre) {
		super();
		this.alumnos= new ArrayList<>();
	}
	
	
	public void agregarAlumno(Alumno a) {
		alumnos.add(a);
	}
		
		@Override
	public Iterator<Alumno> iterator() {													//aqui hacemos nuestro propio iterador con las condiciones que le queramos poner
		return new Iterator<Alumno>(){														//este es el nuevo iterator con elementos de la clase Alumno 
			private int posicion=0;															
			
			@Override
			public boolean hasNext() {														//Aqui muestra los alumnos que tengan nia
				// TODO Esbozo de método generado automáticamente
			while( posicion<alumnos.size() && alumnos.get(posicion).getNia() ==null){
					posicion++;
				}
			return posicion <alumnos.size();
				}

			@Override
			public Alumno next() {
				// TODO Esbozo de método generado automáticamente
				return alumnos.get( posicion++);
			}
			
		};
		}
}
	
	
		
		

