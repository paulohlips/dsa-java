package Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(5);
        intStack.push(1);
        System.out.println(intStack.toString());
        int i = 0;
    }
}
