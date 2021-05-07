
package py.com.devrod.sga.domain;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final long serialVersionUID=1L;
    private int idPersona;
    private String nombte, apellido, correo, telefono;

    public Persona() {
    }

    public Persona(String nombte, String apellido, String correo, String telefono) {
        this.nombte = nombte;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombte() {
        return nombte;
    }

    public void setNombte(String nombte) {
        this.nombte = nombte;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombte=" + nombte + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
}
