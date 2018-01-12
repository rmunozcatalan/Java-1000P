/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Categoria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CategoriaIT {
    
    public CategoriaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Iniciando caso de prueba ...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Caso de prueba finalizado ...");
    }

    /**
     * Test of getId method, of class Categoria.
     */
    @Test
    @Ignore
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
    @Ignore
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Categoria instance = new Categoria();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Categoria.
     */
    @Test
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Categoria instance = new Categoria();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a   prototype.");
    }
    
    @Test
    public void testGrabar()
    {
         System.out.println("Grabar Categoria");
         Categoria c = new Categoria();
         c.setId(5);
         c.setDescripcion("Terror");
         c.grabar(c);
        
       
    }
    
    
}
