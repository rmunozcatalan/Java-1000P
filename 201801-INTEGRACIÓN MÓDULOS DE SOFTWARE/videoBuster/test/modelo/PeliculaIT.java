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
public class PeliculaIT {
    
    public PeliculaIT() {
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
     * Test of getCodigo method, of class Pelicula.
     */
    @Test
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Pelicula instance = new Pelicula();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        
    @Test
    
    public void testGrabar()
    {
         System.out.println("Grabar Película");
         Pelicula p  = new Pelicula();
         p.setCodigo(10015);
         p.setFormato4k("N");
         p.setId_categoria(5);
         p.setNombre("Freddy I");
         p.setPrecio(1000);
         p.grabar(p);
        
       
    }
    
    
      
    @Test
    @Ignore
    public void testActualizar()
    {
         System.out.println("Actualizar Película");
         Pelicula p  = new Pelicula();
         p.setCodigo(10000);
         p.setFormato4k("N");
         p.setId_categoria(5);
         p.setNombre("Spiderman");
         p.setPrecio(1000);
         p.actualizar(p);
        
       
    }
}
