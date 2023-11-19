
package modelo;

/**
 *
 * @author andre
 */
public class Alumno {
    
    
    private int rut;
    private String nombre, direccion;

    public Alumno() {
    }

    public Alumno(int rut, String nombre, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
