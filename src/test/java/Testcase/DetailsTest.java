package Testcase;

import Assignment.HappyorSad;
import Assignment.ValidateDetailsTest;
import org.junit.Assert;
import org.junit.Test;

public class DetailsTest {


    @Test
    public void moodtest() {
        String expectedresult = "HAPPY";
        String actualresult = HappyorSad.moodanalyze("HAPPY");
        Assert.assertEquals(expectedresult, actualresult);
    }


    @Test
    public void firstname() {
        String firstname="Ragul";
        Assert.assertTrue(ValidateDetailsTest.name(firstname));
    }
    @Test
    public void lastname() {
        String lastname="Kanna";
        Assert.assertTrue(ValidateDetailsTest.name(lastname));
    }
    @Test
    public void mail() {
        String mail="ragulragi619@gmail.com";
        Assert.assertTrue(ValidateDetailsTest.mail(mail));
    }@Test
    public void phonenumber() {
        String phonenumber="91 9004265745";
        Assert.assertTrue(ValidateDetailsTest.phonenumber(phonenumber));
    }@Test
    public void password() {
        String password="Kanna@1234";
        Assert.assertTrue(ValidateDetailsTest.password(password));
    }



}

