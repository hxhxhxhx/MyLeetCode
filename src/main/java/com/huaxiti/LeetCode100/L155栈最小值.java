package com.huaxiti.LeetCode100;

import java.util.Stack;

public class L155栈最小值 {


    private Node head;
    public L155栈最小值() {

    }

    public void push(int val) {
        if (head == null){
            head = new Node(val,val);
        }else {
            head = new Node(val,Math.min(val,head.min),head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node{
        private int val;
        private int min;
        private Node next;

        private Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }

        private Node(int val, int min){
            this(val,min,null);
        }
    }

}
