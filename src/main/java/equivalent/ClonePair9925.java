package equivalent;

public class ClonePair9925 {
    int method1(String text, int position) {
        int counter = 0;
        int foundPos = -1;
        int lastspacePos = 0;
        while ((counter < 16) && (position > 0) && (position < text.length())) {
            position--;
            if (text.charAt(position) == '\n') {
                break;
            }
            if (text.charAt(position) == '\t') {
                break;
            }
            if (text.charAt(position) == ' ') {
                break;
            }
            if (text.charAt(position) == ' ') {
                if (!(((position - 2) >= 0) && (text.charAt(position - 2) == ' ') && (text.charAt(position - 1) >= 'A') && (text.charAt(position - 1) <= 'Z'))) {
                    counter++;
                }
            }
        }
        if (text.charAt(position) == ' ') {
            position++;
        }
        return position;
    }

    int method2(String text, int position) {
        int counter = 0;
        while ((counter < 16) && (position > 0) && (position < text.length())) {
            position--;
            if (text.charAt(position) == '\n') {
                break;
            }
            if (text.charAt(position) == '\t') {
                break;
            }
            if (text.charAt(position) == ' ') {
                break;
            }
            if (text.charAt(position) == ' ') {
                if (!(((position - 2) >= 0) && (text.charAt(position - 2) == ' ') && (text.charAt(position - 1) >= 'A') && (text.charAt(position - 1) <= 'Z'))) {
                    counter++;
                }
            }
        }
        if (text.charAt(position) == ' ') {
            position++;
        }
        return position;
    }
}
