package com.huaxiti.LeetCode100;

/**
 * 1.遍历
 * 2.弹栈
 * 3.快慢指针
 */
public class L19删除链表的倒数第N个节点 {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        for (int i = 5; i > 1; i--) {
            ListNode second = new ListNode(i);
            second.next = first.next;
            first.next = second;
        }

//        while (first != null){
//            System.out.println(first.val+" ");
//            first = first.next;
//        }
        ListNode listNode = removeNthFromEnd(first, 2);
        while (listNode != null){
            System.out.println(listNode.val+" ");
            listNode = listNode.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumpy = new ListNode(0,head);
        ListNode first = head;
        ListNode second = dumpy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dumpy.next;
        return ans;
    }
}
