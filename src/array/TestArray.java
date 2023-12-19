package array;

public class TestArray {
    public static void main(String[] args) throws Exception {
        Array array = new Array(13);
        array.push("Paulo");
        array.push("Henrique");

        System.out.println("length: " + array.length());
        int i = 0;
    }
}
