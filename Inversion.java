
package Examen;
import java.util.*;
public class Inversion extends Inversionistas{
    public float cantidadI;
    public float cantidadF;
    public float resultado;
    
    public Inversion(){
        
    }
    
    public Inversion(float cantidadI, float cantidadF, float resultado) {
        this.cantidadI = cantidadI;
        this.cantidadF = cantidadF;
        this.resultado = resultado;
    }

    public void Operacion(){
        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        cantidadI = teclado.nextFloat();

        System.out.print( "Introduzca segundo número: " );
        cantidadF = teclado.nextFloat();

        resultado = cantidadI + cantidadF;

        System.out.println( "La suma de " + cantidadI + " más " + cantidadF + " es " + resultado + "." );
        
    }
    public float getCantidadI() {
        return cantidadI;
    }

    public void setCantidadI(float cantidadI) {
        this.cantidadI = cantidadI;
    }

    public float getCantidadF() {
        return cantidadF;
    }

    public void setCantidadF(float cantidadF) {
        this.cantidadF = cantidadF;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    
}
