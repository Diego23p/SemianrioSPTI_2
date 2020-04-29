package edu.escuelaing.arep.Model;
/**
 * Clase materia
 *
 */
public class materia {
	
	private String nemonico;
	private String profesor;
	private int creditos;
	private String nombre;
	
	/**
	 *  Devuelve el nemonico
	 * @return nemonico
	 */
	public int getNemonico() {
		return nemonico;
	}
	
	/**
	 * Asigna nemonico a la variable dada
	 * @param nemonico
	 */
	public void setNemonico(int nemonico) {
		this.nemonico = nemonico;
	}
	
	/**
	 *  Devuelve el profesor
	 * @return profesor
	 */
	public String getProfesor() {
		return profesor;
	}
	
	/**
	 * Asigna profesor a la variable dada
	 * @param profesor
	 */
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
		/**
	 *  Devuelve el numero de creditos
	 * @return creditos
	 */
	public int getCreditos() {
		return creditos;
	}
	
	/**
	 * Asigna creditos a la variable dada
	 * @param creditos
	 */
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	/**
	 *  Devuelve el nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Asigna nombre a la variable dada
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
