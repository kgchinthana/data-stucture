package org.example;

import org.example.arrays.Array;
import org.example.linkedLists.LinkedList;
import org.example.queues.Queue;
import org.example.stacks.Stack;

public class Main {
    public static void main(String[] args) {
        // Testing Array
        System.out.println("Testing Array:");
        Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();

        numbers.removeAt(2);
        numbers.print();

        System.out.println("Index of 40: " + numbers.indexOf(40));
        System.out.println("Index of 200: " + numbers.indexOf(200));
        System.out.println();

        // Testing LinkedLists
        System.out.println("Testing LinkedLists:");
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(8);

        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("Contains 6: " + list.contain(6));
        System.out.println("Contains 20: " + list.contain(20));

        list.removeFirst();
        list.removeLast();

        list.addLast(50);
        list.addFirst(1);

        System.out.println("Index of 50: " + list.indexOf(50));
        System.out.println("Contains 1: " + list.contain(1));
        System.out.println();

        // Testing String Reversal with Stack
        System.out.println("Reversing a String using Stack:");
        String str = "abcd";
        String reverseStr = "";
        java.util.Stack<Character> stringStack = new java.util.Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i));
        }

        while (!stringStack.isEmpty()) {
            reverseStr += stringStack.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseStr);
        System.out.println();

        // Testing Custom Stack
        System.out.println("Testing Stack:");
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println();

        // Testing Queue
        System.out.println("Testing Queue:");
        Queue queue = new Queue(5);

        System.out.println("Enqueueing 10, 20, 30...");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue: " + queue);

        System.out.println("Dequeueing...");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Is Full: " + queue.isFull());

        System.out.println("Enqueueing 40, 50, 60...");
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Queue: " + queue);

        System.out.println("Checking if queue is full...");
        System.out.println("Is Full: " + queue.isFull());

        System.out.println("Dequeueing all items...");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Queue after all dequeues: " + queue);
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
