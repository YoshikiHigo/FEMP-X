package inequivalent;

public class ClonePair12829 {

    boolean method1(String filename) {
        return filename.indexOf("\\") == -1 && filename.indexOf("/") == -1 && filename.indexOf(":") == -1 && filename.indexOf("*") == -1 && filename.indexOf("?") == -1 && filename.indexOf("<") == -1 && filename.indexOf(">") == -1 && filename.indexOf("|") == -1 && filename.indexOf("\"") == -1;
    }

    boolean method2(String input) {
        return input.matches("\\d.*") || (input.matches("\\W") && !input.equals("_")) || input.equals("");
    }
}
