package de.friedenhagen.multimodule.core;

import java.io.PrintStream;

/**
 * My fine App
 */
public class MyApp {

    /**
     * outstream
     */
    private final PrintStream out;

    /**
     * Public constructor.
     *
     * @param out to print to.
     */
    public MyApp(final PrintStream out) {
        this.out = out;
    }

    /**
     * My tested method.
     */
    public void tested() {
        out.println("I am tested");
    }

    public void untested() {
        out.println("I am not tested");
    }
}