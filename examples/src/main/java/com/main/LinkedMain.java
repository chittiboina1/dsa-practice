package com.main;

import com.linkedlist.ListNode;
import com.linkedlist.ReverseLinkedList;

public class LinkedMain {

    /**
     * This method is used to execute all the linked list problems from one place.
     */
    public static void executeAll(){
        ListNode head = new ListNode(2, new ListNode(6, new ListNode(4, new ListNode(8, null))));

        // Reverse Linked List Problem
        ListNode newHead = ReverseLinkedList.reverseList2(head);
        printListRecursive(newHead);

    }

    /**
     * This method is used to print all the values in a linked list or list node.
     * @param node
     */
    public static void printListRecursive(ListNode node){
        if(node != null){
            System.out.print(node.val + "->");
            printListRecursive(node.next);
        }
    }
}
