/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Vector;

/**
 *
 * @author Sergio
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
        
    }
    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String value = "A";
        VectorHeap instance = new VectorHeap();
        instance.add(value);
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        testAdd();
        VectorHeap<String> instance = new VectorHeap();
        String value1="A";
        String value2="B";
        instance.add(value1);
        instance.add(value2);
        String expResult = "B";
        String result = instance.remove();
        result = instance.remove();
        assertEquals(expResult, result);
    }
    
}
