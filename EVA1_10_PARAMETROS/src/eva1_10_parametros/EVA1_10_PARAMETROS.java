
package eva1_10_parametros;

/**
 *
 * @author danna
 */
public class EVA1_10_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintln("HOLA", 5);
    }
    public static void nPrintln(String message, int n){
        for (int i = 0; i < n; i++)
          System.out.println(message);
    }
}
