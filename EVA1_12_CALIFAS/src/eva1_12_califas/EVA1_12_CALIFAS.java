package eva1_12_califas;

/**
 *
 * @author danna
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cali;
        cali = calif(97);//almaceno el resultado en una variable
        System.out.println("Calificacion: "+cali);
        System.out.println("Calificacion para 70: "+ calif(70));//invoco dentro de otra funcion
        calif(100);//ignoro el resultado
    }
    public static String calif(int calif){
        String resu = "";
        if ((calif >= 91)&&(calif<=100)){
            resu = "A";
        }else if((calif >= 81)&&(calif<=90)){
            resu = "B";
        }else if((calif >= 71)&&(calif<=80)){
            resu = "C";
        }else{
            resu = "D";
        }
        return resu;
    }
}
