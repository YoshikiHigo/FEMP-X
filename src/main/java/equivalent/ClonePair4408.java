package equivalent;

public class ClonePair4408 {
    boolean method1(long number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        if (number == 3) return true;
        if (number % 3 == 0) return false;
        int y = 2;
        int x = (int) Math.sqrt(number);
        for (int i = 5; i <= x; i += y, y = 6 - y) {
            if (number % i == 0) return false;
        }
        return true;
    }

    boolean method2(long testNumber) {
        if (testNumber < 2) return false;
        if (testNumber == 2) return true;
        if (testNumber % 2 == 0) return false;
        long upperBorder = Math.round(Math.sqrt(testNumber));
        for (long i = 3; i <= upperBorder; i = i + 2) if (testNumber % i == 0) return false;
        return true;
    }
}
