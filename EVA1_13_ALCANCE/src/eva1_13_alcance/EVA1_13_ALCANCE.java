package eva1_13_alcance;

/**
 *
 * @author danna
 */
public class EVA1_13_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        for (int i = 0; i < 10; i++) {//inicio del ciclo for
            System.out.println("x = "+ x);//visible dentro de for
            System.out.println("i = " + i); 
            System.out.println("j = " + j);//variable no visible, no esta declarada antes de la instrccion
            int j = 100;//a partir de aqui, es visible
            System.out.println("j = " + j);
            {
            int z = 100;
                System.out.println("z = " + z);
            }
            System.out.println("z = " + z);//no visible
        }//termina bloque for
        
        //no estan declaradas en el bloque
         //System.out.println("i = " + i);
         //System.out.println("j = " + j);
    }
    public static void algo(){
        System.out.println("x = " + x);
    }
}
