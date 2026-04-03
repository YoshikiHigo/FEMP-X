package equivalent;

public class ClonePair11383 {
    boolean method1(char character) {
        boolean check = false;
        if (character >= 'A' && character <= 'Z') check = true;
        else if (character >= 'a' && character <= 'z') check = true;
        return check;
    }

    boolean method2(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
