package com.monzag;

public class Node {

    private String value;
    private Node next;
    private Integer priority;

    public Node(String value) {
        this.value = value;
        this.next = null;
        this.priority = null;
    }

    public Node(String value, Integer priority) {
        this.value = value;
        this.next = null;
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
