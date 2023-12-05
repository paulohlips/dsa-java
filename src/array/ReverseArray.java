package array;

public class ReverseArray {
    public void run (int[] input) {
        int len = input.length;
        int helper;

        for(int i = 0; i < len/2; i++) {
            helper = input[i];
            input[i] = input[len-i-1];
            input[len-i-1] = helper;
        }

        for (int num : input) {
            System.out.print(num);
        }
    }
}

