/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import modelo.Pelicula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author vina
 */
public class ControlPeliculaTest {
    
    public ControlPeliculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Iniciando Proceso");
    }
    
    @After
    public void tearDown() {
        System.out.println("Finalizando proceso");
    }

    /**
     * Test of buscarPorCodigo method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testBuscarPorCodigo() {
        System.out.println("buscarPorCodigo");
        int numero = 0;
        ControlPelicula instance = new ControlPelicula();
        Pelicula expResult = null;
        Pelicula result = instance.buscarPorCodigo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodasPeliculas method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testListarTodasPeliculas() throws Exception {
        System.out.println("listarTodasPeliculas");
        ControlPelicula instance = new ControlPelicula();
        ResultSet expResult = null;
        ResultSet result = instance.listarTodasPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPeliculasRomance method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testListarPeliculasRomance() throws Exception {
        System.out.println("listarPeliculasRomance");
        ControlPelicula instance = new ControlPelicula();
        ResultSet expResult = null;
        ResultSet result = instance.listarPeliculasRomance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPeliculasPorPrecio method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testListarPeliculasPorPrecio() throws Exception {
        System.out.println("listarPeliculasPorPrecio");
        ControlPelicula instance = new ControlPelicula();
        ResultSet expResult = null;
        ResultSet result = instance.listarPeliculasPorPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPelicula method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testModificarPelicula() {
        System.out.println("modificarPelicula");
        int numero = 0;
        Pelicula pelicula = null;
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.modificarPelicula(numero, pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPelicula method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testEliminarPelicula() {
        System.out.println("eliminarPelicula");
        int numero = 0;
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.eliminarPelicula(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPeliculaPorPrecio method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testEliminarPeliculaPorPrecio() {
        System.out.println("eliminarPeliculaPorPrecio");
        int precio = 0;
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.eliminarPeliculaPorPrecio(precio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarP method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testAgregarP() {
        System.out.println("agregarP");
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.agregarP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPelicula method, of class ControlPelicula.
     */
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        Pelicula pelicula = new Pelicula();
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.agregarPelicula(pelicula);
        assertEquals(expResult, result);
        pelicula.setCodigo(2);
        pelicula.setFormato4k("S");
        pelicula.setIdcategoria(2);
        pelicula.setNombre("Jumanji");
        pelicula.setPrecio(35000);
        instance.agregarPelicula(pelicula);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verificaPelicula method, of class ControlPelicula.
     */
    @Test
    @Ignore
    public void testVerificaPelicula() {
        System.out.println("verificaPelicula");
        int numero = 0;
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.verificaPelicula(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
