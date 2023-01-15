public class Main {
    public static void main(String[] args) {
        int [] weights =new int[3];
        weights [0] = 1;
        weights [1] = 2;
        weights [2] = 3;

        double [] weight = {1.57, 7.654, 9.986};
        int [] number = {33, 25, 11, 10};

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
 }

