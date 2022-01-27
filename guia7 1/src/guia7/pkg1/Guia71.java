/*. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas*/
package guia7.pkg1;

public class Guia71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro l1 = new Libro();
       l1.pedirDatos();
       l1.imprimirDatos();
     
        
        
    }
    
}
