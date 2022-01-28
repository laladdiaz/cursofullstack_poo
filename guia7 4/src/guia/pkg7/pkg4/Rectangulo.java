package guia.pkg7.pkg4;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base del rectangulo");
        base = leer.nextDouble();
        if (base < 0) {
            System.out.println("Solo valores positivos");
            base = 0;
        }

        System.out.println("Ingrese altura del rectangulo");
        altura = leer.nextDouble();
        if (altura < 0) {
            System.out.println("Solo valores positivos");
            altura = 0;
        }
        System.out.println();
    }

    public void calculoSuperficieRectangulo() {
        double superficie;
        if (base == 0 || altura == 0) {
            System.out.println("Operacion calculo superficie no permitida, ingreso valores negativos");
        } else {
            superficie = base * altura;
            System.out.println("Superficie del rectangulo " + superficie);
        }
        System.out.println();
    }

    public void calculoPerimetroRectangulo() {
        double perimetro;
        if (base == 0 || altura == 0) {
            System.out.println("Operacion calculo perimetro no permitida, ingreso valores negativos");
        } else {
            perimetro = (base + altura) * 2;
            System.out.println("Perimetro del rectangulo "+perimetro);
        }
        System.out.println();
    }

    public void dibujarRectangulo() {
        if (base == 0 || altura == 0) {
            System.out.println("Operacion dibujar rectangulo no permitida, ingreso valores negativos");
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
