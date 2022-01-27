package guia7.pkg3;

import java.util.Scanner;

public class operacion {

    private double numero1;
    private double numero2;

    public operacion() {
    }

    public operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void CrearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero ");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese segundo numero ");
        numero2 = leer.nextDouble();

    }

    public void Sumar() {
        double suma;
        suma = numero1 + numero2;
        System.out.println("El resultado de la operacion sumar fue " + suma);
    }

    public void Resta() {
        double resta;
        resta = numero1 - numero2;
        System.out.println("El resultado de la operacion restar fue " + resta);
    }

    public void Multiplicar() {
        double multiplicacion;
        if (numero2 == 0 || numero1 == 0) {
            System.out.println("Multiplicacion no permitida");
        } else {
            multiplicacion = numero1 * numero2;
            System.out.println("El resultado de la operacion multiplicar fue " + multiplicacion);
        }

    }

    public void Division() {
        double division;
        if (numero2 == 0 || numero1 == 0) {
            System.out.println("Division no permitida");
        } else {
            division = numero1 / numero2;
            System.out.println("El resultado de la operacion division fue " + division);
        }

    }
}
