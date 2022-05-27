/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadoradeimc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matheus
 */
public class IMCTest {
    
    public IMCTest() {
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
     * Teste de cálculo de IMC.
     */
    @Test
    public void testIMC() {
        System.out.println("cálculo de imc");
        float altura = 1.70f;
        float peso = 42f;
        IMC instance = new IMC();
        float expResult = 14.5f;
        float result = instance.calcIMC(altura, peso);
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Teste de Magreza.
     */
    @Test
    public void testMagreza() {
        System.out.println("magreza");
        float altura = 1.70f;
        float peso = 42f;
        IMC instance = new IMC();
        String expResult = "Magreza";
        String result = instance.classificacaoIMC(instance.calcIMC(altura, peso));
        assertEquals(expResult, result);
    }
    
    /**
     * Teste de peso Normal.
     */
    @Test
    public void testNormal() {
        System.out.println("normal");
        float altura = 1.69f;
        float peso = 53f;
        IMC instance = new IMC();
        String expResult = "Normal";
        String result = instance.classificacaoIMC(instance.calcIMC(altura, peso));
        assertEquals(expResult, result);
    }
    
    /**
     * Teste de Sobrepeso.
     */
    @Test
    public void testSobrepeso() {
        System.out.println("sobrepeso");
        float altura = 1.70f;
        float peso = 75f;
        IMC instance = new IMC();
        String expResult = "Sobrepeso";
        String result = instance.classificacaoIMC(instance.calcIMC(altura, peso));
        assertEquals(expResult, result);
    }
    
    /**
     * Teste de Obesidade.
     */
    @Test
    public void testObesidade() {
        System.out.println("obesidade");
        float altura = 1.70f;
        float peso = 95f;
        IMC instance = new IMC();
        String expResult = "Obesidade";
        String result = instance.classificacaoIMC(instance.calcIMC(altura, peso));
        assertEquals(expResult, result);
    }
    
}
