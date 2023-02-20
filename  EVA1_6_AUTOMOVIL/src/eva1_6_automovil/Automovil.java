
package eva1_6_automovil;

/**
 *
 * @author danna
 */
public class Automovil {
    
   private String marca;
   private String modelo;
   private String placas;
   private int año;
   private String dueño;
   //constructor
   public Automovil(){//constructor default
       marca = "---";
       modelo = "---";
       placas = "---";
       año = 0;
       dueño = "---";
   }
   public Automovil(String marcaAuto, String modeloAuto, String placasAuto, int añoAuto, String dueñoAuto){//constructor
       marca = marcaAuto;
       modelo = modeloAuto;
       placas = placasAuto;
       año = añoAuto;
       dueño = dueñoAuto;
   }
   //get y set metodos
   public String getMarca(){
       return marca;
   }
   public String getModelo(){
       return modelo;
   }
   public String getPlacas(){
       return placas;
   }
   public int getAño(){
       return año;
   }
   public String getDueño(){
       return dueño;
   }
   //
   public void setMarca(String marcaAuto){
       marca = marcaAuto;
   }
   public void setModelo(String modeloAuto){
       modelo = modeloAuto;
   }
   public void setPlacas(String placasAuto){
       placas = placasAuto;
   }
   public void setAño(int añoAuto){
       año = añoAuto;
   }
   public void setDueño(String dueñoAuto){
       dueño = dueñoAuto;
   }
   //revalidacion
   public int calcularRev(){
       int adeudo = 0;
       //if else anidado
       if(año <= 2000){
           adeudo = 1500;
       }else if((año>=2001)&&(año<=2005)){
           adeudo = 2000;
       }else if((año>=2006)&&(año<=2010)){
           adeudo = 2500;
       }else if((año>=2011)&&(año<=2015)){
           adeudo = 3000;
       }else{
           adeudo = 3500;
       }
       return adeudo;
   }
   //imprimir datos
   public void imprimirDatos(){
       System.out.println("Adeudo vehicular: ");
       System.out.println("Dueño: "+ dueño);
       System.out.println("Marca: "+ marca);
       System.out.println("Placas: "+ placas);
       System.out.println("Modelo: "+ modelo);
       System.out.println("Año: "+ año);
       //
       System.out.println("Adeudo: "+ calcularRev());
   }
}
