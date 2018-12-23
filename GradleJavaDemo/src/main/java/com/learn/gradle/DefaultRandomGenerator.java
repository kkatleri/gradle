package com.learn.gradle;


import org.apache.commons.math3.random.RandomDataGenerator;

/**
 * Created by kq61 on 12/21/2018.
 */
public class DefaultRandomGenerator implements RandomGenerator {


    @Override
    public String name(){
        return "Default Random Number Generator";
    }

    @Override
    public int generate() {
        final RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        return randomDataGenerator.nextInt(1,10);
    }
}
