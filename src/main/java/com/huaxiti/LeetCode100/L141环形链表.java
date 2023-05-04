package com.huaxiti.LeetCode100;

import java.util.*;

public class L141环形链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(-4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;
        System.out.println(hasCycle(l1));
        System.out.println(hasCycle2(l1));
    }
    //使用hashset判断是否存在
    public static Boolean hasCycle(ListNode head) {
        Set<ListNode> m = new HashSet();
        while(head != null){
            if (!m.add(head)){
                return true;
            }
            head = head.next;

        }
        return false;
    }

    //使用快慢指针
    public static Boolean hasCycle2(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
