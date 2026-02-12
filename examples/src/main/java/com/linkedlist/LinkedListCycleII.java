package com.linkedlist;

import java.util.HashSet;

public class LinkedListCycleII {

    /**
     * Solution 1 to find out whether given linked list has cycle or not using HashSet.
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head){
        HashSet<ListNode> seen = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if(seen.contains(current)){
                return current;
            }
            seen.add(current);
            current = current.next;
        }
        return null;
    }
}
