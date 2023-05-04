package com.huaxiti.LeetCode;

import java.util.HashMap;

public class L92_反转链表2 {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//    }
public static void main(String[] args) {
    ListNode nodeSta = new ListNode(0);          //创建首节点
    ListNode nextNode;                           //声明一个变量用来在移动过程中指向当前节点
    nextNode=nodeSta;                            //指向首节点

    //创建链表
    for(int i=1;i<10;i++){
        ListNode node = new ListNode(i);         //生成新的节点
        nextNode.next=node;                      //把心节点连起来
        nextNode=nextNode.next;                  //当前节点往后移动
    } //当for循环完成之后 nextNode指向最后一个节点，

    nextNode=nodeSta;                            //重新赋值让它指向首节点
//    System.out.println(nextNode);

    System.out.println(reverseBetween(nextNode, 3, 5));
}

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }
}
