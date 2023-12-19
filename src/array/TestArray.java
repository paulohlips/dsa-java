package array;

public class TestArray {
    public static void main(String[] args) throws Exception {
        Array array = new Array(3);
        array.push("Paulo");
        array.push("Henrique");
        array.push("James");
        array.push("Bond");

        System.out.println("length: " + array.length());
        System.out.println(array.toString());

        System.out.println(array.get(1));

        System.out.println(array.find("test"));

        array.push("Test", 0);
        int i = 0;
    }
}
