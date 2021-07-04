package com.company;

public class Main {

    public static void main(String[] args) {
        Thread threadOne = new MyThread();
        Thread threadTwo = new MyThread();
        Thread threadThree = new MyThread();
        Thread threadFour = new MyThread();
        Thread threadFive = new MyThread();
        Thread threadSix = new MyThread();
        Thread threadSeven = new MyThread();
        Thread threadEight = new MyThread();
        Thread threadNine = new MyThread();
        Thread threadTen = new MyThread();
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
        threadSix.start();
        threadSeven.start();
        threadEight.start();
        threadNine.start();
        threadTen.start();
    }
}
