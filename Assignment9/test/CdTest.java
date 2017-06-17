/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CdTest {
    
   
    /**
     * Test of getPrincipal method, of class Cd.
     */
    @Test
    public void testGetPrincipalShouldReturn10() {
        //arrange
        int principal = 10;
        Cd c = new Cd(principal, 10, 10, "Monthly");
        
        //act
        int actualValue = c.getPrincipal();
        
        //assert
        Assert.assertEquals(principal, actualValue);
        
    }

    /**
     * Test of getInterestRate method, of class Cd.
     */
    @Test
    public void testGetInterestRateShouldReturnAccumulatedValueMinusPrincipal() {
        //arrange
        Cd c = new Cd(10,20,30,"dialy");
        
        //act
        double total = c.accumulatedValue(0);
        double expeced = total - 10;
        double actual = c.interest(c, 0);
        
        //assert
        Assert.assertEquals(expeced, actual);
    }

    /**
     * Test of getMaturity method, of class Cd.
     */
    @Test
    public void testGetMaturityShouldReturnTheMaturityState() {
        
        //arrange
        int Maturity = 5;
        Cd c = new Cd(10, 10, Maturity,"daily");
        
        //act
        int actual = c.getMaturity();
        
        //assert
        Assert.assertEquals(Maturity, actual);
    }

    /**
     * Test of getMode method, of class Cd.
     */
    @Test
    public void testGetMode() {
        
        //arrange
        String expected = "CorrectMode";
        Cd c = new Cd(10,10,10,expected);
        
        //act
        String actual = c.getMode();
        
        //assert
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test of accumulatedValue method, of class Cd.
     */
    @Test
    public void testAccumulatedValueShouldBe543_54() {
        
        //arrange
        Cd c = new Cd(5000, .0825, 5, "Quarterly");
        
        //act
        double actual = c.accumulatedValue(1);
        
        //assert
        Assert.assertEquals(5425.44, actual, 0.01);
    }

    /**
     * Test of interest method, of class Cd.
     */
    @Test
    public void testInterestShouldBeAccumulatedValueMinusPrincipal() {
        
        //arrange
        Cd c = new Cd(10,10,10,"monthly");
        
        //act
        
        //assert
        
    }

    /**
     * Test of totalInterest method, of class Cd.
     */
    @Test
    public void testTotalInterestShouldBePastInterestPlusPresent() {
        
        //arrange
        Cd c = new Cd(10,10,10,"Quarterly");
        
        //act
        double one = c.accumulatedValue(1) - c.getPrincipal();
        double two = c.accumulatedValue(2) - c.getPrincipal();
        double expected = one + two;
        double actual = c.totalInterest(c, 2);
        //assert
        Assert.assertEquals(expected, actual, 0.01);
    }
    
}
