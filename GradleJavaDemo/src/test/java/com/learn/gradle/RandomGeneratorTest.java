package com.learn.gradle;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kq61 on 12/21/2018.
 */
public class RandomGeneratorTest {

    RandomGenerator randomGenerator;

    @Before
    public void setup(){
        randomGenerator = new DefaultRandomGenerator();
    }

    @After
    public void clean(){
        randomGenerator = null;
    }

    @Test
    public void testName(){
        Assert.assertSame("Name is not same as expected","Default Random Number Generator",randomGenerator.name());

    }

    @Test
    public void generateRandomNumberTest(){
        int generatedInt = randomGenerator.generate();
        Assert.assertTrue("Generated int was not between 1 and 10",1<generatedInt && 10>generatedInt);
    }
}
