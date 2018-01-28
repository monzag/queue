package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    private CustomQueue queue;

    @BeforeEach
    void createStack() {
        this.queue = new CustomQueue();
    }

    @Test
    void isEmptyTest() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void getQueueSizeTest() {
        addDataToQueue();
        int expect = 6;
        assertEquals(expect, queue.getQueueSize());
    }

    @Test
    void peekFromEmptyQueueTest() {
        assertThrows(EmptyQueueException.class, () -> queue.peek());
    }

    @Test
    void peekTest() throws EmptyQueueException {
        addDataToQueue();
        String expect = "a0";
        assertEquals(expect, queue.peek().getValue());
    }

    @Test
    void dequeueFromEmptyQueueTest() {
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    @Test
    void dequeueTest() throws EmptyQueueException {
        addDataToQueue();
        queue.dequeue();
        String expect = "a1";
        assertEquals(expect, queue.dequeue());
    }

    @Test
    void enqueueTest() {
        queue.enqueue("a4", 1);
        queue.enqueue("a5", 2);
        queue.enqueue("a1", 1);
        queue.enqueue("a2", 2);
        queue.enqueue("a3", 3);
        String expect = "a1 a2 a3 a4 a5";
        assertEquals(expect, queue.toString());
    }

    private void addDataToQueue() {
        for (int i = 0; i < 6; i++) {
            Integer priority = null;
            queue.enqueue("a" + i, priority);
        }
    }

}