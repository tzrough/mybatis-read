package com.focus.threadlocal;

public class Starter {

    public static void main(String[] args) {

        Counter c1 = new Counter(new SequenceNumber());
        Counter c2 = new Counter(new SequenceNumber());

//        new Thread(c1).start();
//        new Thread(c2).start();

        c1.print();
        c2.print();
    }

}
