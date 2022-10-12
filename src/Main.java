import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //1.
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //2.
        double[] numbers2 = {1.57, 7.654, 9.986};
        //3.
        boolean[] bools = new boolean[2];
        bools[0] = true;
        bools[1] = false;

        System.out.println("Задание 2");

        int [] numbers1 = {1, 2,3};
        double[] numbers3 = {1.57, 7.654, 9.986};
        boolean[] bools1 = new boolean[2];

        for (int b = 0; b < numbers1.length; b++) {
            System.out.print(numbers1[b]);
            if (b != numbers1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int b = 0; b < numbers3.length; b++) {
            System.out.print(numbers3[b]);
            if (b != numbers3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int b = 0; b < bools1.length; b++) {
            System.out.print(bools1[b]);
            if (b != bools1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Задание 3");
        for (int c =numbers1.length - 1; c >= 0; c--) {
            System.out.print(numbers1[c]);
            if (c !=0) {
                System.out.print(", ");

            }
        }
        System.out.println();
        for (int c = numbers3.length - 1; c >= 0; c--) {
            System.out.print(numbers3[c]);
            if (c !=0) {
                System.out.print(", ");

            }
        }
        System.out.println();
        for (int c =bools1.length - 1; c >= 0; c--) {
            System.out.print(bools1[c]);
            if (c !=0) {
                System.out.print(", ");

            }
        }
        System.out.println();


        System.out.println("Задание 4");
        int [] num = new int[3];
        num[0] = 1;
        num[1] = 2  ;
        num[2] = 3;
        for (int a = 0; a<num.length; a++){
            if (num[a] % 2 != 0){
                num[a] +=1;
            }
            System.out.println(num[a]);
        }


















    }
}