/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vina
 */
public class CategoriaTest {
    
    public CategoriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Categoria.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Categoria instance = new Categoria();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Categoria.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Categoria instance = new Categoria();
        instance.setId(id);
        instance.setDescripcion("uno");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Categoria.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Categoria.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Categoria instance = new Categoria();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Categoria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Categoria.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Categoria instance = new Categoria();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Categoria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Categoria instance = new Categoria();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grabar method, of class Categoria.
     */
    @Test
    public void testGrabar() {
        System.out.println("grabar");
        Categoria c = null;
        Categoria instance = new Categoria();
        instance.grabar(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
