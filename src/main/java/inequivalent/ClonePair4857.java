package inequivalent;

public class ClonePair4857 {

    char method1(char input) {
        if (input == 12288) {
            input = (char) 32;
        } else if (input > 65280 && input < 65375) {
            input = (char) (input - 65248);
        } else if (input >= 'A' && input <= 'Z') {
            input += 32;
        }
        return input;
    }

    char method2(char c) {
        if (c >= 'A' && c <= 'Z') return (char) (c - 'A' + 'a');
        else return c;
    }
}
