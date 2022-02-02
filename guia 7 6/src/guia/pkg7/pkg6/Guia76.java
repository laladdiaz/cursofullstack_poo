/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia.pkg7.pkg6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carla
 */
public class Guia76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafe=new Cafetera();
       int opcion, tamañoTaza,cantidadCafe;
       
       cafe.ingresoDatosCapacidad();
       
       do{
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("1.Llenar Cafetera");
            System.out.println("2.Servir Taza");
            System.out.println("3.Vaciar Cafetera");
            System.out.println("4.Agregar Cafe");
            System.out.println("5.Salir");
            System.out.println("-------------");
            System.out.println("Ingrese el numero de lo que desee realizar: ");    
            opcion = leer.nextInt();
            
        switch (opcion) {
                case 1:
                    cafe.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza: ");
                    tamañoTaza = leer.nextInt();
                    cafe.servirTaza(tamañoTaza);
                    break;
                case 3:
                    cafe.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese una cantidad de cafe para agregar a la cafetera:");
                    cantidadCafe = leer.nextInt();
                    cafe.agregarCafe(cantidadCafe);
                    break;
            }     
     }while(opcion != 5);
    
}
    }

