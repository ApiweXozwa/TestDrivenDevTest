package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testObjectEquality(){
        BaseClass testerOne = new BaseClass("Apiwe", "Xozwa", 14);
        BaseClass testerTwo = new BaseClass("Apiwe", "Xozwa", 14);

        assertEquals(testerOne, testerOne);
        assertEquals(testerTwo, testerTwo);
//        assertEquals(testerOne, testerTwo);

//        assertNotEquals(testerOne, testerOne);
//        assertNotEquals(testerTwo, testerTwo);
        assertNotEquals(testerOne, testerTwo);
    }

    @Test
    public void testFailing(){ //How does this work??
        try{
            // do stuff...
            //fail();
        }catch(Exception e){
            assertTrue(true);
            //assertTrue(e.hasSomeFlag());
        }

    }

    @Test
    public void testObjectIdentity(){ //How does this work??
        SubClass a = new SubClass("Apiwe", "Xozwa", 14);
//        BaseClass b = new BaseClass("Apiwe", "Xozwa", 14);
        SubClass b = a;
    }


    @Test (timeout = 1000)
    public void testTestTimeouts(){
        assertTrue(true);
    }

    @Ignore
    @Test
    public void testDisablingTest(){
        assertTrue(true);
    }

}
