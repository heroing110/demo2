package com.example.demo2.examination;

public class ListNode<T> {
    private int index;
    private int size;
    private Node head;

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public void add(T data) {
            if (this.next == null) {
                this.next = new Node(data);
            } else {
                this.next.add(data);
            }
        }

        public void remove(Node pre, int index) {
            if (ListNode.this.index++ == index) {
                pre.next = this.next;
                this.next = null;
                ListNode.this.size++;
                return;
            } else {
                this.next.remove(this, index);
            }
        }

        public T get(int index) {
            if (ListNode.this.index++ == index) {
                return this.data;
            } else {
                return this.next.get(index);
            }
        }
    }

    public boolean isEmpty() {
        if (this.size == 0 || this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(T data) {
        if (this.isEmpty()) {
            this.head = new Node(data);
        } else {
            this.head.add(data);
        }
        this.size++;
    }

    public void remove(int index) {
        //是否空
        if (this.isEmpty()) {
            return;
        }
        //是否越界
        if (index < 0 || this.size <= index) {
            return;
        }
        //是否头节点
        if (index==0) {
            Node temp = this.head;
            this.head = this.head.next;
            temp.next=null;
            this.size--;
        }else{
            this.index=0;
            this.head.remove(this.head,index);
        }
    }

    public T get(int index){
        if(this.isEmpty()){
            return null;
        }

        this.index=0;
        return this.head.get(index);
    }

    public static void main(String[] args) {
        ListNode<Integer> listNode = new ListNode<>();
        listNode.add(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        System.out.println(listNode.get(2));
        listNode.remove(2);
        System.out.println(listNode.get(2));
    }
}
