package Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(10);
        System.out.println(intStack.isEmpty());
        intStack.stackUp(1);
        intStack.stackUp(2);
        intStack.stackUp(3);
        System.out.println(intStack.toString());
        System.out.println(intStack.unstack());
        System.out.println(intStack.toString());
        System.out.println(intStack.getLastItem());
        int i = 0;
    }
}
