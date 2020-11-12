public class Personaje {
    //Elegimos el nombre del Personaje
    private String nombrePersonaje;
    //N�mero de Experiencia acumulada por el personaje 
    private double experienciaAcumulada;
    //Elegimos si el inventario est� lleno o no
    private boolean inventarioLleno;
    /**
     * Creamos a nuestro Personaje y definimos sus variables.
     */
    public Personaje(int experiencia, String nombre) {
        experienciaAcumulada = experiencia;
        nombrePersonaje = nombre;
        inventarioLleno = true;

    }
    /**
     * Invocamos el metodo para saber el nombre del personaje
     */
    public String getNombrePersonaje(){
        return nombrePersonaje;
        
        
    }   
    /**
     * Invocamos e, metodo para obtener la experiencia acumulada en resultado decimal
     */
    public double getExperienciaAcumulada(){
        return experienciaAcumulada;
        
        
    }   
    /**
     * Invocamos el metodo para obtener informaci�m sobre si el escenario est� lleno o no
     */
    public boolean getInventarioLleno(){
        return inventarioLleno;
        
        
    }   
    /**
     * Elegimos un nuevo nombre para nuestro personaje
     */
    public void setNuevoNombre(String nuevoNombre){
        nombrePersonaje = nuevoNombre;
        
        
    }   
    /**
     * A�adimos Experiencia a la experiencia total
     */
    public double recogerEsperencia(double experienciaRecogida){
        return experienciaAcumulada = experienciaAcumulada + experienciaRecogida; 
        
        
    }   
    /**
     * Alternamos entre el inventario lleno o vacio
     */
    public void alternarInventario(){
        inventarioLleno = !inventarioLleno;
        
        
    }   
    /** 
     * Imprimimos en pantalla la infromaci�n de nuestro personaje
     */
    public void informacionPersonaje(){
        if (inventarioLleno == true) {
            System.out.println("Nombre Personaje:  " +  nombrePersonaje + " |  Experiencia total acumulada:  " + experienciaAcumulada + " | �Inventario Lleno?: " + " si");
        }
        else { 
            System.out.println("Nombre Personaje:  " +  nombrePersonaje + " |  Experiencia total acumulada:  " + experienciaAcumulada + " | �Inventario Lleno?: " + "no");
        
        }   

    }
}