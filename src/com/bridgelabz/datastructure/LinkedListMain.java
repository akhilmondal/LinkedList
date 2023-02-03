package com.bridgelabz.datastructure;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        System.out.println("Push method");
        linkedList1.display();
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        System.out.println("Append method");
        linkedList2.display();
        LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("Before insertion");
        linkedList3.display();
        linkedList3.insertBetween(30);
        System.out.println("After insertion");
        linkedList3.display();
    }
}
