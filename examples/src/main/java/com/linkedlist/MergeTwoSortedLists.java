package com.linkedlist;

public class MergeTwoSortedLists {

    /**
     * Solution 1 to merge 2 given linked lists using recursion algorithm.
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists1(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoLists1(list1, list2.next);
            return list2;
        }
    }

    /**
     * Solution 2 to merge 2 given linked lists using iteration algorithm.
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            }else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if(list1 != null){
            node.next = list1;
        }else {
            node.next = list2;
        }
        return dummy.next;
    }
}
