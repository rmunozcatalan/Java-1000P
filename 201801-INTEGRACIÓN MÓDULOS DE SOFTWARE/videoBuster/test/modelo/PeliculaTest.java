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
public class PeliculaTest {
    
    public PeliculaTest() {
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
     * Test of getCodigo method, of class Pelicula.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Pelicula.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Pelicula instance = new Pelicula();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Pelicula.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Pelicula.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        Pelicula instance = new Pelicula();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_categoria method, of class Pelicula.
     */
    @Test
    public void testGetId_categoria() {
        System.out.println("getId_categoria");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.getId_categoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_categoria method, of class Pelicula.
     */
    @Test
    public void testSetId_categoria() {
        System.out.println("setId_categoria");
        int id_categoria = 0;
        Pelicula instance = new Pelicula();
        instance.setId_categoria(id_categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormato4k method, of class Pelicula.
     */
    @Test
    public void testGetFormato4k() {
        System.out.println("getFormato4k");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getFormato4k();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormato4k method, of class Pelicula.
     */
    @Test
    public void testSetFormato4k() {
        System.out.println("setFormato4k");
        String formato4k = "";
        Pelicula instance = new Pelicula();
        instance.setFormato4k(formato4k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Pelicula.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Pelicula.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Pelicula instance = new Pelicula();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grabar method, of class Pelicula.
     */
    @Test
    public void testGrabar() {
        System.out.println("grabar");
        Pelicula p = null;
        Pelicula instance = new Pelicula();
        instance.grabar(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class Pelicula.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Pelicula p = null;
        Pelicula instance = new Pelicula();
        instance.actualizar(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
