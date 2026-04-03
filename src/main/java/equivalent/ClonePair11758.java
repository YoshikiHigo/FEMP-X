package equivalent;

public class ClonePair11758 {
    boolean method1(String exp) {
        if (exp == null) return false;
        exp = exp.trim().toLowerCase();
        return exp.equals("true") || exp.equals("yes") || exp.equals("1");
    }

    boolean method2(String string) {
        if (string == null) {
            return false;
        }
        string = string.trim();
        return ("true".equalsIgnoreCase(string) || "yes".equalsIgnoreCase(string) || "1".equalsIgnoreCase(string));
    }
}
