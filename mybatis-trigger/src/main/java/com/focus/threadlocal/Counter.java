package com.focus.threadlocal;

public class Counter implements Runnable {

    private SequenceNumber seqNum;

    public Counter(SequenceNumber seqNum) {
        this.seqNum = seqNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + seqNum.next());
        }
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + seqNum.next());
        }
    }

}
