package equivalent;

public class ClonePair4418 {
    boolean method1(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }

    boolean method2(long n) {
        if (n == 2) return true;
        if (n < 0 || n % 2 == 0) {
            return false;
        }
        long d = 3;
        long s = (long) Math.ceil(Math.sqrt(n));
        while (d <= s) {
            if (n % d == 0) return false;
            d += 2;
        }
        return true;
    }
}
