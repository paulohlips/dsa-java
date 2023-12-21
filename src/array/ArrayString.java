package array;

import base.StaticCollection;

public class ArrayString<T> extends StaticCollection<T> {
    private int position;
    private String[] array;

    public ArrayString(int length) {
        super(length);
    }

    public void push(String item, int index) {
        this.doubleArrayLength();
        if(index < 0 || index > this.array.length) {
            throw new IllegalArgumentException("Bad index!");
        }

        for (int i = this.array.length - 1; i > index; i--) {
            this.array[i] = this.array[i-1];
        }
        this.array[index] = item;
        position++;
    }


    public void pop(int index) {
        if(index < 0 || index > this.array.length) {
            throw new IllegalArgumentException("Bad index!");
        }

        for (int i = index; i < position; i++) {
            this.array[i] = this.array[i+1];
        }
        position--;
    }

    public String get(int index) throws IllegalArgumentException {
        if(index < 0 || index > this.array.length) {
            throw new IllegalArgumentException("Bad index!");
        }
        return this.array[index];
    }

    public int find(String item) {
        for (int i = 0; i < position; i++) {
            if(this.array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
}
