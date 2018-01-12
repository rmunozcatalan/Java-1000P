/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import modelo.Categoria;
import modelo.Pelicula;
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
public class ControlPeliculaIT {
    
    public ControlPeliculaIT() {
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
     * Test of buscarPorCodigo method, of class ControlPelicula.
     */
    @Test
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
        Pelicula pelicula = null;
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.agregarPelicula(pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaPelicula method, of class ControlPelicula.
     */
    @Test
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

    /**
     * Test of agregarCategoria method, of class ControlPelicula.
     */
    @Test
    public void testAgregarCategoria() {
        System.out.println("agregarCategoria");
        Categoria categoria = null;
        ControlPelicula instance = new ControlPelicula();
        boolean expResult = false;
        boolean result = instance.agregarCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
