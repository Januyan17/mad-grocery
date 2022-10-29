package com.example.grocery;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    LoginUtils utils;

    @Before
    public void setUp(){
        utils = new LoginUtils();
    }

    @Test
    public void aValidEmailAddressPasses() throws Exception{
        assertTrue(utils.isValidEamilAddress("abilash@gmail.com"));
    }

    @Test
    public void ainValidEmailAddressPasses() throws Exception{
        assertTrue(!utils.isValidEamilAddress("abilash"));
    }

    @Test
    public void localPartLengthForValidEmailAddress() throws Exception{
        assertEquals(3, utils.getLocalPartLength("abc@gmail.com"));
    }

    @Test
    public void validityCheckEmailPass() throws Exception{
        assertTrue(utils.checkEmailPass("abi@gmail.com","123456"));
    }

    @Test
    public void invalidityCheckEmailPassa() throws Exception{
        assertTrue(!utils.checkEmailPass("","123456"));
    }

    @Test
    public void invalidityCheckEmailPassb() throws Exception{
        assertTrue(!utils.checkEmailPass("",""));
    }

    @Test
    public void passLengthCheck() throws  Exception{
        assertTrue(utils.checkPass("123456"));
    }

    @Test
    public void invalidpassLengthCheck() throws  Exception{
        assertTrue(!utils.checkPass("12345"));
    }

    @Test
    public  void promoValidTrue() throws Exception{
        assertTrue(utils.promoValidate("abi#2", "NewYear Code","100.0", "1000.0"));
    }

    @Test
    public  void promoValidFalse() throws Exception{
        assertTrue(!utils.promoValidate("null", "null","null", "null"));
    }

    @Test
    public void lengthPromoTrue() throws Exception{
        assertTrue(utils.pCodeLengthCheck("abc@#$%"));
    }

    @Test
    public void lengthPromoFalse() throws Exception{
        assertTrue(!utils.pCodeLengthCheck("abc"));
    }

    @Test
    public void comparePriceTrue() throws Exception{
        assertTrue(utils.promoPriceCompare(100.0,1000.0));
    }

    @Test
    public void comparePriceFalse() throws Exception{
        assertTrue(!utils.promoPriceCompare(100.0,10.0));
    }
}