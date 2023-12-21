package Stack;

import base.StaticCollection;

public class Stack<T> extends StaticCollection<T> {
    private T[] items;
    private int position;

    public Stack() {
        super(10);
    }
    public Stack(int length) {
        super(length);
    }

    public void stackUp(T item) {
        super.push(item);
    }

}
