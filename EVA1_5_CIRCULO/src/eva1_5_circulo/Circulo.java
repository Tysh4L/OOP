package eva1_5_circulo;

/**
 *
 * @author danna
 */
public class Circulo {
    private double radio; //atributos
    
    public Circulo(){ //constructor default
        radio = 3;
    }
    
    public Circulo(double r){ //constructor con atributos
        radio = r;
    }
    //metodos get y set
    public double getRadio(){
        return radio;
    }
    public void setRadio(double r){
        radio = r;
    }
   //metodos para calcular
   public double areaCirculo(){
       double resultado = (Math.PI)*(Math.pow(this.getRadio(), 2));
       return resultado;
   }
   public double perimetroCirculo(){
       double resultado = (2*Math.PI*this.getRadio());
       return resultado;
   }
}
    
