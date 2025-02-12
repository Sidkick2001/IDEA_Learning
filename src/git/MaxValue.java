package git;

public class MaxValue {
    int result;

    String maxInt(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (this.result < numbers[i]) {
                this.result = numbers[i];
            }
        }

        return "???????????? ????????" + this.result;
    }
}
