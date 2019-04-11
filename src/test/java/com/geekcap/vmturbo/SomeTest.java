package com.geekcap.vmturbo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shaines on 7/24/16.
 */
public class SomeTest {

    @Test
    public void testN() {
        Thing t = new Thing();
        t.setN(5);
        Assert.assertEquals("N should be 5", 6, t.getN());
    }
}
