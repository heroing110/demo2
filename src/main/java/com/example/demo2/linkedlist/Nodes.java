package com.example.demo2.linkedlist;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node append(Node node) {
        Node current = this;
        current.next = node;
        return current.next;
    }

    public static Node reverse(Node head) {
        Node pre = head;
        Node cur = head.getNext();
        Node tmp;
        while (cur != null) {
            tmp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = tmp;
        }

        head.setNext(null);
        return pre;
    }

    public static void addByValue(Node head, int indexData, int addData) {
        Node cur = head;
        Node next;
        while (cur != null) {
            next = cur.getNext();
            if (cur.getData() == indexData) {
                Node addNode = new Node(addData);
                cur.setNext(addNode);
                addNode.setNext(next);
                break;
            }

            cur = next;
        }
    }

    public static Node removeByValue(Node head,int removeData){
        if(head.getData()==removeData){
            Node newHead = head.getNext();
            head.setNext(null);
            return newHead;
        }

        Node pre = head;
        Node cur = head.getNext();
        while (cur!=null) {
            if(cur.getData()==removeData){
                Node tmp = cur.getNext();
                pre.setNext(tmp);
            }
            pre = cur;
            cur = cur.getNext();
        }
        return head;
    }

    public static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getNext();
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(new Node(2)).append(new Node(3));
        System.out.println("tail:" + head.getNext().getNext().getData());

        Node tail = Node.reverse(head);
        System.out.println("reverse_head:" + tail.getData());
        System.out.println("reverse_tail:" + tail.getNext().getNext().getData());


    }
}
