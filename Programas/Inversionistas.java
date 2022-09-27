
package Examen;
import java.util.*;
public class Inversionistas extends Persona{
    public int cuenta;
    public int presupuesto;
    public int patrimonio;
    
    public Inversionistas(){
        
    }

    public Inversionistas(String nombre, String apellido, String profesion, int cuenta, int presupuesto, int patrimonio) {
        super(nombre, apellido, profesion);
        this.cuenta = cuenta;
        this.presupuesto = presupuesto;
        this.patrimonio = patrimonio;
    }
    
    Scanner entrada = new Scanner(System.in);
    public void Ingresar(){
        System.out.println("Ingresando los datos del proveedor");
        System.out.println("Nombre del inversionista: ");
        nombre = entrada.next();
        System.out.println("Apellidos del inversionista: ");
        apellido = entrada.next();
        System.out.println("Profesion:  ");
        profesion = entrada.next();
        System.out.println("No cuenta:  ");
        cuenta = entrada.nextInt();
        System.out.println("presupuesto: ");
        presupuesto = entrada.nextInt();
        System.out.println("Patrimonio:  ");
        patrimonio = entrada.nextInt();
        
        System.out.println("Mostrar datos del inversionista:\n"+"Proveedor: " + nombre + "\nApellidos: " + apellido + "\nProfesion: " +profesion);
        System.out.println("Datos de su cuenta:\n"+"Cuenta: " + cuenta + "\nPresupuesto: " + presupuesto + "\nPatrimonio: " +patrimonio);
    }
    
    public void verDatos(){
        System.out.println("Mostrar datos del inversionista:\n"+"Proveedor: " + nombre + "\nApellidos: " + apellido + "\nProfesion: " +profesion);
        System.out.println("Datos de su cuenta:\n"+"Cuenta: " + cuenta + "\nPresupuesto: " + presupuesto + "\nPatrimonio: " +patrimonio);
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }
    
    
}
