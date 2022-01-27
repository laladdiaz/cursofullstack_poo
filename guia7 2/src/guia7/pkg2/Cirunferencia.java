package guia7.pkg2;

import java.util.Scanner;

/**
 *
 * @author Carla
 */
public class Cirunferencia {

    private double radio;

    public Cirunferencia() {
    }

    public Cirunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void CrearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese radio");
        radio = leer.nextDouble();
    }

    public void CrearArea() {
        double area;
        area = radio * 3.14;
        System.out.println("El area calculada fue de: " + area);
    }

    public void CrearPerimetro() {
        double perimetro;
        perimetro = 3.14 * 2 * radio;
        System.out.println("El perimetro obtenido fue de " + perimetro);
    }
}
