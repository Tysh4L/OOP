package eva1_4_tv;

/**
 *
 * @author danna
 */
public class Tv {
    private int volumen;
    private int canal;
    private boolean poder;
    //constructores
    public Tv(){//constructor default
        volumen = 2;
        canal = 100;
        poder = false;//apagado
    }
    //metodos para operar la TV (interfaz)
    //encender y apagar la TV
    public void cambiarEstadoPoder(){
        //verificar el estado de la TV
        if(poder == true){
            poder = false;
            System.out.println("Apagando pantalla");
        }else{
            poder = true;
            System.out.println("Encendiendo pantalla");
        }
    }
    //volumen
    public void subirVol(){
        if(poder == true){//if (poder) la tv esta prendida
        //no debemos de pasar de 100
        if(volumen < 100){
        //volumen = volumen +1;//acumulador
        volumen++;
        //volumen+=1;
        System.out.println("Volumen: " + volumen);
       }    
    }
}
      public void bajarVol(){
          if(poder == true){
              if(volumen > 0){
        // volumen = volumen -1;//acumulador
        volumen--;
        //volumen-=1;
        System.out.println("Volumen: "+ volumen);
         }
      }
   }
    //canales
        public void subirCanal(){
        if(poder){
            canal++;
        if (canal > 100)
             canal = 0;
        System.out.println("Canal: " + canal);
       }
     }    
        public void bajarCanal(){
        if(poder){
            canal--;
        if (canal < 0)
             canal = 100;
        System.out.println("Canal: " + canal);
       }
     }    
  }              

