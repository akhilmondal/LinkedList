package com.bridgelabz.datastructure;

public class LinkedList<Q> {

    Node<Q> head;
    Node<Q> tail;

    public void push(Q data) {
        Node<Q> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(Q data) {
        Node<Q> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertBetween(Q insertData) {
        Node<Q> newnode= new Node<>(insertData);
        head.next=newnode;
        newnode.next=tail;
    }
    public void pop() { // To delete the first element of the LinkedList pop method is used.
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        head = head.next;
    }
    public void display() {
        Node<Q> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
