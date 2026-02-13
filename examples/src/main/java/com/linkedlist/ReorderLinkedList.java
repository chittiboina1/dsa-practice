package com.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReorderLinkedList {

    /**
     * Solution 1 to re-order the linked list using brute force.
     * Re-Order -- L1 → Ln → L2 → Ln−1 → L3 → Ln−2 → ...,
     * @param head
     */
    public static void reorderList1(ListNode head){
        if(head==null){
            return;
        }
        List<ListNode> nodes = new ArrayList<>();
        ListNode current = head;
        while(current!=null){
            nodes.add(current);
            current = current.next;
        }

        int i=0, j=nodes.size()-1;
        while(i<j){
            nodes.get(i).next = nodes.get(j);
            i++;
            if(i>j){
                break;
            }
            nodes.get(j).next = nodes.get(i);
            j--;
        }
        nodes.get(i).next=null;
    }


    /**
     * Solution 2 to re-order the linked list using merge concept - divide into 2 lists and merge it
     * Re-Order -- L1 → Ln → L2 → Ln−1 → L3 → Ln−2 → ...,
     * @param head
     */
    public static void reorderList2(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        ListNode previous = slow.next = null;
        while(second!=null){
            ListNode temp = second.next;
            second.next = previous;
            previous = second;
            second = temp;
        }

        ListNode first = head;
        second = previous;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
