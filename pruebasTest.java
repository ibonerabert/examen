

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebasTest
{
    /**
     * Default constructor for test class pruebasTest
     */
    public pruebasTest()
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

    
     @Test
    public void paraProbar1()
    {
        int x=10;
        int resultado_esperado=12;
        assertEquals(resultado_esperado, pruebas.paraProbar(x));
    }
     

    @Test
    public void paraProbar2()
    {
     int x=3;
     int resultado_esperado=-1;
     assertEquals(resultado_esperado, pruebas.paraProbar(x));
    }
    @Test
    public void paraProbar3()
    {
     int x=11;
        int resultado_esperado=12;
    
        assertEquals(resultado_esperado, pruebas.paraProbar(x));
    }
}


