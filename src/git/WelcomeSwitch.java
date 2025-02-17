package git;

    // Знакомство с Switch
public class WelcomeSwitch {

    private String result;

    String thisIsSwitch(int num) {
        result = switch (num) {
            case 3 -> "Ok";
            case 2 -> "Ok";
            case 5 -> {
                if ((num % 2) == 1) {
                    yield "What";
                } else yield "Ok";
            }
            default -> "Non okey";
        };
        System.out.println("Switch: " + result);
        return "";
    }

}
    // Знакомство с Switch
