package array;

import java.util.Arrays;

public class Array {
    private int position;
    private String[] array;

    public Array(int length) {
        this.array = new String[length];
    }

    public boolean push(String item) {
        if(this.array.length > position) {
            this.array[position] = item;
            position++;
            return true;
        }
        return false;
    }

    public int length() {
        return this.position;
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

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i] != null) {
                s.append(array[i]);
            }

            if(i < position -1) {
                s.append(", ");
            }
        }

        s.append("]");

        return s.toString();
    }
}
