package alumnos_iterator;

import java.util.Iterator;

public class Instituto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
Grupo dam =new Grupo("1DAM");

dam.agregarAlumno(new Alumno("Pepe","1111A",25));
dam.agregarAlumno(new Alumno("Juan","1112A",15));
dam.agregarAlumno(new Alumno("Luisa",null,21));
dam.agregarAlumno(new Alumno("Diego","1114A",45));
dam.agregarAlumno(new Alumno("Silvia","1115A",55));

	Iterator<Alumno> iteradorGrupo = dam.iterator();
	
	while (iteradorGrupo.hasNext()) {				//esto hace un efecto sobre el array igual al 
		System.out.println(iteradorGrupo.next());	//for each...siempre hay que instanciar el iterator anterior
	}												//es el iterador hecho en la clase grupo
	
	
	
	
	}
}
/*Este proyecto hace un ArrayList en la clase grupo de elementos de la clase Alumno
 * Implementa la interfaz Iterable para poder usa iterator que se usa para recorrer el arraylist
 * creado en grupo 
 */