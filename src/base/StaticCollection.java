package base;

abstract public class StaticCollection<T> {
    private T[] items;
    private int position;

    public StaticCollection(int length) {
        items = (T[]) new Object[length];
    }

    public int position() {
        return  this.position();
    }

    public void push(T item) {
        this.doubleArrayLength();
        if(this.items.length > position) {
            this.items[position] = item;
            position++;
        }
    }

    protected void doubleArrayLength() {
        if(position == items.length) {
            T[] newArray = (T[]) new Object[items.length * 2];

            for (int i = 0; i < items.length; i++) {
                newArray[i] = items[i];
            }

            this.items = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i] != null) {
                s.append(items[i]);
            }

            if(i < position -1) {
                s.append(", ");
            }
        }

        s.append("]");

        return s.toString();
    }
}
