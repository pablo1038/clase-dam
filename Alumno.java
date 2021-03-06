public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombreCompleto.length() < 3) {
            System.out.println("Se necesitan 3 o m�s caracteres para realizar este metodo.");
            
        }
        
        if (numeroMatriculaAlumno.length() < 4) {
            System.out.println("Se necesitan 4 o m�s caracteres para realizar este metodo.");
    
        }
        
    }
    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(getDetalles());
    }
    
    public String getDetalles() {
        return nombre + " (" + numeroMatricula + ") - " + edad + " años";
    }
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int numeroLetrasNombre = 3;
        if (nombre.length() < 3){
            numeroLetrasNombre = nombre.length();
        
        }
        int numeroLetrasMatricula = 4;
        if (numeroMatricula.length() < 4){
            numeroLetrasMatricula = numeroMatricula.length();
        }
        return nombre.substring(0, numeroLetrasNombre) + numeroMatricula.substring(0, numeroLetrasMatricula);
    }
}
