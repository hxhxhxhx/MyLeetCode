package com.huaxiti.剑指;

import java.util.ArrayList;
import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNode(int[] ints2) {
        ListNode l2 = null;
        ListNode tail2 = null;
        for (int i : ints2){
            if (l2 == null) {
                l2 = tail2 = new ListNode(i);
            }else {
                tail2.next = new ListNode(i);
                tail2 = tail2.next;
            }
        }
        return l2;
    }

    public static String printListNode(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        return Arrays.toString(list.toArray());
    }
}