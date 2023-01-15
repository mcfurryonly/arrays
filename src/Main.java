public class Main {
    public static void main(String[] args) {
        int [] weights = {1, 2, 3,};


        double [] weight = {1.57, 7.654, 9.986};
        int [] number = {33, 25, 11, 10};

        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
 }

