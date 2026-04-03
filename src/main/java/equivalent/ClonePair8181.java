package equivalent;

public class ClonePair8181 {
    int method1(String text, int position, int howmany) {
        int counter = 0;
        int foundPos = -1;
        int lastcharwidth = 1;
        while ((position > 0) && (position < text.length()) && text.charAt(position) == ' ') {
            position++;
        }
        while ((counter <= howmany) && (position > 0) && (position < text.length())) {
            lastcharwidth = 1;
            if (text.charAt(position) == '\r') {
                break;
            }
            if (text.charAt(position) == '\t') {
                break;
            }
            if (text.charAt(position) == ' ') {
                break;
            }
            if ((text.charAt(position) == ' ') || ((position + 5) < text.length() && text.charAt(position) == '&' && text.charAt(position + 1) == 'n' && text.charAt(position + 2) == 'b' && text.charAt(position + 3) == 's' && text.charAt(position + 4) == 'p' && text.charAt(position + 5) == ';')) {
                if ((!(((position + 2) < text.length()) && (text.charAt(position + 2) == ' ') && (text.charAt(position + 1) >= 'A') && (text.charAt(position + 1) <= 'Z'))) || (text.charAt(position) != ' ')) {
                    counter++;
                }
                if (text.charAt(position) != ' ') {
                    position += 5;
                    lastcharwidth = 6;
                }
            }
            position++;
        }
        position -= lastcharwidth;
        return position;
    }

    int method2(String text, int position, int howmany) {
        int counter = 0;
        int lastcharwidth = 1;
        while ((position > 0) && (position < text.length()) && text.charAt(position) == ' ') {
            position++;
        }
        while ((counter <= howmany) && (position > 0) && (position < text.length())) {
            lastcharwidth = 1;
            if (text.charAt(position) == '\r') {
                break;
            }
            if (text.charAt(position) == '\t') {
                break;
            }
            if (text.charAt(position) == ' ') {
                break;
            }
            if ((text.charAt(position) == ' ') || ((position + 5) < text.length() && text.charAt(position) == '&' && text.charAt(position + 1) == 'n' && text.charAt(position + 2) == 'b' && text.charAt(position + 3) == 's' && text.charAt(position + 4) == 'p' && text.charAt(position + 5) == ';')) {
                if ((!(((position + 2) < text.length()) && (text.charAt(position + 2) == ' ') && (text.charAt(position + 1) >= 'A') && (text.charAt(position + 1) <= 'Z'))) || (text.charAt(position) != ' ')) {
                    counter++;
                }
                if (text.charAt(position) != ' ') {
                    position += 5;
                    lastcharwidth = 6;
                }
            }
            position++;
        }
        position -= lastcharwidth;
        return position;
    }
}
