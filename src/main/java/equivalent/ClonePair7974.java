package equivalent;

public class ClonePair7974 {
    boolean method1(String a, String b) {
        if ((a == null || a.length() == 0) && (b == null || b.length() == 0)) return true;
        if (a == null) return false;
        return a.equals(b);
    }

    boolean method2(String string1, String string2) {
        boolean bIsEmpty1 = (string1 == null || string1.length() == 0);
        boolean bIsEmpty2 = (string2 == null || string2.length() == 0);
        if (bIsEmpty1 && bIsEmpty2) return true;
        if (bIsEmpty1 || bIsEmpty2) return false;
        return string1.equals(string2);
    }
}
