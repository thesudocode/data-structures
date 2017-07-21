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

        System.out.println();
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

    //push a new node after some given node
    public void pushAfter(Node prevNode, int data){

        if(prevNode == null){
            System.out.println("The node that you have provided doesn't exist");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    //initialising the linked-list
    public static void main(String[] args){

        LinkedList list = new LinkedList();

        Node node = new Node(5);
        node.next = null;

        list.head = node;

        list.printList();
        list.pushAfter(node, 200);
        list.printList();
    }

}
