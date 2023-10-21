package com.reverse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    Reverse reverse = new Reverse();

    @Test
    public void isReverseFirst()
    {
        assertEquals("labqI si eman ym",reverse.reverse("my name is Iqbal"));
    }

    @Test
    public void isReverseSecond(){
        assertEquals("!dlroW olleH",reverse.reverse("Hello World!"));
    }
}
