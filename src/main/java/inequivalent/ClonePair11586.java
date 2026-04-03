package inequivalent;

public class ClonePair11586 {

    String method1(String input, String oldString, String newString) {
        if (input == null || input.length() == 0 || input.indexOf(oldString) < 0) {
            return input;
        } else {
            int i = 0;
            int j = 0;
            int oldLength = oldString.length();
            StringBuffer buffer = new StringBuffer();
            while ((i = input.indexOf(oldString, i)) >= 0) {
                buffer.append(input, j, i).append(newString);
                j = (i += oldLength);
            }
            input = buffer.append(input.substring(j)).toString();
            buffer = null;
            return input;
        }
    }

    String method2(String input, String replace, String replacement) {
        if (replace.equals(replacement)) return input;
        int idx;
        if ((idx = input.indexOf(replace)) == -1) {
            return input;
        }
        boolean finished = false;
        while (!finished) {
            StringBuffer returning = new StringBuffer();
            while (idx != -1) {
                returning.append(input, 0, idx);
                returning.append(replacement);
                input = input.substring(idx + replace.length());
                idx = input.indexOf(replace);
            }
            returning.append(input);
            input = returning.toString();
            if ((idx = returning.indexOf(replace)) == -1) {
                finished = true;
            }
        }
        return input;
    }
}
