/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Models.Market;
import Models.Place;
import java.sql.*;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Jonas
 */
public class DBConnTest {
    
    public DBConnTest() {
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
    public void testGetConnection() {
        System.out.println("getConnection");
        String url = "";
        String user = "";
        String password = "";
        DBConn instance = new DBConn();
        Connection expResult = null;
        Connection result = instance.getConnection(url, user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetById() {
        System.out.println("getById");
        Connection ConnectionMock = Mockito.mock(Connection.class);
        
        DBConn instance = new DBConn();
        Mockito.when(instance.getConnection(null, null, null)).thenReturn(ConnectionMock);
        
        Object expResult = null;
        //Object result = instance.getById(Place.class, null);
        //assertEquals(expResult, result);
    }    
}
