package Stack;

import base.StaticCollection;

public class Stack<T> extends StaticCollection<T> {

    public Stack() {
        super(10);
    }
    public Stack(int length) {
        super(length);
    }

    public void stackUp(T item) {
        super.push(item);
    }

    public  T getLastItem() {
        if(super.isEmpty()) {
            return null;
        }

        return items[position-1];
    }

}
