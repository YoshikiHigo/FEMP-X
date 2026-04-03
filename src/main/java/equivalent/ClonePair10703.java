package equivalent;

public class ClonePair10703 {
    boolean method1(char ch) {
        int asci = ch;
        return ((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci <= 122));
    }

    boolean method2(char c) {
        return ((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9'));
    }
}
