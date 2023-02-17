package eva1_5_circulo;

/**
 *
 * @author danna
 */
public class EVA1_5_CIRCULO {


    public static void main(String[] args) {
        // TODO code application logic here
       Circulo circulo1 = new Circulo();
       
        System.out.println("Resultado circulo 1");
        System.out.println("Area: "+ circulo1.areaCirculo());
        System.out.println("Perimetro: "+ circulo1.perimetroCirculo());
       
        Circulo circulo2 = new Circulo(6);
        
        System.out.println("Resultado circulo 2");
        System.out.println("Area "+ circulo2.areaCirculo());
        System.out.println("Perimetro "+ circulo2.perimetroCirculo());
        }
}
