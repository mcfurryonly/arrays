import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] weights = {1, 2, 3};

        for (int i = 0; i < weights.length; i++) {
            if ( weights[i] % 2 != 0){
                weights[i] += 1;
            }
        }
        System.out.println(Arrays.toString( weights));
    }
 }

