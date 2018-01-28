package com.monzag;

public class EmptyQueueException extends Exception {

    public EmptyQueueException() {
        super("Queue is empty");
    }
}
