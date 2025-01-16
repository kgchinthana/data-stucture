package org.example.linkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    // Node class to represent elements in the linked list
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // Fields to store the first and last nodes
    private Node first;
    private Node last;

    // Add an item at the beginning of the list
    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    // Add an item at the end of the list
    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    // Remove the first item from the list
    public void removeFirst() {
        if (first == null) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
    }

    // Remove the last item from the list
    public void removeLast() {
        if (first == null) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var current = first;
        while (current.next != last) {
            current = current.next;
        }

        current.next = null;
        last = current;
    }

    // Check if the list contains a specific item
    public boolean contain(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get the index of a specific item in the list
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
}
