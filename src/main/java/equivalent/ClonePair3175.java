package equivalent;

public class ClonePair3175 {
    String method1(String str, String separator, boolean returnNull) {
        if (str == null) return null;
        if (separator == null) return (returnNull ? null : str);
        int index = str.indexOf(separator);
        if (index >= 0) return str.substring(0, index);
        else return (returnNull ? null : str);
    }

    String method2(String str, String separator, boolean returnNull) {
        if (str == null) {
            return null;
        }
        if (separator == null) {
            return (returnNull ? null : str);
        }
        int index = str.indexOf(separator);
        if (index >= 0) {
            return str.substring(0, index);
        } else {
            return (returnNull ? null : str);
        }
    }
}
