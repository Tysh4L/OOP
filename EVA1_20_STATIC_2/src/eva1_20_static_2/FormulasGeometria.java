package eva1_20_static_2;

/**
 *
 * @author danna
 */
public class FormulasGeometria {
    //constante
    public static final double PI = 3.14159;
    //area traingulo
    public static double areaTriangulo(double base, double altura){
        return (base * altura)/2.0;
    }
    //area circulo
    public static double areaCirculo(double radio){
        return PI * radio * radio;
    }
    //perimetro circulo
     public static double perimetroCirculo(double radio){
        return PI * (radio*2);
    }
    //volumen esfera
     public static double volumenEsfera(double radio){
         return (4.0/3.0)*PI*(radio*radio*radio);
     }
}
