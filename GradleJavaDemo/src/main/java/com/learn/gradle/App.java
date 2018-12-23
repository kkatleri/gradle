package com.learn.gradle;

/**
 * Created by kq61 on 12/21/2018.
 */
public class App {

    public static void main(String[] args) {

        DefaultRandomGenerator defaultRandomGenerator = new DefaultRandomGenerator();
        System.out.println("The next random number is - "+ defaultRandomGenerator.generate());
    }
}
