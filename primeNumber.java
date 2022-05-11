import java.util.ArrayList;

public class primeNumber {
    static void priNum(int number) {
        ArrayList<Integer> prinum = new ArrayList<Integer>();
        for (int j = 2; j < number; j++) { // 'i' is one of ' 2,3,...,number' steps
            boolean flag = false;
            for (int i = 2; i <= j / 2; ++i) {
                // condition for nonprime number
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                prinum.add(j);

        }
        System.out.println(prinum);
    }

    public static void main(String[] args) {
        priNum(200);
    }
}