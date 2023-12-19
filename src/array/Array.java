package array;

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
}
