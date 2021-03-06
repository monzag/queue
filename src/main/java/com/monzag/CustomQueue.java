package com.monzag;

public class CustomQueue {

    private Node first;
    private Node last;

    public void enqueue(String value, Integer priority) {
        Node newItem = new Node(value, priority);
        if (first == null) {
            first = newItem;
            last = first;

        } else {

            if (priority == null) {
                last.setNext(newItem);
                last = newItem;

            } else if (priority == 1) {
                newItem.setNext(first);
                first = newItem;

            } else {
                enqueueWithPriorityInTheMiddle(newItem);
            }
        }

    }

    private void enqueueWithPriorityInTheMiddle(Node newItem) {
        Node current = first;
        for (int i = 1; i < newItem.getPriority(); i++) {
            if (current.getNext() == null) {
                current.setNext(newItem);
                i = newItem.getPriority();
            } else {
                if (i == newItem.getPriority() - 1) {
                    newItem.setNext(current.getNext());
                    current.setNext(newItem);
                } else {
                    current = current.getNext();
                }
            }
        }
    }

    public Node peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return first;
    }

    public String dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        String item = first.getValue();
        first = first.getNext();
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getQueueSize() {
        int size = 0;
        Node node = first;
        while (node != null) {
            node = node.getNext();
            size++;
        }

        return size;
    }

    @Override
    public String toString() {
        String output = "";

        Node current = first;
        while (current != null) {
            output += current.getValue() + " ";
            current = current.getNext();
        }

        return output.substring(0, output.length() - 1);
    }
}
