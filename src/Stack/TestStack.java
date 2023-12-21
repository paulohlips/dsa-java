package Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();
        System.out.println(intStack.isEmpty());
        intStack.stackUp(1);
        System.out.println(intStack.toString());
        System.out.println(intStack.isEmpty());
        int i = 0;
    }
}
