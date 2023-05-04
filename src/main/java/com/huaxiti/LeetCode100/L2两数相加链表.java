package com.huaxiti.LeetCode100;

import java.util.ArrayList;
import java.util.Arrays;

public class L2两数相加链表 {
    public static void main(String[] args) {
        int[] ints1 = new int[]{2,4,3};
        int[] ints2 = new int[]{5,6,4};
        ListNode listNode = addTwoNumbers(getListNode(ints1), getListNode(ints2));
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(Arrays.toString(list.toArray()));

    }

    private static ListNode getListNode(int[] ints2) {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int temp = 0;
        while(l1 != null || l2 != null){
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int sum = n1 + n2 + temp;

            if (head == null){
                head = new ListNode(sum % 10);
                tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            temp = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (temp > 0){
            tail.next = new ListNode(temp);
        }
        return head;
    }


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }


}
