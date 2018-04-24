/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci232;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/*
* Author: Jaret Boyer, Kayla Wheeler, Kyle Hagerman
* Date: April 24, 2018
* Overview: ChangeTest is the file that has the four JUnit tests for the change making method:
* One for an empty array, one for a suboptimal amount, and two showing it running normally.
*/
public class ChangeTest {
    
    public ChangeTest() {
        
    }
    // normal run
    @Test
    public void testGet1() {
        int[] coins = {1, 5, 10, 12, 25};
        int change = 24;
        ArrayList<Integer> expResult = new ArrayList();
        expResult.add(12);
        expResult.add(12);
        ArrayList<Integer> result = Change.get(coins, change);
        assertEquals(expResult, result);
    }
	
    //empty array test case
    @Test
    public void testGet2() {
        int[] coins = {};
        int change = 0;
        ArrayList<Integer> expResult = new ArrayList();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {  Change.get(coins,change); } );
		assertEquals("Array of size 0 is not allowed", e.getMessage());
    }
    
    // normal run
    @Test
    public void testGet3() {
        int[] coins = {1, 5, 10, 12, 25};
        int change = 55;
        ArrayList<Integer> expResult = new ArrayList();
        expResult.add(5);
        expResult.add(25);
        expResult.add(25);
        ArrayList<Integer> result = Coin.get(coins, change);
        assertEquals(expResult, result);
    }
    
}
