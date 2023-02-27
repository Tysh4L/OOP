
package eva1_17_sobrecarga_areas;

/**
 *
 * @author danna
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area del circulo: "+ area(6));
        System.out.println("Area del triangulo: "+ area(6, 9));
        System.out.println("Area del trapecio: "+ area(6, 9, 3));
    }
                            //area(double)
    public static double area(double r){
        return (Math.PI * r * r);
    }
                            //area(double, double)
    public static double area(double b, double h){
        return (b * h)/2;
    }
                            //area(double, double, double)
    public static double area(double b, double B, double H){
        return H*(B * b)/2;
    }
}
