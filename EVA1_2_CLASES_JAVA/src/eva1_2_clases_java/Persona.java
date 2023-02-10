package eva1_2_clases_java;

/**
 *
 * @author danna
 */
public class Persona {
    //ATRIBUTOS DE LA CLASE--> Estado
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //METODOS; COMPORTAMIENTO
    //lectura y escritura de atributos;
    //Metodos get --> lee, metodo set--> escribir
    //metodos:
    //modificador valor de reotrno nombre (argumentos) (implementacion)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(boolean valor){
        estadoCivil = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos almacenados");
                    //concatenacion
                    //+ suma (numeros) + concatena <-- sobrecargar de operadores (mas funciones de la que tiene)
                    // no solo numeros sino que tambien cadenas de texto
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        if(estadoCivil)
            System.out.println("Estado civil: Casado");
        else
            System.out.println("Estado civil: Soltero");
    }
}
