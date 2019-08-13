package com.example.demo2.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NodeTest {

    Node head = new Node(1);
    @Before
    public void setUp() throws Exception {
        head.append(new Node(2)).append(new Node(3));
        System.out.println("before Option:");
        Node.print(head);
    }

    @Test
    public void addByValue() {
        Node.addByValue(head,2,4);
    }

    @Test
    public void removeByValue() {
        this.head = Node.removeByValue(head,2);
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("after option:");
        Node.print(head);
    }

    @Test
    public void testFinal() {
        List<String> list = List.of("a", "b");
//        List<Integer> list = Arrays.asList(1, 2, null);
        System.out.println(list);
    }
}