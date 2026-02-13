package com.main;

import com.linkedlist.*;

public class LinkedMain {

    /**
     * This method is used to execute all the linked list problems from one place.
     */
    public static void executeAll(){
        ListNode head = new ListNode(2, new ListNode(6, new ListNode(4, new ListNode(8, null))));
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, null))));
        ListNode list2 = new ListNode(1, new ListNode(5, new ListNode(7,null)));
        ListNode cycle = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4)))) {{
            next.next.next.next = next; // Reaches from 1 -> 4 and links it back to 1's next (node 2)
        }};
        ListNode cycleII = new ListNode(1, new ListNode(2)) {{
            next.next = next;
        }};
        ListNode removedNthNodeList = new ListNode(2, new ListNode(6, new ListNode(4, null)));



        // Reverse Linked List Problem
        ListNode newHead = ReverseLinkedList.reverseList2(head);
        System.out.println("Reverse Linked List Results - ");
        printListRecursive(newHead);

        // Merge Two Sorted Lists Problem
        ListNode node = MergeTwoSortedLists.mergeTwoLists2(list1, list2);
        System.out.println();
        System.out.println("Merge Two Sorted Lists Results - ");
        printListRecursive(node);


        // Linked List Cycle Problem
        boolean hasCycle = LinkedListCycle.hasCycle2(cycle);
        System.out.println();
        System.out.println("Linked List Cycle Results - "+hasCycle);


        // Linked List Cycle II Problem
        ListNode detectCycle = LinkedListCycleII.detectCycle(cycleII);
        System.out.println();
        System.out.println("Linked List Cycle II Results - "+detectCycle.val);


        // Remove Nth Node from End of List Problem
        ListNode remainingList = RemoveNthNodeFromList.removeNthFromEnd2(removedNthNodeList, 2);
        System.out.println();
        System.out.println("Remove Nth Node from End of List Results - ");
        printListRecursive(remainingList);

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
