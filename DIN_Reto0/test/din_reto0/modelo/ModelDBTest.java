/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.modelo;

import din_reto0.interfaces.Model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nerea
 */
public class ModelDBTest {
    ModelDB modelBD = null;
     
    public ModelDBTest() {
    }

    /**
     * Test of getGreeting method, of class ModelDB.
     */
    @Test
    public void testGetGreeting(){
        modelBD = new ModelDB();
        assertEquals(modelBD.getGreeting(), "Prototo"); 
    }
    
    //Testear constructor (objeto no nulo y de la clase que tiene que ser)
    @Test
    public void testConstructor() {
        modelBD = new ModelDB();
        assertNotNull(modelBD.getGreeting());
        assertTrue(modelBD instanceof ModelDB);
    }
    
    //Model implementation sea un model
    @Test
    public void testBeingModel() {
        modelBD = new ModelDB();
        assertTrue(modelBD instanceof Model);
    }
 
}
