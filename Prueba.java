

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        alumno1 = new Alumno("Javier Garcia", "4567", 21);
        alumno2 = new Alumno("Laura Gómez", "2238", 19);
        alumno3 = new Alumno("Estefanía Sáenz ", "9987", 22);
        alumno4 = new Alumno("Rodrigo Cifuentes", "2290", 19);
        alumno5 = new Alumno("Mauro López", "3387", 20);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
