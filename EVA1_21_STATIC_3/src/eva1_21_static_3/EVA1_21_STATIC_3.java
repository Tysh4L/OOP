
package eva1_21_static_3;

/**
 *
 * @author danna
 */
public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor);//si se modifico
        
        System.out.println("Ahora con objetos");
        PruebaObjetos obj = new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        PruebaObjetos obj2 = new PruebaObjetos();
        System.out.println(obj2.valor);
        obj2.valor++;
    }
    
}
class Prueba{
    public static int valor = 100;
}
class PruebaObjetos{
    public int valor = 100;
}
