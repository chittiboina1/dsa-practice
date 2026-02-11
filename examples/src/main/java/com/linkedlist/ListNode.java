package com.linkedlist;

public class ListNode {
    public int val;         // The custom value/data for the node
    public ListNode next;   // Reference to the next node in the list

    // Default constructor (optional)
    ListNode() {}

    // Constructor to set the value
    ListNode(int val) {
        this.val = val;
        this.next = null; // Next is by default null
    }

    // Constructor to set both value and the next node reference
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
