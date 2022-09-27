
package Examen;
import java.util.*;
public class Persona {
    public String nombre;
    public String apellido;
    public String profesion;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSpellido() {
        return apellido;
    }

    public void setSpellido(String spellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
