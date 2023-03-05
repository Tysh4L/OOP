package eva1_19_static;

/**
 *
 * @author danna
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI"+ Math.PI);
        System.out.println("Numero aleatorio: "+ Math.random());
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        //Saludo2();//si no es estatico, y no se ha creado un objeto, el metodo no existe
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
    
}
class Utilerias{
    //Saludo() ESTE METODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE, SOLO SE USA
    //A TRAVES DE UN OBJETO
    public void Saludo(){
        System.out.println("Hola!!");
    }
    //otroSaludo() ESTE METODO EXISTE EN EL MOMENTO QUE ES PROGRAMADO
    //INICIA SU EJECUCION, NO NECCESITA QUE SE CREE UN OBJETO
    //DE LA CLASE PARA PODERLO UTILIZAR. SE USA A TRAVES DE LA CLASE.
    public static void otroSaludo(){
        System.out.println("Otro saludo(static)");
    }
}
