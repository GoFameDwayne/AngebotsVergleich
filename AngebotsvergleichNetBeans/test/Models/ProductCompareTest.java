/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class ProductCompareTest {
    
    public ProductCompareTest() {
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

    @Test
    public void testGetPricePercentage() {
        System.out.println("testGetPricePercentage");
        ProductCompare instance = new ProductCompare();
        double result = instance.getPricePercentage(150, 50);
        assertEquals(25, result, 0.0);
    }
    
     @Test
    public void testGetPricePercentageZero() {
        System.out.println("testGetPricePercentageZero");
        ProductCompare instance = new ProductCompare();
        double result = instance.getPricePercentage(330, 0);
        assertEquals(100, result, 0.0);
    }   
    
    @Test
    public void testGetPricePercentageLowerPercentage() {
        System.out.println("testGetPricePercentageLowerPercentage");
        ProductCompare instance = new ProductCompare();
        double result = instance.getPricePercentage(50, 150);
        assertEquals(75, result, 0.00);
    }   
}
