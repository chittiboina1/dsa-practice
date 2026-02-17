package com.linkedlist;

public class AddTwoNumbers {


    /**
     * Solution 1 to add two numbers in a given linked lists using recursion.
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2){
        return add(l1, l2, 0);
    }


    /**
     * Solution 2 to add two numbers in a given linked lists using iteration.
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int v1 = (l1!=null)?l1.val:0;
            int v2 = (l2!=null)?l2.val:0;
            int val = v1+v2+carry;
            carry = val/10;
            val = val%10;
            current.next = new ListNode(val);
            current = current.next;
            l1 = (l1!=null)?l1.next:null;
            l2 = (l2!=null)?l2.next:null;
        }
        return dummy.next;
    }

    public static ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1==null && l2==null && carry==0){
            return null;
        }
        int v1 = (l1!=null)?l1.val:0;
        int v2 = (l2!=null)?l2.val:0;
        int sum = v1+v2+carry;
        int newCarry = sum/10;
        int nodeValue = sum%10;
        ListNode nextNode = add((l1!=null)?l1.next:null, (l2!=null)?l2.next:null, newCarry);
        return new ListNode(nodeValue, nextNode);
    }
}
