package equivalent;

public class ClonePair11869 {
    boolean method1(char letra) {
        return (letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z');
    }

    boolean method2(char ch) {
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }
}
