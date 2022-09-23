/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_reto0.modelo;

import din_reto0.interfaces.Model;
import org.junit.Test;
import org.junit.ComparisonFailure;
import static org.junit.Assert.*;

/**
 *
 * @author Nerea
 */
public class ModelImplementationTest {
    ModelImplementation modelFile = null;
    
    public ModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        modelFile = new ModelImplementation();
        assertEquals(modelFile.getGreeting(), "Hello wol");
    }
    //Testear constructor (objeto no nulo y de la clase que tiene que ser)
    @Test
    public void testConstructor() {
        modelFile = new ModelImplementation();
        assertNotNull(modelFile.getGreeting());
        assertTrue(modelFile instanceof ModelImplementation);
    }
    
    //Model implementation sea un model
    @Test
    public void testBeingModel() {
        modelFile = new ModelImplementation();
        assertTrue(modelFile instanceof Model);
    }
}
