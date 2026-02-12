package com.linkedlist;

import java.util.HashSet;

public class LinkedListCycle {

    /**
     * Solution 1 to find out whether given linked list has cycle or not using HashSet.
     * @param head
     * @return
     */
    public static boolean hasCycle1(ListNode head){
        HashSet<ListNode> seen = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if(seen.contains(current)){
                return true;
            }
            seen.add(current);
            current = current.next;
        }
        return false;
    }

    /**
     * Solution 2 to find out whether given linked list has cycle or not using Slow and Fast pointers.
     * @param head
     * @return
     */
    public static boolean hasCycle2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
