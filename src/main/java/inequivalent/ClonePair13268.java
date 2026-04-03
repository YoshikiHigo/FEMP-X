package inequivalent;

public class ClonePair13268 {

    boolean method1(String input) {
        return input.contains("/") || input.contains("\\") || input.contains(":") || input.contains("*") || input.contains("?") || input.contains("\"") || input.contains("<") || input.contains(">") || input.contains("|");
    }

    boolean method2(String option) {
        if (option.length() == 0) {
            return false;
        }
        return option.charAt(0) != '-';
    }
}
