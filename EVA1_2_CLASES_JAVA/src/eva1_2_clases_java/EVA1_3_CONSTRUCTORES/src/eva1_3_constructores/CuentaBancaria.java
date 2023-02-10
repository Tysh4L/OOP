package eva1_3_constructores;

/**
 *
 * @author danna
 */
public class CuentaBancaria {
    //atributos de la clase tienen que ser privados
    //privado es que solo son visibles dentro de la clase
    private String numCuenta;
    private String cliente;
    private double saldo;
    //constructores
    //default y con atributos
    public CuentaBancaria(){//constructor default
        numCuenta = "----";
        saldo = 0;
        cliente = "----";
    }
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        numCuenta = nCuenta;
        saldo = otroSaldo;
        cliente = nCliente;
                
    }
    
    
    
    
    //comportamiento
    //metodos get y set
    public String getnumCuenta(){
        return numCuenta;
    }
    public double getsaldo(){
        return saldo;
    }
    public String getcliente(){
        return cliente;
    }
    public void setnumCuenta(String valor){
        numCuenta = valor;
    }
    public void setsaldo(double valor){
        saldo = valor;
    }
    public void setcliente(String valor){
        cliente = valor;
    }
}
