package com.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromList {

    /**
     * Solution 1 to find remove the Nth node from end of list in a given linkedlist using brute force.
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd1(ListNode head, int n){
        List<ListNode> nodes = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            nodes.add(current);
            current = current.next;
        }
        int removeIndex = nodes.size() - n;
        if(removeIndex==0){
            return head.next;
        }
        nodes.get(removeIndex-1).next = nodes.get(removeIndex).next;
        return head;
    }

    /**
     * Solution 2 to find remove the Nth node from end of list in a given linkedlist using two pointers i.e., left and right
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd2(ListNode head, int n){
       ListNode dummy = new ListNode(0, head);
       ListNode left = dummy;
       ListNode right = head;
       while(n>0){
           right = right.next;
           n--;
       }
       while(right!=null){
           left = left.next;
           right = right.next;
       }
       left.next = left.next.next;
       return dummy.next;
    }

}
