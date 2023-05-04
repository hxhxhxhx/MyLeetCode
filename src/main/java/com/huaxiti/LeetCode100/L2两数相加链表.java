package com.huaxiti.LeetCode100;

public class L2两数相加链表 {
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode l3 = new ListNode();
        if (l1 != null && l2 != null){
            l3.val = (l1.val+l2.val)%10;
            flag = (l1.val+l2.val)/10;
        }
        return null;
    }
}
