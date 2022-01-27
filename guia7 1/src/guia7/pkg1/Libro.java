
package guia7.pkg1;

import java.util.Scanner;


public class Libro {
    private  Integer isbn;
    private String titulo;
    private String autor;
    private Integer paginas;
    

    public Libro() {
    }

    public Libro(Integer isbn, String titulo, String autor, Integer paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    
    
    public void pedirDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero de isbn");
        isbn=leer.nextInt();
        System.out.println("Ingrese nombre del libro");
        titulo=leer.next();
        System.out.println("Ingrese autor");
        autor=leer.next();
        System.out.println("Inserte paginas");
        paginas=leer.nextInt();
    }
    
    public void imprimirDatos(){
         System.out.println("Datos ingresados por consola");
         System.out.println("Codigo: "+ isbn);
         System.out.println("Titulo: "+ titulo);
         System.out.println("Autor: "+ autor);
         System.out.println("Paginas: "+ paginas);
    }
}
