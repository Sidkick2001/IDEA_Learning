package git;

public class MaxValue {
    String maxInt(int ... numbers) {
        int result = 0;

        if (numbers.length == 0) {
            return "Чисел нет";
        }

        for (int i = 0; numbers.length < i; i++) {
            if (result < numbers[i]) {
                result = numbers[i];
            }
        }

        return "Максимальное число " + result;
    }
}
