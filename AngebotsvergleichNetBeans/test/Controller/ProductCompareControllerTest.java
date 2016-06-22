/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Product;
import Models.ProductCompare;
import Repository.DataProvider;
import java.util.UUID;
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
public class ProductCompareControllerTest {
    
    public ProductCompareControllerTest() {
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
    public void testGetBetterProduct() {
        System.out.println("testGetBetterProduct");
        ProductCompareController instance = new ProductCompareController(new DataProvider());
        instance.setProductCompare(new ProductCompare());
        Product Product1 = new Product();
        Product1.setID(UUID.randomUUID());
        Product1.setAmount(50);
        Product Product2 = new Product();
        Product2.setID(UUID.randomUUID());
        Product2.setAmount(150);
        instance.setProduct1(Product1);
        instance.setProduct2(Product2);
        
        UUID result = instance.getBetterProduct().getID();
        
        assertEquals(Product1.getID(), result);
    }
    
    @Test
    public void testGetBetterProductEqual() {
        System.out.println("testGetBetterProductEqual");
        ProductCompareController instance = new ProductCompareController(new DataProvider());
        instance.setProductCompare(new ProductCompare());
        Product Product1 = new Product();
        Product1.setID(UUID.randomUUID());
        Product1.setAmount(150);
        Product Product2 = new Product();
        Product2.setID(UUID.randomUUID());
        Product2.setAmount(150);
        instance.setProduct1(Product1);
        instance.setProduct2(Product2);
        assertNull(instance.getBetterProduct());
    }
}
