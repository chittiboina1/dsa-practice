package com.linkedlist;

public class ReverseLinkedList {

    /**
     * Solution 1 to reverse the given linked list using recursion algorithm.
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head){
        if(head == null){
            return null;
        }
        ListNode newHead = head;
        if(head.next != null){
            newHead = reverseList1(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }

    /**
     * Solution 2 to reverse the given linked list using iteration algorithm.
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head){
       ListNode previous = null;
       ListNode current = head;
       while(current != null){
           ListNode temp = current.next;
           current.next = previous;
           previous = current;
           current = temp;
       }
       return previous;
    }

}
