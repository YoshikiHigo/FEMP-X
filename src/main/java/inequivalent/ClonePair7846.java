package inequivalent;

public class ClonePair7846 {

    boolean method1(String input, int index) {
        while (index > 0) {
            index--;
            if (input.charAt(index) != '\\') return false;
            else if (index == 0 || input.charAt(index - 1) != '\\') return true;
            index--;
        }
        return false;
    }

    boolean method2(String element, int index) {
        if (index > 0) {
            return element.charAt(index - 1) == '\\';
        }
        return false;
    }
}
