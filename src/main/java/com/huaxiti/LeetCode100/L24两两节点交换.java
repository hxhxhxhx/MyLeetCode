package com.huaxiti.LeetCode100;
// head head.next head.next.next
public class L24两两节点交换 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        head = swapPairs(newHead.next);
        newHead = head;
        return newHead;
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = head.next;
            head.next = swapPairs(newHead.next);
            newHead.next = head;
            return newHead;
        }
    }

}
