package array;

public class Array {
    private int position;
    private String[] array;

    public Array(int length) {
        this.array = new String[length];
    }

    public void push(String item) {
        this.doubleArrayLength();
        if(this.array.length > position) {
            this.array[position] = item;
            position++;
        }
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

    public int length() {
        return this.position;
    }

    public void doubleArrayLength() {
        if(position == array.length) {
            String[] newArray = new String[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            this.array = newArray;
        }
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
