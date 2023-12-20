package array;

public class TestArray {
    public static void main(String[] args) throws Exception {
        Array array = new Array(3);
        array.push("Paulo");
        array.push("Henrique");
        array.push("James");
        array.push("Bond");


        System.out.println("Array before pop " + array.length() + " " + array.toString());
        array.pop(4);
        System.out.println("Array after pop " + array.length() + " " + array.toString());
        int i = 0;
    }
}
