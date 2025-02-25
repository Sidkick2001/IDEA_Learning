package git;

public class WelcomeArray {

    String[] textArray = new String[5]; // 1 вариант
    // |0|1|2|3|4|

    /*
    textArray[0] = "Value1";
    textArray[1] = "Value2";
    textArray[3] = "Value2";
    */

    int[] numeric = {201, 232, 932}; // 2 вариант

    void doSomething(int... values){ // ... - если не знаю сколько придет на вход
        int result = values[0] + values[1];
        System.out.println("Массивы: " + result);
    }


    void iterateOverArray (){ // Нахождение среднего числа, типично пробежался по массиву - гибки вариант
        double sum = 0;
        for (int i = 0; i < numeric.length; i++) {
            sum = numeric[i] + sum;
        }
        System.out.println("Среднее число массива: " + sum / numeric.length);
    }

    void newIterateOverArray() { // Подходит только для пробежки по коллекции
        double sum = 0;
        for (int j : numeric) {
            sum += j;
        }
        System.out.println("Среднее с for-each: " + sum / numeric.length);

    }
}
