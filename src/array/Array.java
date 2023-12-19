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
