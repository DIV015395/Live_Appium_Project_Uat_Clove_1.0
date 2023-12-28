package uivalidation;

import org.algorithm.CurrentTimeStringExample;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing {
    @BeforeClass
    public void beforesclass() {
        System.out.println(CurrentTimeStringExample.currentTime());
    }

    @Test
    public void staticlasss() {
        TestingTwo obj = new TestingTwo();
        System.out.println(obj.nonStaticMethod());

    }

    @AfterClass
    public void aftersclass() {
        System.out.println(CurrentTimeStringExample.currentTime());
    }
}
