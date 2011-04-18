package de.friedenhagen.multimodule.app1;


import de.friedenhagen.multimodule.core.MyLib;

import java.util.concurrent.Callable;

public class MyApp1 implements Callable<String> {

    private final MyLib myLib;

    public MyApp1(final MyLib myLib) {
        this.myLib = myLib;
    }

    public String call() throws Exception {
        return myLib.untested();
    }
}