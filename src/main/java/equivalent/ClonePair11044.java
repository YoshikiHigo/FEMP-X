package equivalent;

public class ClonePair11044 {
    boolean method1(String[] strings, String target) {
        boolean contains = false;
        if ((strings != null) && (strings.length > 0)) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i] != null) {
                    if (strings[i].equals(target)) {
                        contains = true;
                        break;
                    }
                } else {
                    if (target == null) {
                        contains = true;
                        break;
                    }
                }
            }
        }
        return contains;
    }

    boolean method2(String[] tokens, String target) {
        if (tokens != null) {
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i] == null) {
                    if (target == null) {
                        return true;
                    }
                } else {
                    if (tokens[i].equals(target)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
