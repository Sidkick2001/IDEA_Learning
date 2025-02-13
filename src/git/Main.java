package git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        //Знакомство с Switch
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

        //Знакомство с StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("lol");
        sb.append("hhtps://");
        String str = sb.toString();
        System.out.println(str);
        sb.reverse(); //Перевенуть стринг в обратную сторону
    }
}
