package inequivalent;

public class ClonePair8209 {

    Number[] method1(Number[] state, Number next) {
        if (next == null) return state;
        if (state == null) return new Number[]{0d, 1L, next.doubleValue(), 0d};
        long n = state[1].longValue() + 1;
        double sk = state[2].doubleValue();
        double vk = state[3].doubleValue() + (Math.pow((sk - (n - 1) * next.doubleValue()), 2.0) / n) / (n - 1);
        sk += next.doubleValue();
        return new Number[]{vk / (n - 1), n, sk, vk};
    }

    Number[] method2(Number[] state, Number next) {
        if (next == null) return state;
        if (state == null) return new Number[]{0d, 1L, next.doubleValue(), 0d};
        long n = state[1].intValue() + 1;
        double sk = state[2].doubleValue();
        double vk = state[3].doubleValue() + (Math.pow((sk - (n - 1) * next.doubleValue()), 2.0) / n) / (n - 1);
        sk += next.doubleValue();
        return new Number[]{new Double(vk / n), n, sk, vk};
    }
}
