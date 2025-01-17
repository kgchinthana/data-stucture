package org.example.queues;

import java.util.Arrays;

public class Queue {

    private int[] numbers;
    private int count;
    private int rear;
    private int front;

    public Queue(int capacity) {
        numbers = new int[capacity];
        count = 0;
        rear = 0;
        front = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        numbers[rear] = item;
        rear = (rear + 1) % numbers.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = numbers[front];
        numbers[front] = 0;
        front = (front + 1) % numbers.length;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return numbers[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == numbers.length;
    }

    @Override
    public String toString() {
        int[] content = new int[count];
        for (int i = 0; i < count; i++) {
            content[i] = numbers[(front + i) % numbers.length];
        }
        return Arrays.toString(content);
    }
}
