
package Examen;
import java.util.*;
public class Principal {
    public static void main(String[] args){
        Inversionistas inv = new Inversionistas();
        inv.setNombre("Juanito alcachofa");
        Inversionistas inv1 = new Inversionistas();
        inv1.setCuenta(1870397);
        Inversion in = new Inversion();
        in.setCantidadI(50000);
        System.out.println("Inversionistas: " + inv.getNombre());
        System.out.println("No. de cuenta: " + inv.getCuenta());
        System.out.println("Datos del banco");
        Inversionistas inv2 = new Inversionistas();
        inv2.Ingresar();
        System.out.println("Operacion realizada para invertir tus fondos " );
        Inversion ope = new Inversion();
        ope.Operacion();
        
    }
}
