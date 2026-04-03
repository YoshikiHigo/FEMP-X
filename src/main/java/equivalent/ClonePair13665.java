package equivalent;

public class ClonePair13665 {
    byte[] method1(String s) {
        byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            String j = String.valueOf(s.charAt(i));
            j = j + s.charAt(i + 1);
            b[i / 2] = (byte) Integer.parseInt(j, 16);
        }
        return b;
    }

    byte[] method2(String byteString) {
        byte[] result = new byte[byteString.length() / 2];
        for (int i = 0; i < byteString.length(); i += 2) {
            String toParse = byteString.substring(i, i + 2);
            result[i / 2] = (byte) Integer.parseInt(toParse, 16);
        }
        return result;
    }
}
