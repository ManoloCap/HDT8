/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

public class paciente implements Comparable<paciente>{
    
    private String nombre;
    private String descripcion;
    private String nivel;
    
    public paciente(String nombre, String descripcion, String nivel){
        super();
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.nivel = nivel;
    }
    public int compareTo(paciente otroPaciente) {
	// TODO Auto-generated method stub
	return nivel.compareTo(otroPaciente.getNivel());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    
}
    

