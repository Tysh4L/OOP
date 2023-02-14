package eva1_4_tv;

/**
 *
 * @author danna
 */
public class EVA1_4_TV {


    public static void main(String[] args) {
        // TODO code application logic here
        //metodo()-->llamada a funcion
        Tv miTv = new Tv();//la tv empieza apagada
        miTv.bajarVol();
        miTv.cambiarEstadoPoder();//la encendemos
        miTv.subirCanal();
        miTv.subirCanal();
        miTv.subirCanal();
    }
    
}
