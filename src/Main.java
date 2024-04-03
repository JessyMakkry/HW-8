import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] arrow1 = new int[]{1, 2, 3};
        double[] arrow2 = {1.57, 7.654, 9.986};
        int[] tb = new int[30];
        tb[0] = 22;
        for (int i = 1; i < 30; i++) {
            tb[i] = tb[i - 1] + 4;

        }
        System.out.println("Task 2");
        for (int i = 0; i < 2; i++) {
            System.out.print(arrow1[i] + ", ");
        }
        System.out.println(arrow1[2]);
        for (int i = 0; i < 2; i++) {
            System.out.print(arrow2[i] + ", ");
        }
        System.out.println(arrow2[2]);
        for (int i = 0; i < 29; i++) {
            System.out.print(tb[i] + " ");
        }
        System.out.println(tb[29]);
        System.out.println("Task 3");
        for (int i = 2; i > 0; i--) {
            System.out.print(arrow1[i] + ", ");
        }
        System.out.println(arrow1[0]);
        for (int i = 2; i > 0; i--) {
            System.out.print(arrow2[i] + ", ");
        }
        System.out.println(arrow2[0]);
        for (int i = 29; i > 0; i--) {
            System.out.print(tb[i] + " ");
        }
        System.out.println(tb[0]);
        System.out.println("Task 4");
        int arrowEnd = arrow1.length;
        for (int i = 0; i < arrowEnd; i++) {
            if ((arrow1[i] % 2) != 0) {
                arrow1[i]++;
            }
        }
        System.out.println(Arrays.toString(arrow1));
    }
}