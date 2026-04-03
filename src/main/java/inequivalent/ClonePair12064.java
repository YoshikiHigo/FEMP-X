package inequivalent;

public class ClonePair12064 {

    boolean method1(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }

    boolean method2(char c) {
        return (Character.toLowerCase(c) == 'a') || (Character.toLowerCase(c) == 'e') || (Character.toLowerCase(c) == 'i') || (Character.toLowerCase(c) == 'o') || (Character.toLowerCase(c) == 'u');
    }
}
