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

    //push a new node to the front
    public void pushToFront(int data){

        Node newNode = new Node(data);

        if(head == null){
            newNode.next = null;
        }else{
            newNode.next = head;
        }
        head = newNode;

        printList();
    }

    //initialising the linked-list
    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.pushToFront(4);
    }

}
