
package guia.pkg7.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carla
 */
public class Cuenta {
    private int num_cliente;
    private long dni_cliente;
    private double saldo_actual;

    public Cuenta() {
    }

    public Cuenta(int num_cliente, long dni_cliente, double saldo_actual) {
        this.num_cliente = num_cliente;
        this.dni_cliente = dni_cliente;
        this.saldo_actual = saldo_actual;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public long getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(long dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese DNI");
        dni_cliente= leer.nextLong();
        System.out.println("Ingrese numero de cuenta");
        num_cliente=leer.nextInt();
       saldo_actual=0;
    }
    
    public void ingresar(double ingreso){
        this.saldo_actual=ingreso;
    }
    
    public void retirar(double retiro){
        if(this.saldo_actual >= retiro){
            this.saldo_actual-=retiro;
        }else{
            this.saldo_actual=0;
        }
    }
    
    public void extraccionRapida(){
        double retiro;
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese el monto a retirar");
         retiro=leer.nextDouble();
         if(retiro <= (this.saldo_actual*0.2)){
             System.out.println("Retirando...");
             this.saldo_actual-=retiro;
         }else{
             System.out.println("No debe retirar mas del %20");
         }
    }
    
    
    public void consultarSaldo(){
        System.out.println("Su saldo disponible en la cuenta es: $"+saldo_actual);
    }
    
    public void consultarDatos(){
        System.out.println("Sus datos de la cuenta:");
        System.out.println("Numero de Cuenta: "+num_cliente);
        System.out.println("DNI: "+dni_cliente);
        System.out.println("Saldo actual: $"+saldo_actual);
    }
}
