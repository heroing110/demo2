package com.example.demo2.linkedlist;

public class Node2<T> {
    Node2 next;
    T data;

    public Node2(T data){
        this.data = data;
    }

    public Node2 reverse(){
        Node2 pre = this;
        Node2 cur = this.next;
        Node2 temp;
        while (cur!=null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        //把原头结点next置空
        this.next = null;
        return pre;
    }

    public Node2 add(Node2 node){
        this.next = node;
        return node;
    }

    public void print(){
        Node2 cur = this;
        while (cur!=null){
            System.out.print(cur.data);
            cur = cur.next;
        }
        System.out.println();
    }

    public Node2 del(T t){
        if(this.data.equals(t)){
            Node2 head = this.next;
            this.next = null;
            return head;
        }
        Node2 pre = this;
        Node2 cur = this.next;
        Node2 temp;
        while (cur!=null){
            if(cur.data.equals(t)){
                pre.next = cur.next;
                return this;
            }
            pre =cur;
            cur = cur.next;
        }
        return this;
    }

    public static void main(String[] args) {
        Node2 head = new Node2(1);
        head.add(new Node2(2)).add(new Node2(3)).add(new Node2(4));
        head.print();
        Node2 newHead = head.reverse();
        newHead.print();
        Node2 del = newHead.del(4);
        del.print();
    }
}
