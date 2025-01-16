package org.example;

import java.util.Arrays;

public class Array {

    int count;
    int[] numbers;

    public Array(int number){
        numbers = new int[number];
        count = 0;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void removeAt(int index){
        if ( index <0 || index >= count ) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        for ( int i = index; i < count - 1; i++ ){
            numbers[i] = numbers[i+1];
        }
        count--;
        print();
    }

    public void insert(int number){
        if(count == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            numbers = newNumbers;
        }
        numbers[count++] = number;
    }

    public  int indexOf(int number){
        for(int i = 0; i <= count-1;i++ ){
            if(numbers[i] == number){
                return  i;
            }
        }
        return -1;
    }



}
