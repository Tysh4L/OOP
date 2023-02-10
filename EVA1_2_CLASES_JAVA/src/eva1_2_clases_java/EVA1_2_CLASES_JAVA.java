package eva1_2_clases_java;

/**
 *
 * @author danna
 */
public class EVA1_2_CLASES_JAVA {

    public static void main(String[] args) {
        // TODO code application logic here
        // Clase es la receta:
        // Objeto es el platillo
        // Intanciacion:
        //1. Declarar el identificador para declarar
        //2. Asignar memoria con new
        //3. Invocar su constructor
        // Persona() --> constructor;
        // constructor --> metodo
        
        Persona perso1 = new Persona ();
        //System.out.println(perso1);
        /*
        //Esta seccion es porque iniciamos con los
        //atributos con modificador default
        perso1.nombre = "Danna";
        perso1.apellido = "Lopez";
        perso1.edad = 19;
        perso1.estadoCivil = false; //true es casado, falso soltero
        
        System.out.println(perso1.nombre); */
        
        
        perso1.setNombre("Danna Paola");
        //System.out.println(perso1.getNombre());
        
        perso1.setApellido("Lopez Flores");
        //System.out.println(perso1.getApellido());
        
        perso1.setEdad(19);
        //System.out.println(perso1.getEdad());
        
        perso1.setEstadoCivil(false);
        //System.out.println(perso1.getEstadoCivil());
        
        perso1.imprimirDatos ();
        
        //persona 2
        Persona perso2 = new Persona ();
        
        perso2.setNombre("Victor");
        perso2.setApellido("Gomez Gonzalez");
        perso2.setEdad(19);
        perso2.setEstadoCivil(true);
        perso2.imprimirDatos ();
        
        }
    }
    
