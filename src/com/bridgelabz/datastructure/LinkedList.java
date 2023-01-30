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

    public void display() {
        Node<Q> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

}
