package Stack;

import base.StaticCollection;

public class Stack<T> extends StaticCollection<T> {
    private T[] items;
    private int position;

    public Stack(int length) {
        super(length);
    }


}
