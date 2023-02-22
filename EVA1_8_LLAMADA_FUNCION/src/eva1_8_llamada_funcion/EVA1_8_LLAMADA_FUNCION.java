package eva1_8_llamada_funcion;

/**
 *
 * @author danna
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA main()");
        A();//LLAMADA A FUNCION
        System.out.println("TERMINA main()");
    }
    public static void A(){
        System.out.println("INICIA A()");
        B();//LLAMADA A FUNCION
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICIA B()");
        System.out.println("TERMINA B()");
    }
}
