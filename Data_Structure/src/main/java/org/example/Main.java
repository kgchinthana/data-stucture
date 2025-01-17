package org.example;

import org.example.arrays.Array;
import org.example.linkedLists.LinkedList;

public class Main {
    public static void main(String[] args) {
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
    }
}
