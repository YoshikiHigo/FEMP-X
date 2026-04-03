package inequivalent;

public class ClonePair7380 {

    String method1(String text, int size, char padChar) {
        if (text == null) {
            return null;
        }
        final StringBuilder paddedText = new StringBuilder(size);
        while (paddedText.length() < size - text.length()) {
            paddedText.append(padChar);
        }
        paddedText.append(text);
        return paddedText.toString();
    }

    String method2(String text, int size, char padChar) {
        if (text == null) {
            return null;
        }
        final StringBuilder paddedText = new StringBuilder(size);
        paddedText.append(text);
        while (paddedText.length() < size) {
            paddedText.append(padChar);
        }
        return paddedText.toString();
    }
}
