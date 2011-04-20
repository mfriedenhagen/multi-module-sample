package de.friedenhagen.multimodule.core;


import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyLibTest {

    @Test
    public void testTested() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        final PrintStream out = new PrintStream(stream);
        try {
            final MyLib lib = new MyLib(out);
            lib.tested();
        } finally {
            out.close();
        }
        Assert.assertEquals("I am tested", stream.toString().trim());
    }
}
