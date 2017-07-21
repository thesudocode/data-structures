package com.iamoperand.datastructures;

/**
 * Created by iamoperand on 8/7/17.
 */
public class LinkedList {

    Node head;

    //made the class static to make the reference easier inside main function
    static class Node{
        int data;
        Node next;

        Node(int d){data = d;}
    }

    // This function prints contents of linked list starting from head
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }


    //initialising the linked-list
    public static void main(String[] args){

        LinkedList list = new LinkedList();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head = first;
        first.next = second;
        second.next = third;


        list.printList();
    }

}
