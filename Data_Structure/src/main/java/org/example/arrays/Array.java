package org.example.arrays;

public class Array {

    private int count;
    private int[] numbers;

    public Array(int size) {
        numbers = new int[size];
        count = 0;
    }

    public void insert(int number) {
        if (count == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            numbers = newNumbers;
        }
        numbers[count++] = number;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        for (int i = index; i < count - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        count--;
    }

    public int indexOf(int number) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
