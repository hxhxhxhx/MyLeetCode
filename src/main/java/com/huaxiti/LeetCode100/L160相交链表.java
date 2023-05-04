package com.huaxiti.LeetCode100;

import java.util.HashSet;
import java.util.Set;

public class L160相交链表 {
    public static void main(String[] args) {
        Set<ListNode> s = new HashSet<>();

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<ListNode>();
        ListNode head = headA;
        while(head != null){
            s.add(head);
            head = head.next;
        }
        head = headB;
        while(head != null){
            if(s.contains(head)){
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        if(headA == null || headB == null){
            return null;
        }

        ListNode A = headA;
        ListNode B = headB;

        while(A != B){
            A = A==null ? headB : A.next;
            B = B==null ? headA : B.next;
        }
        return A;
    }
}
