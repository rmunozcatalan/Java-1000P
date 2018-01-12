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
import org.junit.Ignore;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PeliculaCategoriaIT {
    
    public PeliculaCategoriaIT() {
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
     * Test of getId method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testGetId() {
        System.out.println("getId");
        PeliculaCategoria instance = new PeliculaCategoria();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        PeliculaCategoria instance = new PeliculaCategoria();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testGetCodigo() {
        System.out.println("getCodigo");
        PeliculaCategoria instance = new PeliculaCategoria();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        PeliculaCategoria instance = new PeliculaCategoria();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testGetPrecio() {
        System.out.println("getPrecio");
        PeliculaCategoria instance = new PeliculaCategoria();
        int expResult = 0;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        PeliculaCategoria instance = new PeliculaCategoria();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormato4k method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testGetFormato4k() {
        System.out.println("getFormato4k");
        PeliculaCategoria instance = new PeliculaCategoria();
        String expResult = "";
        String result = instance.getFormato4k();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormato4k method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testSetFormato4k() {
        System.out.println("setFormato4k");
        String formato4k = "";
        PeliculaCategoria instance = new PeliculaCategoria();
        instance.setFormato4k(formato4k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testGetNombre() {
        System.out.println("getNombre");
        PeliculaCategoria instance = new PeliculaCategoria();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        PeliculaCategoria instance = new PeliculaCategoria();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testGetCategoria() {
        System.out.println("getCategoria");
        PeliculaCategoria instance = new PeliculaCategoria();
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class PeliculaCategoria.
     */
    @Test
    @Ignore
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String categoria = "";
        PeliculaCategoria instance = new PeliculaCategoria();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    @Ignore
    public void buscarporNombre()
    {
    
        System.out.println("Buscando película por nombre");
        PeliculaCategoria pc = new PeliculaCategoria();        
        pc.buscarPeliculaPorNombre("Rocky");
    
    }
    
        @Test
        
    public void buscarporCategoriaNombre()
    {
    
        System.out.println("Buscando película por categoría nombre");
        PeliculaCategoria pc = new PeliculaCategoria();        
        pc.buscarPeliculaPorCategoriaNombre("Terror");
    
    }
}
