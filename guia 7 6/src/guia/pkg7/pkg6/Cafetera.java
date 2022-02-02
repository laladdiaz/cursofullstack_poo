
package guia.pkg7.pkg6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carla
 */
public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
    public void ingresoDatosCapacidad(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese capacidad maxima de cafetera");
        capacidadMaxima=leer.nextInt();
    }
    public void llenarCafetera(){
       capacidadActual=capacidadMaxima;
        System.out.println("Capacidad actual: "+capacidadActual);
    }
    
    public void servirTaza(int tamañoTaza){
        int taza,informe;
        
        if(capacidadActual<tamañoTaza){
            taza=capacidadActual;
            informe=tamañoTaza-capacidadActual;
            System.out.println("La taza se lleno a: "+taza);
            System.out.println("pero quedo a favor por faltante de la misma: "+informe);
        }else{
            taza=capacidadActual;
            informe=tamañoTaza-capacidadActual;
            System.out.println("Quedan actualmente de reserva: "+informe);
        }
    }
    
    public void vaciarCafetera(){
        capacidadActual=0;
    }
    
    public void agregarCafe(int agregar){
        if(capacidadActual<=capacidadMaxima){
            if(capacidadMaxima>agregar){
                capacidadActual=+agregar;
            }else{
                System.out.println("La carga superara la carga maxima");
            }
           
        }else{
            System.out.println("Cafeterea al limite");
        }
       
    }
    
}
