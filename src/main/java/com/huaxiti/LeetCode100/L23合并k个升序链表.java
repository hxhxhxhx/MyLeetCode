//package com.huaxiti.LeetCode100;
//
//public class L23合并k个升序链表 {
//    public static void main(String[] args) {
//        int[][] list = {{1,4,5}, {1,3,4},{2,6}};
////        ListNode[] list = new ListNode[1,[2]];
//        mergeKLists(list);
//    }
//
//    public static ListNode mergeKLists(ListNode[] lists) {
//        Long start = System.currentTimeMillis();
//        ListNode listNode = null;
//        for (int i = 0; i < lists.length; i++){
//            listNode = merge2List(lists[i], listNode);
//        }
//        Long end = System.currentTimeMillis();
//        System.out.println(end-start);
//        return listNode;
//    }
//
//    public static ListNode merge2List(ListNode l1, ListNode l2){
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        if (l1.val < l2.val){
//            l1.next = merge2List(l1.next,l2);
//            return l1;
//        }else {
//            l2.next = merge2List(l1,l2.next);
//            return l2;
//        }
//    }
//}
