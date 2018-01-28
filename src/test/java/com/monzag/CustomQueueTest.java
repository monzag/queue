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

}