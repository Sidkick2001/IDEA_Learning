package git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        String result = switch (num) {
            case 3 ->  "Ok";
            case 2 ->  "Ok";
            case 5 -> {
                if ((num % 2) == 1) {
                  yield "What";
                } else yield "Ok";
            }
            default -> "Non okey";
        };
        System.out.println(result);
    }
}
