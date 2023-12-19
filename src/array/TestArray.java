package array;

public class TestArray {
    public static void main(String[] args) throws Exception {
        Array array = new Array(13);
        array.push("Paulo");
        array.push("Henrique");
        array.push("James");
        array.push("Bond");

        System.out.println("length: " + array.length());
        System.out.println(array.toString());
        int i = 0;
    }
}
