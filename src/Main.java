import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] arrowNumbers = new int[]{1, 2, 3};
        double[] arrowFloatingNumbers = {1.57, 7.654, 9.986};
        int[] tb = new int[30];
        tb[0] = 22;
        for (int i = 1; i < tb.length; i++) {
            tb[i] = tb[i - 1] + 4;

        }
        System.out.println("Task 2");
        for (int i = 0; i < (arrowNumbers.length -1); i++) {
            System.out.print(arrowNumbers[i] + ", ");
        }
        System.out.println(arrowNumbers[(arrowNumbers.length -1)]);
        for (int i = 0; i < (arrowFloatingNumbers.length-1); i++) {
            System.out.print(arrowFloatingNumbers[i] + ", ");
        }
        System.out.println(arrowFloatingNumbers[2]);
        for (int i = 0; i < (tb.length-1); i++) {
            System.out.print(tb[i] + " ");
        }
        System.out.println(tb[(tb.length-1)]);
        System.out.println("Task 3");
        for (int i = (arrowNumbers.length-1); i > 0; i--) {
            System.out.print(arrowNumbers[i] + ", ");
        }
        System.out.println(arrowNumbers[0]);
        for (int i = (arrowFloatingNumbers.length-1); i > 0; i--) {
            System.out.print(arrowFloatingNumbers[i] + ", ");
        }
        System.out.println(arrowFloatingNumbers[0]);
        for (int i = (tb.length-1); i > 0; i--) {
            System.out.print(tb[i] + " ");
        }
        System.out.println(tb[0]);
        System.out.println("Task 4");
        for (int i = 0; i < arrowNumbers.length; i++) {
            if ((arrowNumbers[i] % 2) != 0) {
                arrowNumbers[i]++;
            }
        }
        System.out.println(Arrays.toString(arrowNumbers));//
    }
}