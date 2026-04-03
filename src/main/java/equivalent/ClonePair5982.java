package equivalent;

public class ClonePair5982 {
    String method1(int n) {
        if (n == 0) return "0000";
        if (n < 10) return "000" + n;
        if (n < 100) return "00" + n;
        if (n < 1000) return "0" + n;
        return String.valueOf(n);
    }

    String method2(int nb) {
        String res = "";
        if (nb < 10) res = "000";
        else if (nb < 100) res = "00";
        else if (nb < 1000) res = "0";
        return res + nb;
    }
}
