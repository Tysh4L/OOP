package eva1_18_sobrecarga_rfc;

/**
 *
 * @author danna
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rfc = generarRFC("DANNA", "LOPEZ","FLORES", 2003,02, 23);
        System.out.println(rfc);
        String rfc1 = generarRFC("DANNA", "LOPEZ", 2003,02, 23);
        System.out.println(rfc1);
        String rfc2 = generarRFC("DANNA", 2003,02, 23);
        System.out.println(rfc2);
    }
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia ){
        String apP1 = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1) + "";
        String apM = apMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP1 + apP2 + apM + nom + año + mes + dia + "";
        return rfc;
    }
    public static String generarRFC(String nombre, String apPat, int año, int mes, int dia ){
        String apP1 = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1) + "";
        String nom = nombre.charAt(0) + "";
        String rfc1 = apP1 + apP2 + "X" + nom + año + mes + dia + "";
        return rfc1;
    }
    public static String generarRFC(String nombre, int año, int mes, int dia ){
        String nom = nombre.charAt(0) + "";
        String rfc2 =  "XX" + nom + año + mes + dia + "";
        return rfc2;
    }
}