package com.huaxiti.LeetCode100;

import java.util.Scanner;

public class L21合并两个有序链表 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.nextLine().trim();
        String c = sc.next();
        String d = sc.nextLine().replace(" ","");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a.hashCode());

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val>=l2.val){
            l2.next = l1.next;
            l2 = l2.next;
            l1.next = l2;
        }
        return l1;
    }
}
