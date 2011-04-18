package de.friedenhagen.multimodule.app1;


import de.friedenhagen.multimodule.core.MyLib;
import org.junit.Assert;
import org.junit.Test;

public class MyApp1Test {

    @Test
    public void testApp() throws Exception {
        final MyApp1 myApp1 = new MyApp1(new MyLib(System.out));
        Assert.assertEquals("untested", myApp1.call());
    }
}