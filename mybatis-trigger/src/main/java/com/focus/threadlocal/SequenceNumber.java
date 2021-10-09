package com.focus.threadlocal;

public class SequenceNumber {

    private static final ThreadLocal<Integer> seqNum = ThreadLocal.withInitial(() -> 0);

    public int next() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }
}
