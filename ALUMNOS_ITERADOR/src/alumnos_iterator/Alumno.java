package alumnos_iterator;

public class Alumno {

	
	private String nombre;
	private String nia;
	private int edad;
	
	
	
	/**
	 * @param nombre
	 * @param nia
	 * @param edad
	 */
	public Alumno(String nombre, String nia, int edad) {
		super();
		this.nombre = nombre;
		this.nia = nia;
		this.edad = edad;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el nia
	 */
	public String getNia() {
		return nia;
	}
	/**
	 * @param nia el nia a establecer
	 */
	public void setNia(String nia) {
		this.nia = nia;
	}
	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
