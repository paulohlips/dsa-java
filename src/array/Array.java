package array;

public class Array {
    private int position;
    private Object[] array;

    public Array(int length) {
        this.array = new Object[length];
    }

    public void push(Object item) {
        this.doubleArrayLength();
        if(this.array.length > position) {
            this.array[position] = item;
            position++;
        }
    }

    public void push(Object item, int index) {
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

    public int length() {
        return this.position;
    }

    public void doubleArrayLength() {
        if(position == array.length) {
            Object[] newArray = new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            this.array = newArray;
        }
    }

    public Object get(int index) throws IllegalArgumentException {
        if(index < 0 || index > this.array.length) {
            throw new IllegalArgumentException("Bad index!");
        }
        return this.array[index];
    }

    public int find(Object item) {
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
