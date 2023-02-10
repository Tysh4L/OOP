package eva1_3_constructores;
/**
 *
 * @author danna
 */
public class EVA1_3_CONSTRUCTORES {
    /*
        Clase CuentaBamcaria
        String numero de cuenta
        Double saldo
        String cliente
        Atributos: variables de la clase
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1 = new CuentaBancaria("1", 60, "Danna Lopez");
        /*cuenta1.setcliente("Carlos Slim");
        cuenta1.setnumCuenta("1");
        cuenta1.setsaldo(40000000);*/
        
        System.out.println("Datos del cliente: ");
        String nombre = cuenta1.getcliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getnumCuenta());
        System.out.println(cuenta1.getsaldo());
        //--------------------------------
        CuentaBancaria cuenta2 = new CuentaBancaria("2", 20, "Victor Gomez");
        System.out.println("Datos del cliente: ");
        System.out.println(cuenta2.getcliente());
        System.out.println(cuenta2.getnumCuenta());
        System.out.println(cuenta2.getsaldo());
        //--------------------------------
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("Datos del cliente: ");
        System.out.println(cuenta3.getcliente());
        System.out.println(cuenta3.getnumCuenta());
        System.out.println(cuenta3.getsaldo());
    }
    
}
